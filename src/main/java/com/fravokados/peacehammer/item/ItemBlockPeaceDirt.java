package com.fravokados.peacehammer.item;

import com.fravokados.peacehammer.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

/**
 * @author Nuklearwurst
 */
public class ItemBlockPeaceDirt extends ItemPHBlockMultiType {

	public ItemBlockPeaceDirt(Block block) {
		super(block);
	}

	@Override
	protected String getUnlocalizedNameForItem(ItemStack stack) {
		switch (stack.getItemDamage()) {
			case 0:
				return Strings.Block.MAD_DIRT;
			case 1:
				return Strings.Block.DRY_DIRT;
		}
		return Strings.Block.PEACE_DIRT;
	}
}
