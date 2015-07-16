package com.fravokados.peacehammer.block;

import com.fravokados.peacehammer.lib.Strings;
import com.fravokados.peacehammer.lib.Textures;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

/**
 * @author Nuklearwurst
 */
public class BlockBeerkeg extends BlockPH {

	private IIcon icon_bottom;
	private IIcon icon_top;
	private IIcon icon_front;

	public BlockBeerkeg() {
		super(Material.wood, Strings.Block.BEER_KEG);
		this.setHardness(2.0F);
		this.setStepSound(soundTypeWood);
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		return side == 1 ? this.icon_top : (side == 0 ? this.icon_bottom : (side != meta ? this.blockIcon : this.icon_front));
	}

	@Override
	public void onBlockAdded(World world, int x, int y, int z) {
		super.onBlockAdded(world, x, y, z);
//		this.setFacingOnWorldGen(world, x, y, z);
	}

	private void setFacingOnWorldGen(World world, int x, int y, int z) {
		if (!world.isRemote) {
			Block block = world.getBlock(x, y, z - 1);
			Block block1 = world.getBlock(x, y, z + 1);
			Block block2 = world.getBlock(x - 1, y, z);
			Block block3 = world.getBlock(x + 1, y, z);
			byte b0 = 3;

			if (block.func_149730_j() && !block1.func_149730_j()) {
				b0 = 3;
			}

			if (block1.func_149730_j() && !block.func_149730_j()) {
				b0 = 2;
			}

			if (block2.func_149730_j() && !block3.func_149730_j()) {
				b0 = 5;
			}

			if (block3.func_149730_j() && !block2.func_149730_j()) {
				b0 = 4;
			}

			world.setBlockMetadataWithNotify(x, y, z, b0, 2);
		}
	}

	@Override
	public void registerBlockIcons(IIconRegister reg) {
		this.blockIcon = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Block.BEER_KEG + "_side");
		this.icon_bottom = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Block.BEER_KEG + "_bottom");
		this.icon_top = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Block.BEER_KEG + "_top");
		this.icon_front = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Block.BEER_KEG + "_front");
	}

	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLivingBase, ItemStack stack) {
		int orientation = MathHelper.floor_double((double) (entityLivingBase.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

		switch (orientation) {
			case 0:
				world.setBlockMetadataWithNotify(x, y, z, 2, 2);
				break;
			case 1:
				world.setBlockMetadataWithNotify(x, y, z, 5, 2);
				break;
			case 2:
				world.setBlockMetadataWithNotify(x, y, z, 3, 2);
				break;
			case 3:
				world.setBlockMetadataWithNotify(x, y, z, 4, 2);
				break;
		}
	}
}
