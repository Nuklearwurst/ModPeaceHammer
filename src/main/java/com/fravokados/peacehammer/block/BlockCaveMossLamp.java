package com.fravokados.peacehammer.block;

import com.fravokados.peacehammer.lib.Strings;
import net.minecraft.block.material.Material;

/**
 * @author Nuklearwurst
 */
public class BlockCaveMossLamp extends BlockPH {

	public BlockCaveMossLamp() {
		super(Material.rock, Strings.Block.CAVE_MOSS_LAMP);
		setLightLevel(1.0F);
		setHardness(1.5F);
		setResistance(10F);
	}
}
