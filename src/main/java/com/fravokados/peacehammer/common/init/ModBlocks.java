package com.fravokados.peacehammer.common.init;

import com.fravokados.peacehammer.block.*;
import com.fravokados.peacehammer.item.*;
import com.fravokados.peacehammer.lib.Reference;
import com.fravokados.peacehammer.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(value = Reference.MOD_ID)
public class ModBlocks {

	////////////////////
	// General Blocks //
	////////////////////
	@GameRegistry.ObjectHolder(Strings.Block.PEACE_STONE)
	public static final BlockPH PEACE_STONE = new BlockPeaceStone();
	@GameRegistry.ObjectHolder(Strings.Block.PEACE_SAND)
	public static final BlockPH PEACE_SAND = new BlockPeaceSand();
	@GameRegistry.ObjectHolder(Strings.Block.PEACE_DIRT)
	public static final BlockPH PEACE_DIRT = new BlockPeaceDirt();
	@GameRegistry.ObjectHolder(Strings.Block.PEACE_GRASS)
	public static final BlockPH PEACE_GRASS = new BlockPeaceGrass();

	@GameRegistry.ObjectHolder(Strings.Block.METAL_BLOCK)
	public static final BlockPH METAL_BLOCK = new BlockDwarfMetal();
	@GameRegistry.ObjectHolder(Strings.Block.METAL_ORE)
	public static final BlockPH METAL_ORE = new BlockDwarfOre();

	@GameRegistry.ObjectHolder(Strings.Block.STATUE)
	public static final BlockPH STATUE = new BlockDwarfStatue();


	@GameRegistry.ObjectHolder(Strings.Block.BEER_KEG)
	public static final BlockPH BEER_KEG = new BlockBeerkeg();

	@GameRegistry.ObjectHolder(Strings.Block.CAVE_MOSS)
	public static final BlockPH CAVE_MOSS = new BlockCaveMoss();

	@GameRegistry.ObjectHolder(Strings.Block.CAVE_MOSS_LAMP)
	public static final BlockPH CAVE_MOSS_LAMP = new BlockCaveMossLamp();

	@GameRegistry.ObjectHolder(Strings.Block.DWARF_FORGE)
	public static final BlockPH DWARF_FORGE = new BlockDwarfForge();


	//////////////////
	// Debug Blocks //
	//////////////////
	
	public static void registerBlocks() {
		////////////////////
		// General Blocks //
		////////////////////
		GameRegistry.registerBlock(PEACE_STONE, ItemBlockPeaceStone.class, Strings.Block.PEACE_STONE);
		GameRegistry.registerBlock(PEACE_SAND, ItemBlockPeaceSand.class, Strings.Block.PEACE_SAND);
		GameRegistry.registerBlock(PEACE_DIRT, ItemBlockPeaceDirt.class, Strings.Block.PEACE_DIRT);
		GameRegistry.registerBlock(PEACE_GRASS, ItemBlockPeaceGrass.class, Strings.Block.PEACE_GRASS);

		GameRegistry.registerBlock(METAL_BLOCK, ItemBlockMetalBlock.class, Strings.Block.METAL_BLOCK);
		GameRegistry.registerBlock(METAL_ORE, ItemBlockMetalOre.class, Strings.Block.METAL_ORE);

		GameRegistry.registerBlock(STATUE, ItemBlockStatue.class, Strings.Block.STATUE);

		GameRegistry.registerBlock(BEER_KEG, Strings.Block.BEER_KEG);
		GameRegistry.registerBlock(CAVE_MOSS, Strings.Block.CAVE_MOSS);
		GameRegistry.registerBlock(CAVE_MOSS_LAMP, Strings.Block.CAVE_MOSS_LAMP);
		GameRegistry.registerBlock(DWARF_FORGE, Strings.Block.DWARF_FORGE);

		//////////////////
		// Debug Blocks //
		//////////////////
	}
	
	public static void registerTileEntities() {
	}
}
