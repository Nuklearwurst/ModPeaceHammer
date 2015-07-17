package com.fravokados.peacehammer.client.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGyroCopter extends ModelBase {
	//fields
	ModelRenderer Sitz;
	ModelRenderer Kuve1;
	ModelRenderer Kuve2;
	ModelRenderer MotorBasis;
	ModelRenderer Stange;
	ModelRenderer Shape1;
	ModelRenderer Spitze;
	ModelRenderer Rotor1;
	ModelRenderer Rotor2;
	ModelRenderer Rotor3;
	ModelRenderer Shape2;
	ModelRenderer H1;
	ModelRenderer H2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;

	public ModelGyroCopter() {
		textureWidth = 256;
		textureHeight = 64;

		Sitz = new ModelRenderer(this, 0, 0);
		Sitz.addBox(0F, 0F, 0F, 16, 9, 17);
		Sitz.setRotationPoint(-8F, 11F, -8F);
		Sitz.setTextureSize(256, 64);
		Sitz.mirror = true;
		setRotation(Sitz, 0F, 0F, 0F);
		Kuve1 = new ModelRenderer(this, 0, 30);
		Kuve1.addBox(0F, 0F, 0F, 2, 2, 32);
		Kuve1.setRotationPoint(5F, 22F, -10F);
		Kuve1.setTextureSize(256, 64);
		Kuve1.mirror = true;
		setRotation(Kuve1, 0F, 0F, 0F);
		Kuve2 = new ModelRenderer(this, 0, 30);
		Kuve2.addBox(0F, 0F, 0F, 2, 2, 32);
		Kuve2.setRotationPoint(-7F, 22F, -10F);
		Kuve2.setTextureSize(256, 64);
		Kuve2.mirror = true;
		setRotation(Kuve2, 0F, 0F, 0F);
		MotorBasis = new ModelRenderer(this, 39, 45);
		MotorBasis.addBox(-1F, 0F, 0F, 8, 9, 6);
		MotorBasis.setRotationPoint(-3F, 10F, 9F);
		MotorBasis.setTextureSize(256, 64);
		MotorBasis.mirror = true;
		setRotation(MotorBasis, 0F, 0F, 0F);
		Stange = new ModelRenderer(this, 12, 53);
		Stange.addBox(0F, 0F, 0F, 2, 7, 2);
		Stange.setRotationPoint(-1F, -3F, 11F);
		Stange.setTextureSize(256, 64);
		Stange.mirror = true;
		setRotation(Stange, 0F, 0F, 0F);
		Shape1 = new ModelRenderer(this, 12, 51);
		Shape1.addBox(0F, 0F, 0F, 4, 6, 4);
		Shape1.setRotationPoint(-2F, 4F, 10F);
		Shape1.setTextureSize(256, 64);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Spitze = new ModelRenderer(this, 12, 54);
		Spitze.addBox(0F, 0F, 0F, 4, 3, 4);
		Spitze.setRotationPoint(-2F, -6F, 10F);
		Spitze.setTextureSize(256, 64);
		Spitze.mirror = true;
		setRotation(Spitze, 0F, 0F, 0F);
		Rotor1 = new ModelRenderer(this, 85, 0);
		Rotor1.addBox(0F, 0F, 0F, 6, 1, 38);
		Rotor1.setRotationPoint(-3F, -5F, -28F);
		Rotor1.setTextureSize(256, 64);
		Rotor1.mirror = true;
		setRotation(Rotor1, 0F, 0F, 0F);
		Rotor2 = new ModelRenderer(this, 85, 0);
		Rotor2.addBox(0F, 0F, -1F, 6, 1, 38);
		Rotor2.setRotationPoint(1F, -5F, 17F);
		Rotor2.setTextureSize(256, 64);
		Rotor2.mirror = true;
		setRotation(Rotor2, 0F, 1.151917F, 0F);
		Rotor3 = new ModelRenderer(this, 85, 0);
		Rotor3.addBox(0F, 0F, 0F, 6, 1, 38);
		Rotor3.setRotationPoint(-3F, -5F, 11F);
		Rotor3.setTextureSize(256, 64);
		Rotor3.mirror = true;
		setRotation(Rotor3, 0F, -1.151917F, 0F);
		Shape2 = new ModelRenderer(this, 69, 38);
		Shape2.addBox(0F, 0F, 0F, 6, 1, 25);
		Shape2.setRotationPoint(-3F, 16F, 15F);
		Shape2.setTextureSize(256, 64);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		H1 = new ModelRenderer(this, 80, 0);
		H1.addBox(0F, 0F, 0F, 6, 1, 14);
		H1.setRotationPoint(3F, 16F, 30F);
		H1.setTextureSize(256, 64);
		H1.mirror = true;
		setRotation(H1, 0F, 0F, 0F);
		H2 = new ModelRenderer(this, 80, 0);
		H2.addBox(0F, 0F, 0F, 6, 1, 14);
		H2.setRotationPoint(-9F, 16F, 30F);
		H2.setTextureSize(256, 64);
		H2.mirror = true;
		setRotation(H2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 68, 37);
		Shape3.addBox(0F, 0F, 0F, 1, 1, 25);
		Shape3.setRotationPoint(0F, 10F, 15F);
		Shape3.setTextureSize(256, 64);
		Shape3.mirror = true;
		setRotation(Shape3, -0.2094395F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 170, 0);
		Shape4.addBox(0F, 0F, 0F, 1, 7, 14);
		Shape4.setRotationPoint(0F, 10F, 36.6F);
		Shape4.setTextureSize(256, 64);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 0, 49);
		Shape5.addBox(0F, 0F, 0F, 2, 9, 2);
		Shape5.setRotationPoint(5F, 13F, 9F);
		Shape5.setTextureSize(256, 64);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 0, 49);
		Shape6.addBox(0F, 0F, 0F, 2, 9, 2);
		Shape6.setRotationPoint(-7F, 13F, 9F);
		Shape6.setTextureSize(256, 64);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 145, 0);
		Shape7.addBox(0F, 0F, 0F, 4, 2, 8);
		Shape7.setRotationPoint(-2F, 20F, -5F);
		Shape7.setTextureSize(256, 64);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Sitz.render(f5);
		Kuve1.render(f5);
		Kuve2.render(f5);
		MotorBasis.render(f5);
		Stange.render(f5);
		Shape1.render(f5);
		Spitze.render(f5);
		Rotor1.render(f5);
		Rotor2.render(f5);
		Rotor3.render(f5);
		Shape2.render(f5);
		H1.render(f5);
		H1.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape6.render(f5);
		Shape7.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}