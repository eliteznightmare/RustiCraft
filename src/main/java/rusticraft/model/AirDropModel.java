package rusticraft.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class AirDropModel extends ModelBase {
	// Components of the model
	ModelRenderer Base;
	ModelRenderer Block1;
	ModelRenderer Block2;
	ModelRenderer TopLvl1P1;
	ModelRenderer TopLvl1P2;
	ModelRenderer TopLvl1P3;
	ModelRenderer TopLvl1P4;
	ModelRenderer TopLvl1P5;
	ModelRenderer TopLvl2P1;
	ModelRenderer TopLvl2P2;
	ModelRenderer TopLvl2P3;
	ModelRenderer TopLvl2P4;
	ModelRenderer TopLvl2P5;
	ModelRenderer Ridge1;
	ModelRenderer Ridge2;
	ModelRenderer StepUp;

	// assigning the components shapes, sizes, and rotation
	public AirDropModel() {
		textureWidth = 512;
		textureHeight = 256;

		Base = new ModelRenderer(this, 0, 200);
		Base.addBox(-10F, 0F, -10F, 20, 1, 20);
		Base.setRotationPoint(0F, 23F, 0F);
		Base.setTextureSize(512, 256);
		Base.mirror = true;
		setRotation(Base, 0F, 0F, 0F);
		Block1 = new ModelRenderer(this, 0, 0);
		Block1.addBox(-8F, 7F, -8F, 16, 15, 16);
		Block1.setRotationPoint(0F, 0F, 0F);
		Block1.setTextureSize(512, 256);
		Block1.mirror = true;
		setRotation(Block1, 0F, 0F, 0F);
		Block2 = new ModelRenderer(this, 59, 0);
		Block2.addBox(-8F, -9F, -8F, 16, 14, 16);
		Block2.setRotationPoint(0F, 1F, 0F);
		Block2.setTextureSize(512, 256);
		Block2.mirror = true;
		setRotation(Block2, 0F, 0F, 0F);
		TopLvl1P1 = new ModelRenderer(this, 0, 0);
		TopLvl1P1.addBox(-6F, 0F, -6F, 12, 1, 12);
		TopLvl1P1.setRotationPoint(0F, -10F, 0F);
		TopLvl1P1.setTextureSize(512, 256);
		TopLvl1P1.mirror = true;
		setRotation(TopLvl1P1, 0F, 0F, 0F);
		TopLvl1P2 = new ModelRenderer(this, 0, 0);
		TopLvl1P2.addBox(-5F, 0F, 0F, 10, 1, 1);
		TopLvl1P2.setRotationPoint(0F, -10F, 6F);
		TopLvl1P2.setTextureSize(512, 256);
		TopLvl1P2.mirror = true;
		setRotation(TopLvl1P2, 0F, 0F, 0F);
		TopLvl1P3 = new ModelRenderer(this, 0, 0);
		TopLvl1P3.addBox(6F, 0F, -5F, 1, 1, 10);
		TopLvl1P3.setRotationPoint(0F, -10F, 0F);
		TopLvl1P3.setTextureSize(512, 256);
		TopLvl1P3.mirror = true;
		setRotation(TopLvl1P3, 0F, 0F, 0F);
		TopLvl1P4 = new ModelRenderer(this, 0, 0);
		TopLvl1P4.addBox(-5F, 0F, 0F, 10, 1, 1);
		TopLvl1P4.setRotationPoint(0F, -10F, -7F);
		TopLvl1P4.setTextureSize(512, 256);
		TopLvl1P4.mirror = true;
		setRotation(TopLvl1P4, 0F, 0F, 0F);
		TopLvl1P5 = new ModelRenderer(this, 0, 0);
		TopLvl1P5.addBox(-1F, 0F, -5F, 1, 1, 10);
		TopLvl1P5.setRotationPoint(-6F, -10F, 0F);
		TopLvl1P5.setTextureSize(512, 256);
		TopLvl1P5.mirror = true;
		setRotation(TopLvl1P5, 0F, 0F, 0F);
		TopLvl2P1 = new ModelRenderer(this, 0, 0);
		TopLvl2P1.addBox(-2F, 0F, -5F, 10, 1, 10);
		TopLvl2P1.setRotationPoint(-3F, -11F, 0F);
		TopLvl2P1.setTextureSize(512, 256);
		TopLvl2P1.mirror = true;
		setRotation(TopLvl2P1, 0F, 0F, 0F);
		TopLvl2P2 = new ModelRenderer(this, 0, 0);
		TopLvl2P2.addBox(-4F, -11F, 5F, 8, 1, 1);
		TopLvl2P2.setRotationPoint(0F, 0F, 0F);
		TopLvl2P2.setTextureSize(512, 256);
		TopLvl2P2.mirror = true;
		setRotation(TopLvl2P2, 0F, 0F, 0F);
		TopLvl2P3 = new ModelRenderer(this, 0, 0);
		TopLvl2P3.addBox(-6F, -11F, -4F, 1, 1, 8);
		TopLvl2P3.setRotationPoint(0F, 0F, 0F);
		TopLvl2P3.setTextureSize(512, 256);
		TopLvl2P3.mirror = true;
		setRotation(TopLvl2P3, 0F, 0F, 0F);
		TopLvl2P4 = new ModelRenderer(this, 0, 0);
		TopLvl2P4.addBox(-4F, -11F, -6F, 8, 1, 1);
		TopLvl2P4.setRotationPoint(0F, 0F, 0F);
		TopLvl2P4.setTextureSize(512, 256);
		TopLvl2P4.mirror = true;
		setRotation(TopLvl2P4, 0F, 0F, 0F);
		TopLvl2P5 = new ModelRenderer(this, 0, 0);
		TopLvl2P5.addBox(5F, -11F, -4F, 1, 1, 8);
		TopLvl2P5.setRotationPoint(0F, 0F, 0F);
		TopLvl2P5.setTextureSize(512, 256);
		TopLvl2P5.mirror = true;
		setRotation(TopLvl2P5, 0F, 0F, 0F);
		Ridge1 = new ModelRenderer(this, 3, 200);
		Ridge1.addBox(-9F, 6F, -9F, 18, 1, 18);
		Ridge1.setRotationPoint(0F, 0F, 0F);
		Ridge1.setTextureSize(512, 256);
		Ridge1.mirror = true;
		setRotation(Ridge1, 0F, 0F, 0F);
		Ridge2 = new ModelRenderer(this, 0, 200);
		Ridge2.addBox(-9F, -9F, -9F, 18, 1, 18);
		Ridge2.setRotationPoint(0F, 0F, 0F);
		Ridge2.setTextureSize(512, 256);
		Ridge2.mirror = true;
		setRotation(Ridge2, 0F, 0F, 0F);
		StepUp = new ModelRenderer(this, 0, 200);
		StepUp.addBox(0F, 22F, 0F, 18, 1, 18);
		StepUp.setRotationPoint(-9F, 0F, -9F);
		StepUp.setTextureSize(512, 256);
		StepUp.mirror = true;
		setRotation(StepUp, 0F, 0F, 0F);
	}

	// pushing the components to render for the client
	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Base.render(f5);
		Block1.render(f5);
		Block2.render(f5);
		TopLvl1P1.render(f5);
		TopLvl1P2.render(f5);
		TopLvl1P3.render(f5);
		TopLvl1P4.render(f5);
		TopLvl1P5.render(f5);
		TopLvl2P1.render(f5);
		TopLvl2P2.render(f5);
		TopLvl2P3.render(f5);
		TopLvl2P4.render(f5);
		TopLvl2P5.render(f5);
		Ridge1.render(f5);
		Ridge2.render(f5);
		StepUp.render(f5);
	}
	public void renderModel(Float f){
		Base.render(f);
		Block1.render(f);
		Block2.render(f);
		TopLvl1P1.render(f);
		TopLvl1P2.render(f);
		TopLvl1P3.render(f);
		TopLvl1P4.render(f);
		TopLvl1P5.render(f);
		TopLvl2P1.render(f);
		TopLvl2P2.render(f);
		TopLvl2P3.render(f);
		TopLvl2P4.render(f);
		TopLvl2P5.render(f);
		Ridge1.render(f);
		Ridge2.render(f);
		StepUp.render(f);
	}

	// align the model with the world around it
	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float f1, float f2, float f3, float f4,
			float f5, float f6, Entity entity) {
		super.setRotationAngles(f1, f2, f3, f4, f5, f6, entity);
	}
}
