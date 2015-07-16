package com.fravokados.peacehammer.block;

import com.fravokados.peacehammer.lib.Strings;
import com.fravokados.peacehammer.lib.Textures;
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
public class BlockPeaceStone extends BlockPH {

	/**
	 * 0: Bad Stone
	 * 1: Blood Stone
	 * 2: Road Stone
	 * 3: Rune Stone
	 * 4: Dwarf Stone
	 */
	private static final int SUB_BLOCK_COUNT = 5;

	private IIcon[] icons = new IIcon[SUB_BLOCK_COUNT];

	public BlockPeaceStone() {
		super(Material.rock, Strings.Block.PEACE_STONE);
		setHardness(1.5F);
		setResistance(10.0F);
		setStepSound(soundTypePiston);
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
		icons[0] = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Block.BAD_STONE);
		icons[1] = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Block.BLOOD_STONE);
		icons[2] = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Block.ROAD_STONE);
		icons[3] = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Block.RUNE_STONE);
		icons[4] = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Block.DWARF_STONE);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		for(int i = 0; i < SUB_BLOCK_COUNT; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public int damageDropped(int meta) {
		return meta;
	}
}
