package com.fravokados.peacehammer.block;

import com.fravokados.peacehammer.lib.Strings;
import com.fravokados.peacehammer.lib.Textures;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

/**
 * @author Nuklearwurst
 */
public class BlockDwarfMetal extends BlockPH {


	/**
	 * 0: Bad Sand
	 * 1: Blood Sand
	 */
	private static final int SUB_BLOCK_COUNT = 2;

	private IIcon[] icons = new IIcon[SUB_BLOCK_COUNT];


	public BlockDwarfMetal() {
		super(Material.iron, Strings.Block.METAL_BLOCK);
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
		icons[0] = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Block.GROMRIL_BLOCK);
		icons[1] = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Block.OATH_GOLD_BLOCK);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		for(int i = 0; i < SUB_BLOCK_COUNT; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public MapColor getMapColor(int meta) {
		if(meta == 0) {
			return MapColor.ironColor;
		} else {
			return MapColor.goldColor;
		}
	}
}
