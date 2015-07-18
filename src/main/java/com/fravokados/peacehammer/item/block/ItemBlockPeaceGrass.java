package com.fravokados.peacehammer.item.block;

import com.fravokados.peacehammer.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

/**
 * @author Nuklearwurst
 */
public class ItemBlockPeaceGrass extends ItemPHBlockMultiType {

	public ItemBlockPeaceGrass(Block block) {
		super(block);
	}

	@Override
	protected String getUnlocalizedNameForItem(ItemStack stack) {
		switch (stack.getItemDamage()) {
			case 0:
				return Strings.Block.MAD_GRASS;
			case 1:
				return Strings.Block.DRY_GRASS;
		}
		return Strings.Block.PEACE_GRASS;
	}
}
