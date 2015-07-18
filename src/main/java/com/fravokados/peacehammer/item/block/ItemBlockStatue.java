package com.fravokados.peacehammer.item.block;

import com.fravokados.peacehammer.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

/**
 * @author Nuklearwurst
 */
public class ItemBlockStatue extends ItemPHBlockMultiType {

	public ItemBlockStatue(Block block) {
		super(block);
	}

	@Override
	protected String getUnlocalizedNameForItem(ItemStack stack) {
		switch (stack.getItemDamage()) {
			case 0:
				return Strings.Block.KING_STONE;
			case 1:
				return Strings.Block.BAD_TOTEM;
			case 2:
				return Strings.Block.GYRO_COPTER;
		}
		return Strings.Block.STATUE;
	}
}
