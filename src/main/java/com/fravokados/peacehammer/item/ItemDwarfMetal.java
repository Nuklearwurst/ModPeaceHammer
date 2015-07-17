package com.fravokados.peacehammer.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

/**
 * @author Nuklearwurst
 */
public class ItemDwarfMetal extends ItemPHMultiType {

	@Override
	public IIcon getIconFromDamage(int p_77617_1_) {
		return super.getIconFromDamage(p_77617_1_);
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tabs, List list) {

	}

	@Override
	protected String getUnlocalizedNameForItem(ItemStack stack) {
		return null;
	}

	@Override
	public void registerIcons(IIconRegister reg) {

	}
}
