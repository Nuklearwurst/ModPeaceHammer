package com.fravokados.peacehammer.block.tileentity;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

/**
 * @author Nuklearwurst
 */
public class TileEntityBadTotem extends TileEntity {

	@Override
	public AxisAlignedBB getRenderBoundingBox() {
		return AxisAlignedBB.getBoundingBox(xCoord, yCoord, zCoord, xCoord + 2, yCoord + 6, zCoord + 1);
	}
}
