package com.fravokados.peacehammer.item;

import com.fravokados.peacehammer.lib.Textures;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * @author Nuklearwurst
 */
public abstract class ItemPHBlockMultiType extends ItemBlock {

	public ItemPHBlockMultiType(Block block) {
		super(block);
		this.setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int damage) {
		return damage;
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

	@Override
	public String getUnlocalizedName() {
		//Using tile here, as it is an itemBlock
		return String.format("tile.%s%s", Textures.MOD_ASSET_DOMAIN, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	public String getUnlocalizedName(ItemStack s) {
		//Using tile here, as it is an itemBlock
		return String.format("tile.%s%s", Textures.MOD_ASSET_DOMAIN, getUnwrappedUnlocalizedName(getUnlocalizedNameForItem(s)));
	}

	protected abstract String getUnlocalizedNameForItem(ItemStack stack);
}
