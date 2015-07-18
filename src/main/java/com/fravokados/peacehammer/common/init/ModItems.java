package com.fravokados.peacehammer.common.init;

import com.fravokados.peacehammer.item.*;
import com.fravokados.peacehammer.lib.Reference;
import com.fravokados.peacehammer.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemTool;

/**
 * @author Nuklearwurst
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

	@GameRegistry.ObjectHolder(Strings.Item.DWARF_METAL)
	public static final ItemPH PEACE_INGOT = new ItemDwarfMetal();

	@GameRegistry.ObjectHolder(Strings.Item.PEACE_BEER)
	public static final ItemPH PEACE_BEER = new ItemBeer();

	@GameRegistry.ObjectHolder(Strings.Item.INGREDIENT)
	public static final ItemPH INGREDIENT = new ItemIngredient();

	@GameRegistry.ObjectHolder(Strings.Item.DWARF_AXE)
	public static final ItemTool DWARF_AXE = new ItemDwarfAxe();

	@GameRegistry.ObjectHolder(Strings.Item.DWARF_PICKAXE)
	public static final ItemTool DWARF_PICKAXE = new ItemDwarfPickaxe();

	@GameRegistry.ObjectHolder(Strings.Item.DWARF_SHOVEL)
	public static final ItemTool DWARF_SHOVEL = new ItemDwarfShovel();

	public static void registerItems() {

		GameRegistry.registerItem(PEACE_INGOT, Strings.Item.DWARF_METAL);
		GameRegistry.registerItem(PEACE_BEER, Strings.Item.PEACE_BEER);
		GameRegistry.registerItem(INGREDIENT, Strings.Item.INGREDIENT);
		GameRegistry.registerItem(DWARF_AXE, Strings.Item.DWARF_AXE);
		GameRegistry.registerItem(DWARF_PICKAXE, Strings.Item.DWARF_PICKAXE);
		GameRegistry.registerItem(DWARF_SHOVEL, Strings.Item.DWARF_SHOVEL);
	}
}
