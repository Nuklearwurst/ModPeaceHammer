package com.fravokados.peacehammer.client.render.item;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

/**
 * @author Nuklearwurst
 */
public class StatueItemRenderer implements IItemRenderer {

	private final ModelBase[] model;
	private final ResourceLocation[] texture;

	public StatueItemRenderer(ModelBase[] model, ResourceLocation[] texture) {
		this.texture = texture;
		this.model = model;
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
		int index = Math.min(item.getItemDamage(), model.length - 1);
		switch (itemRenderType) {
			case ENTITY:
				renderModel(-0.5F, 0.0F, 0.5F, index);
				break;
			case EQUIPPED:
				renderModel(0.0F, 0.0F, 1.0F, index);
				break;
			case EQUIPPED_FIRST_PERSON:
				renderModel(0.0F, 0.0F, 1.0F, index);
				break;
			case INVENTORY:
				renderModel(0.0F, 0.0F, 1.0F, index);
				break;
		}
	}

	public void renderModel(float x, float y, float z, int index) {
		GL11.glPushMatrix();

		// Scale, Translate, Rotate
		GL11.glScalef(0.9F, 0.9F, 0.9F);
		GL11.glTranslatef(x + 1.5F, y + 2F, z + 0.5F);
		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(90F, 0.0F, 1.0F, 0.0F);

		// Bind texture
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(texture[index]);

		// Render
		model[index].render((Entity) null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

		GL11.glPopMatrix();
	}
}
