package com.fravokados.peacehammer.block.tileentity;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

/**
 * @author Nuklearwurst
 */
public class TileEntityKingStone extends TileEntity {

	@Override
	public AxisAlignedBB getRenderBoundingBox() {
		return AxisAlignedBB.getBoundingBox(xCoord, yCoord, zCoord, xCoord + 1, yCoord + 1.2, zCoord + 1);
	}
}
