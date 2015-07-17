package com.fravokados.peacehammer.block.tileentity;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

/**
 * @author Nuklearwurst
 */
public class TileEntityGyroCopter extends TileEntity {

	@Override
	public AxisAlignedBB getRenderBoundingBox() {
		return AxisAlignedBB.getBoundingBox(xCoord - 2, yCoord, zCoord - 2, xCoord + 3, yCoord + 2, zCoord + 3);
	}
}
