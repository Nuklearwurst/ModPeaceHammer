package com.fravokados.peacehammer.client;


import com.fravokados.peacehammer.block.tileentity.TileEntityBadTotem;
import com.fravokados.peacehammer.block.tileentity.TileEntityGyroCopter;
import com.fravokados.peacehammer.block.tileentity.TileEntityKingStone;
import com.fravokados.peacehammer.client.model.tile.ModelBadTotem;
import com.fravokados.peacehammer.client.model.tile.ModelGyroCopter;
import com.fravokados.peacehammer.client.model.tile.ModelKingStone;
import com.fravokados.peacehammer.client.render.item.StatueItemRenderer;
import com.fravokados.peacehammer.client.render.tile.SimpleModelTileEntityRenderer;
import com.fravokados.peacehammer.common.CommonProxy;
import com.fravokados.peacehammer.common.init.ModBlocks;
import com.fravokados.peacehammer.lib.Textures;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.model.ModelBase;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenderer() {
		ModelBase modelKingStone = new ModelKingStone();
		ModelBase modelBadTotem =  new ModelBadTotem();
		ModelBase modelGyroCopter = new ModelGyroCopter();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityKingStone.class, new SimpleModelTileEntityRenderer(modelKingStone, Textures.TEXTURE_KINGSTONE));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBadTotem.class, new SimpleModelTileEntityRenderer(modelBadTotem, Textures.TEXTURE_BADTOTEM));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGyroCopter.class, new SimpleModelTileEntityRenderer(modelGyroCopter, Textures.TEXTURE_GYROCOPTER));

		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.STATUE), new StatueItemRenderer(modelKingStone, modelBadTotem, modelGyroCopter));
	}
}
