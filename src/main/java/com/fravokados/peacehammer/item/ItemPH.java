package com.fravokados.peacehammer.item;

import com.fravokados.peacehammer.ModPeaceHammer;
import com.fravokados.peacehammer.lib.Textures;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemPH extends Item {

	public ItemPH() {
		super();
		this.setCreativeTab(ModPeaceHammer.CREATIVE_TABS);
	}

	public ItemPH(String name) {
		this();
		this.setUnlocalizedName(name);
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("item.%s%s", Textures.MOD_ASSET_DOMAIN, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	public String getUnlocalizedName(ItemStack s) {
		return String.format("item.%s%s", Textures.MOD_ASSET_DOMAIN, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	public void registerIcons(IIconRegister reg) {
		itemIcon = reg.registerIcon(getUnwrappedUnlocalizedName(getUnlocalizedName()));
	}
}
