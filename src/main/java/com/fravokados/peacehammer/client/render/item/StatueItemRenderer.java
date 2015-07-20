package com.fravokados.peacehammer.client.render.item;

import com.fravokados.peacehammer.lib.Textures;
import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

/**
 * @author Nuklearwurst
 */
public class StatueItemRenderer implements IItemRenderer {

	private final ModelBase kingStone;
	private final ModelBase badTotem;
	private final ModelBase gyroCopter;

	public StatueItemRenderer(ModelBase kingStone, ModelBase badTotem, ModelBase gyroCopter) {
		this.kingStone = kingStone;
		this.badTotem = badTotem;
		this.gyroCopter = gyroCopter;
	}


	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType itemRenderType, ItemStack item, Object... data) {
		switch (item.getItemDamage()) {
			case 0:
				renderKingStone(itemRenderType);
				break;
			case 1:
				renderBadTotem(itemRenderType);
				break;
			case 2:
			default:
				renderGyroCopter(itemRenderType);
				break;
		}
	}

	public void renderKingStone(ItemRenderType itemRenderType) {
		GL11.glPushMatrix();

		// Scale, Translate, Rotate
		GL11.glScalef(0.8F, 0.8F, 0.8F);

		switch (itemRenderType) {
			case ENTITY:
				GL11.glTranslatef(0.0F, 1.5F, 0.0F);
				break;
			case EQUIPPED:
			case EQUIPPED_FIRST_PERSON:
				GL11.glTranslatef(0.5F, 2F, 0.5F);
				GL11.glRotatef(180F, 0.0F, 1.0F, 0.0F);
				break;
			case INVENTORY:
				GL11.glTranslatef(1.5F, 2.125F, 1.5F);
				break;
		}

		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(90F, 0.0F, 1.0F, 0.0F);

		// Bind texture
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(Textures.TEXTURE_KINGSTONE);

		// Render
		kingStone.render((Entity) null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

		GL11.glPopMatrix();
	}

	public void renderBadTotem(ItemRenderType itemRenderType) {
		GL11.glPushMatrix();

		// Scale, Translate, Rotate
		switch (itemRenderType) {
			case ENTITY:
				GL11.glScalef(0.4F, 0.4F, 0.4F);
				GL11.glTranslatef(0.0F, 1.5F, 0.0F);
				break;
			case EQUIPPED:
				GL11.glScalef(0.5F, 0.5F, 0.5F);
				GL11.glTranslatef(1.5F, 0.3F, 1.5F);
				break;
			case EQUIPPED_FIRST_PERSON:
				GL11.glScalef(0.4F, 0.4F, 0.4F);
				GL11.glTranslatef(0.0F, 0.5F, 0.5F);
				GL11.glRotatef(180F, 0.0F, 1.0F, 0.0F);
				break;
			case INVENTORY:
				GL11.glScalef(0.3F, 0.3F, 0.3F);
				GL11.glTranslatef(1.5F, 0.3F, 1.5F);
				break;
		}

		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(90F, 0.0F, 1.0F, 0.0F);

		// Bind texture
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(Textures.TEXTURE_BADTOTEM);

		// Render
		badTotem.render((Entity) null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

		GL11.glPopMatrix();
	}

	public void renderGyroCopter(ItemRenderType itemRenderType) {
		GL11.glPushMatrix();

		// Scale, Translate, Rotate
		GL11.glScalef(0.36F, 0.36F, 0.36F);

		switch (itemRenderType) {
			case ENTITY:
				GL11.glTranslatef(0.0F, 1.5F, 0.0F);
				break;
			case EQUIPPED:
			case EQUIPPED_FIRST_PERSON:
				GL11.glTranslatef(0.5F, 2F, 1.5F);
				GL11.glRotatef(180F, 0.0F, 1.0F, 0.0F);
				break;
			case INVENTORY:
				GL11.glTranslatef(2.5F, 1.625F, 1.5F);
				break;
		}

		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(90F, 0.0F, 1.0F, 0.0F);


		// Bind texture
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(Textures.TEXTURE_GYROCOPTER);

		// Render
		gyroCopter.render((Entity) null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

		GL11.glPopMatrix();
	}
}
