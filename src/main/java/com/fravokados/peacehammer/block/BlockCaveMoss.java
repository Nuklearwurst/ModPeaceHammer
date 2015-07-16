package com.fravokados.peacehammer.block;

import com.fravokados.peacehammer.lib.Strings;
import net.minecraft.block.material.Material;

/**
 * @author Nuklearwurst
 */
public class BlockCaveMoss extends BlockPH {

	public BlockCaveMoss() {
		super(Material.grass, Strings.Block.CAVE_MOSS);
		setLightLevel(0.7F);
		setHardness(0.6F);
		setStepSound(soundTypeGrass);
	}
}
