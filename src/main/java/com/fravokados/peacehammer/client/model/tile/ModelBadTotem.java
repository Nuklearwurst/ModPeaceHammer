package com.fravokados.peacehammer.client.model.tile;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SideOnly(Side.CLIENT)
public class ModelBadTotem extends ModelBase {
	//fields
	ModelRenderer base;
	ModelRenderer cone1;
	ModelRenderer cone2;
	ModelRenderer cone3;

	public ModelBadTotem() {
		textureWidth = 64;
		textureHeight = 64;

		base = new ModelRenderer(this, 0, 0);
		base.addBox(0F, 0F, 0F, 16, 48, 16);
		base.setRotationPoint(-8F, -24F, -8F);
		base.setTextureSize(64, 64);
		base.mirror = true;
		setRotation(base, 0F, 0F, 0F);
		cone1 = new ModelRenderer(this, 0, 0);
		cone1.addBox(0F, 0F, 0F, 14, 16, 14);
		cone1.setRotationPoint(-7F, -40F, -2F);
		cone1.setTextureSize(64, 64);
		cone1.mirror = true;
		setRotation(cone1, 0F, 0F, 0F);
		cone2 = new ModelRenderer(this, 0, 0);
		cone2.addBox(0F, 0F, 0F, 8, 10, 8);
		cone2.setRotationPoint(-4F, -50F, 6F);
		cone2.setTextureSize(64, 64);
		cone2.mirror = true;
		setRotation(cone2, 0F, 0F, 0F);
		cone3 = new ModelRenderer(this, 0, 0);
		cone3.addBox(0F, 2F, 0F, 4, 8, 4);
		cone3.setRotationPoint(-2F, -60F, 12F);
		cone3.setTextureSize(64, 64);
		cone3.mirror = true;
		setRotation(cone3, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		base.render(f5);
		cone1.render(f5);
		cone2.render(f5);
		cone3.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
