package com.fravokados.peacehammer.item.block;

import com.fravokados.peacehammer.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

/**
 * @author Nuklearwurst
 */
public class ItemBlockPeaceStone extends ItemPHBlockMultiType {

	public ItemBlockPeaceStone(Block block) {
		super(block);
	}

	@Override
	protected String getUnlocalizedNameForItem(ItemStack stack) {
		switch (stack.getItemDamage()) {
			case 0:
				return Strings.Block.BAD_STONE;
			case 1:
				return Strings.Block.BLOOD_STONE;
			case 2:
				return Strings.Block.ROAD_STONE;
			case 3:
				return Strings.Block.RUNE_STONE;
			case 4:
				return Strings.Block.DWARF_STONE;
		}
		return Strings.Block.PEACE_STONE;
	}
}
