package com.fravokados.peacehammer.item;

import com.fravokados.peacehammer.lib.Strings;
import com.fravokados.peacehammer.lib.Textures;
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

	private static final int SUB_TYPES = 2;
	private IIcon[] icons = new IIcon[SUB_TYPES];

	@SuppressWarnings("unchecked")
	@Override
	public void getSubItems(Item item, CreativeTabs tabs, List list) {
		for(int i = 0; i < SUB_TYPES; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	protected String getUnlocalizedNameForItem(ItemStack stack) {
		switch (stack.getItemDamage()) {
			case 0:
				return Strings.Item.GROMRIL_INGOT;
			case 1:
				return Strings.Item.OATH_GOLD_INGOT;
			default:
				return Strings.Item.DWARF_METAL;
		}
	}

	@Override
	public void registerIcons(IIconRegister reg) {
		icons[0] = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Item.GROMRIL_INGOT);
		icons[1] = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Item.OATH_GOLD_INGOT);
	}

	@Override
	public IIcon getIconFromDamage(int damage) {
		if(damage >= SUB_TYPES) {
			damage = 0;
		}
		return icons[damage];
	}
}
