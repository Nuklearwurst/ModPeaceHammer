package com.fravokados.peacehammer.item.block;

import com.fravokados.peacehammer.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

/**
 * @author Nuklearwurst
 */
public class ItemBlockMetalBlock extends ItemPHBlockMultiType {

	public ItemBlockMetalBlock(Block block) {
		super(block);
	}

	@Override
	protected String getUnlocalizedNameForItem(ItemStack stack) {
		switch (stack.getItemDamage()) {
			case 0:
				return Strings.Block.GROMRIL_BLOCK;
			case 1:
				return Strings.Block.OATH_GOLD_BLOCK;
		}
		return Strings.Block.METAL_BLOCK;
	}
}
