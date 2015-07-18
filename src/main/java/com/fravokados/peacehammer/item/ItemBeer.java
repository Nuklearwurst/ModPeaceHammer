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
public class ItemBeer extends ItemPHMultiType {

	private static final int SUB_TYPES = 3;
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
				return Strings.Item.EMPTY_TANKARD;
			case 1:
				return Strings.Item.BEER;
			case 2:
				return Strings.Item.DWARVEN_BEER;
			default:
				return Strings.Item.PEACE_BEER;
		}
	}

	@Override
	public void registerIcons(IIconRegister reg) {
		icons[0] = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Item.EMPTY_TANKARD);
		icons[1] = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Item.BEER);
		icons[2] = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Item.DWARVEN_BEER);
	}

	@Override
	public IIcon getIconFromDamage(int damage) {
		if(damage >= SUB_TYPES) {
			damage = 0;
		}
		return icons[damage];
	}
}
