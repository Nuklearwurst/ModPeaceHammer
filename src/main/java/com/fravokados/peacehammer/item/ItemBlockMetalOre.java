package com.fravokados.peacehammer.item;

import com.fravokados.peacehammer.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

/**
 * @author Nuklearwurst
 */
public class ItemBlockMetalOre extends ItemPHBlockMultiType {

	public ItemBlockMetalOre(Block block) {
		super(block);
	}

	@Override
	protected String getUnlocalizedNameForItem(ItemStack stack) {
		switch (stack.getItemDamage()) {
			case 0:
				return Strings.Block.GROMRIL_ORE;
			case 1:
				return Strings.Block.OATH_GOLD_ORE;
		}
		return Strings.Block.METAL_ORE;
	}
}
