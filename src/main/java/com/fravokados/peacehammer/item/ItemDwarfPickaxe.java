package com.fravokados.peacehammer.item;

import com.fravokados.peacehammer.ModPeaceHammer;
import com.fravokados.peacehammer.lib.Strings;
import com.fravokados.peacehammer.lib.Textures;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

/**
 * @author Nuklearwurst
 */
public class ItemDwarfPickaxe extends ItemPickaxe {

	public ItemDwarfPickaxe() {
		super(ToolMaterial.IRON);
		setMaxDamage(ToolMaterial.EMERALD.getMaxUses() * 2);
		this.setCreativeTab(ModPeaceHammer.CREATIVE_TABS);
		this.setUnlocalizedName(Strings.Item.DWARF_PICKAXE);
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
