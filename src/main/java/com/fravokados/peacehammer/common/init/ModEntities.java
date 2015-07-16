package com.fravokados.peacehammer.common.init;

import com.fravokados.peacehammer.ModPeaceHammer;
import com.fravokados.peacehammer.lib.util.LogHelper;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;

public class ModEntities {

	public static int INTERNAL_IDS = 0;

	@SuppressWarnings({"unused", "deprecation", "UnusedAssignment"})
	public static void init() {
		//normal biomes
		BiomeGenBase[] forest = BiomeDictionary.getBiomesForType(BiomeDictionary.Type.FOREST);
		BiomeGenBase[] hills = BiomeDictionary.getBiomesForType(BiomeDictionary.Type.HILLS);
		BiomeGenBase[] desert = BiomeDictionary.getBiomesForType(BiomeDictionary.Type.DESERT);
		BiomeGenBase[] mountain = BiomeDictionary.getBiomesForType(BiomeDictionary.Type.MOUNTAIN);
		BiomeGenBase[] jungle = BiomeDictionary.getBiomesForType(BiomeDictionary.Type.JUNGLE);
		BiomeGenBase[] magic = BiomeDictionary.getBiomesForType(BiomeDictionary.Type.MAGICAL);
		BiomeGenBase[] plains = BiomeDictionary.getBiomesForType(BiomeDictionary.Type.PLAINS);
		BiomeGenBase[] swamp = BiomeDictionary.getBiomesForType(BiomeDictionary.Type.SWAMP);
		BiomeGenBase[] frozen = BiomeDictionary.getBiomesForType(BiomeDictionary.Type.FROZEN);
		BiomeGenBase[] wasteland = BiomeDictionary.getBiomesForType(BiomeDictionary.Type.WASTELAND);
		BiomeGenBase[] beach = BiomeDictionary.getBiomesForType(BiomeDictionary.Type.BEACH);
		//special biomes
		BiomeGenBase[] mushroom = BiomeDictionary.getBiomesForType(BiomeDictionary.Type.MUSHROOM);
		BiomeGenBase[] water = BiomeDictionary.getBiomesForType(BiomeDictionary.Type.WATER);
		//other dimensions
		BiomeGenBase[] end = BiomeDictionary.getBiomesForType(BiomeDictionary.Type.END);
		BiomeGenBase[] nether = BiomeDictionary.getBiomesForType(BiomeDictionary.Type.NETHER);

	}


	private static void registerCreature(Class<? extends Entity> entity, String name, int back, int fore) {
		int id = getUniqueGlobalEntityId();
		EntityRegistry.registerGlobalEntityID(entity, name, id, back, fore);
		EntityRegistry.registerModEntity(entity, name, getNextLocalId(), ModPeaceHammer.instance, 80, 3, true);
	}

	private static void registerEntity(Class<? extends Entity> entity, String name) {
		EntityRegistry.registerModEntity(entity, name, getNextLocalId(), ModPeaceHammer.instance, 80, 3, true);
	}

	private static int getUniqueGlobalEntityId() {
		int id = 400;
		try {
			return EntityRegistry.findGlobalUniqueEntityId();
		} catch(Exception e) {
			LogHelper.error("Failed finding Global Entity Id!");
			do {
				id++;
			} while(EntityList.getStringFromID(id) != null);
			return id;
		}
	}

	private static int getNextLocalId() {
		return INTERNAL_IDS++;
	}


}
