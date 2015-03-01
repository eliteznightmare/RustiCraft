package rusticraft.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAirDropFalling extends ModelBase
{
//fields
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
 ModelRenderer Tie1;
 ModelRenderer Tie2;
 ModelRenderer Tie3;
 ModelRenderer Tie4;
 ModelRenderer ChuteMain;
 ModelRenderer ChuteLeft1;
 ModelRenderer ChuteLeft2;
 ModelRenderer ChuteRight1;
 ModelRenderer ChuteRight2;

public ModelAirDropFalling()
{
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
   Tie1 = new ModelRenderer(this, 337, 200);
   Tie1.addBox(2F, -57F, 7F, 1, 47, 1);
   Tie1.setRotationPoint(0F, 0F, 0F);
   Tie1.setTextureSize(512, 256);
   Tie1.mirror = true;
   setRotation(Tie1, 0F, 0F, -0.8028515F);
   Tie2 = new ModelRenderer(this, 400, 200);
   Tie2.addBox(-3F, -57F, 7F, 1, 47, 1);
   Tie2.setRotationPoint(0F, 0F, 0F);
   Tie2.setTextureSize(512, 256);
   Tie2.mirror = true;
   setRotation(Tie2, 0F, 0F, 0.8028515F);
   Tie3 = new ModelRenderer(this, 400, 200);
   Tie3.addBox(-3F, -57F, -8F, 1, 47, 1);
   Tie3.setRotationPoint(0F, 0F, 0F);
   Tie3.setTextureSize(512, 256);
   Tie3.mirror = true;
   setRotation(Tie3, 0F, 0F, 0.8028515F);
   Tie4 = new ModelRenderer(this, 400, 200);
   Tie4.addBox(2F, -57F, -8F, 1, 47, 1);
   Tie4.setRotationPoint(0F, 0F, 0F);
   Tie4.setTextureSize(512, 256);
   Tie4.mirror = true;
   setRotation(Tie4, 0F, 0F, -0.8028515F);
   ChuteMain = new ModelRenderer(this, 400, 0);
   ChuteMain.addBox(-10F, -50F, -13F, 20, 1, 26);
   ChuteMain.setRotationPoint(0F, 0F, 0F);
   ChuteMain.setTextureSize(512, 256);
   ChuteMain.mirror = true;
   setRotation(ChuteMain, 0F, 0F, 0F);
   ChuteLeft1 = new ModelRenderer(this, 400, 0);
   ChuteLeft1.addBox(9F, 0F, -13F, 20, 1, 26);
   ChuteLeft1.setRotationPoint(0F, -50F, 0F);
   ChuteLeft1.setTextureSize(512, 256);
   ChuteLeft1.mirror = true;
   setRotation(ChuteLeft1, 0F, 0F, 0.0872665F);
   ChuteLeft2 = new ModelRenderer(this, 400, 0);
   ChuteLeft2.addBox(8F, -54F, -13F, 20, 1, 26);
   ChuteLeft2.setRotationPoint(0F, 0F, 0F);
   ChuteLeft2.setTextureSize(512, 256);
   ChuteLeft2.mirror = true;
   setRotation(ChuteLeft2, 0F, 0F, 0.3839724F);
   ChuteRight1 = new ModelRenderer(this, 400, 0);
   ChuteRight1.addBox(-29F, 0F, -13F, 20, 1, 26);
   ChuteRight1.setRotationPoint(0F, -50F, 0F);
   ChuteRight1.setTextureSize(512, 256);
   ChuteRight1.mirror = true;
   setRotation(ChuteRight1, 0F, -0.0174533F, -0.0872665F);
   ChuteRight2 = new ModelRenderer(this, 400, 0);
   ChuteRight2.addBox(-28F, -54F, -13F, 20, 1, 26);
   ChuteRight2.setRotationPoint(0F, 0F, 0F);
   ChuteRight2.setTextureSize(512, 256);
   ChuteRight2.mirror = true;
   setRotation(ChuteRight2, 0F, 0F, -0.3839724F);
}

public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
{
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
 Tie1.render(f5);
 Tie2.render(f5);
 Tie3.render(f5);
 Tie4.render(f5);
 ChuteMain.render(f5);
 ChuteLeft1.render(f5);
 ChuteLeft2.render(f5);
 ChuteRight1.render(f5);
 ChuteRight2.render(f5);
}

private void setRotation(ModelRenderer model, float x, float y, float z)
{
 model.rotateAngleX = x;
 model.rotateAngleY = y;
 model.rotateAngleZ = z;
}

public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
{
 super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
}

}
