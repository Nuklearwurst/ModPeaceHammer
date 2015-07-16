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

		//////////////////
		// Debug Blocks //
		//////////////////
	}
	
	public static void registerTileEntities() {
	}
}
