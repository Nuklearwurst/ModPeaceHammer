package com.fravokados.peacehammer.client;


import com.fravokados.peacehammer.block.tileentity.TileEntityBadTotem;
import com.fravokados.peacehammer.block.tileentity.TileEntityGyroCopter;
import com.fravokados.peacehammer.block.tileentity.TileEntityKingStone;
import com.fravokados.peacehammer.client.model.tile.ModelBadTotem;
import com.fravokados.peacehammer.client.model.tile.ModelGyroCopter;
import com.fravokados.peacehammer.client.model.tile.ModelKingStone;
import com.fravokados.peacehammer.client.render.tile.SimpleModelTileEntityRenderer;
import com.fravokados.peacehammer.common.CommonProxy;
import com.fravokados.peacehammer.lib.Textures;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenderer() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBadTotem.class, new SimpleModelTileEntityRenderer(new ModelBadTotem(), Textures.TEXTURE_BADTOTEM));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityKingStone.class, new SimpleModelTileEntityRenderer(new ModelKingStone(), Textures.TEXTURE_KINGSTONE));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGyroCopter.class, new SimpleModelTileEntityRenderer(new ModelGyroCopter(), Textures.TEXTURE_GYROCOPTER));
	}
}
