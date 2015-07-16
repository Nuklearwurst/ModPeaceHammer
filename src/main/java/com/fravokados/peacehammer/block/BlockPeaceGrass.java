package com.fravokados.peacehammer.block;

import com.fravokados.peacehammer.common.init.ModBlocks;
import com.fravokados.peacehammer.lib.Strings;
import com.fravokados.peacehammer.lib.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

import java.util.List;

/**
 * @author Nuklearwurst
 */
public class BlockPeaceGrass extends BlockPH {
	/**
	 * 0: Bad Sand
	 * 1: Blood Sand
	 */
	private static final int SUB_BLOCK_COUNT = 2;

	private IIcon[] icons = new IIcon[SUB_BLOCK_COUNT];
	private IIcon[] icons_top = new IIcon[SUB_BLOCK_COUNT];
	private IIcon icon_snow;

	public BlockPeaceGrass() {
		super(Material.grass);
		setHardness(0.6F);
		setStepSound(soundTypeGrass);
	}

	@Override
	public int damageDropped(int meta) {
		return meta;
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		if (meta >= SUB_BLOCK_COUNT) {
			meta = 0;
		}
		return side == 1 ? icons_top[meta] : side == 0 ? ModBlocks.PEACE_DIRT.getIcon(side, meta) : icons[meta];
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side) {
		if(side > 1) {
			Material material = world.getBlock(x, y + 1, z).getMaterial();
			if(material == Material.snow || material == Material.craftedSnow) {
				return icon_snow;
			}
		}
		return getIcon(side, world.getBlockMetadata(x, y, z));
	}

	@Override
	public void registerBlockIcons(IIconRegister reg) {
		icons[0] = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Block.MAD_GRASS);
		icons[1] = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Block.DRY_GRASS);

		icons_top[0] = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Block.MAD_GRASS + "_top");
		icons_top[1] = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Block.DRY_GRASS + "_top");

		icon_snow = reg.registerIcon("grass_side_snowed");
	}

	@SuppressWarnings("unchecked")
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < SUB_BLOCK_COUNT; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}
}
