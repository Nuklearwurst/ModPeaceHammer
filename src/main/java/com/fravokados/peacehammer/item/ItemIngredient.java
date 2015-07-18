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
public class ItemIngredient extends ItemPHMultiType {

	private static final int SUB_TYPES = 6;
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
				return Strings.Item.BROWN_MALT;
			case 1:
				return Strings.Item.GREEN_MALT;
			case 2:
				return Strings.Item.GRINDED_MALT;
			case 3:
				return Strings.Item.HOPS;
			case 4:
				return Strings.Item.MASH;
			case 5:
				return Strings.Item.YEAST;
			default:
				return Strings.Item.INGREDIENT;
		}
	}

	@Override
	public void registerIcons(IIconRegister reg) {
		icons[0] = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Item.BROWN_MALT);
		icons[1] = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Item.GREEN_MALT);
		icons[2] = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Item.GRINDED_MALT);
		icons[3] = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Item.HOPS);
		icons[4] = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Item.MASH);
		icons[5] = reg.registerIcon(Textures.MOD_ASSET_DOMAIN + Strings.Item.YEAST);
	}

	@Override
	public IIcon getIconFromDamage(int damage) {
		if(damage >= SUB_TYPES) {
			damage = 0;
		}
		return icons[damage];
	}
}
