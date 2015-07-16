package com.fravokados.peacehammer.block;

import com.fravokados.peacehammer.lib.Strings;
import com.fravokados.peacehammer.lib.Textures;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

/**
 * @author Nuklearwurst
 */
public class BlockPeaceSand extends BlockPH {

	/**
	 * 0: Bad Sand
	 * 1: Blood Sand
	 */
	private static final int SUB_BLOCK_COUNT = 2;

	private IIcon[] icons = new IIcon[SUB_BLOCK_COUNT];

	public BlockPeaceSand() {
		super(Material.sand);
		setHardness(0.5F);
		setStepSound(soundTypeSand);
	}

	@Override
	public int damageDropped(int meta) {
		return meta;
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		if(meta >= SUB_BLOCK_COUNT) {
			meta = 0;
		}
		return icons[meta];
	}

	@Override
	public void registerBlockIcons(IIconRegister reg) {
		icons[0] = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Block.BAD_SAND);
		icons[1] = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Block.BLOOD_SAND);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		for(int i = 0; i < SUB_BLOCK_COUNT; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public void onBlockAdded(World world, int x, int y, int z) {
		world.scheduleBlockUpdate(x, y, z, this, this.tickRate(world));
	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
		world.scheduleBlockUpdate(x, y, z, this, this.tickRate(world));
	}

	@Override
	public void updateTick(World world, int x, int y, int z, Random rand) {
		if (!world.isRemote) {
			this.fall(world, x, y, z);
		}
	}

	private void fall(World world, int x, int y, int z) {
		if (BlockFalling.func_149831_e(world, x, y - 1, z) && y >= 0) {
			byte loadingRange = 32;

			if (!BlockFalling.fallInstantly && world.checkChunksExist(x - loadingRange, y - loadingRange, z - loadingRange, x + loadingRange, y + loadingRange, z + loadingRange)) {
				if (!world.isRemote) {
					EntityFallingBlock entityfallingblock = new EntityFallingBlock(world, (double) ((float) x + 0.5F), (double) ((float) y + 0.5F), (double) ((float) z + 0.5F), this, world.getBlockMetadata(x, y, z));
					world.spawnEntityInWorld(entityfallingblock);
				}
			} else {
				world.setBlockToAir(x, y, z);

				while (BlockFalling.func_149831_e(world, x, y - 1, z) && y > 0) {
					--y;
				}

				if (y > 0) {
					world.setBlock(x, y, z, this);
				}
			}
		}
	}

	@Override
	public int tickRate(World p_149738_1_) {
		return 2;
	}

}
