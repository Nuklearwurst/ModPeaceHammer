package com.fravokados.peacehammer.item;

import com.fravokados.peacehammer.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

/**
 * @author Nuklearwurst
 */
public class ItemBlockPeaceSand extends ItemPHBlockMultiType {

	public ItemBlockPeaceSand(Block block) {
		super(block);
	}

	@Override
	protected String getUnlocalizedNameForItem(ItemStack stack) {
		switch (stack.getItemDamage()) {
			case 0:
				return Strings.Block.BAD_SAND;
			case 1:
				return Strings.Block.BLOOD_SAND;
		}
		return Strings.Block.PEACE_SAND;
	}
}
