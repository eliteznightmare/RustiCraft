package rusticraft.render;

import rusticraft.Reference;
import rusticraft.entity.EntityAirDrop;
import rusticraft.model.ModelAirDropFalling;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderAirDrop extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(Reference.MODID + ":textures/airdrop.png");
	private static final String __OBFID = "CL_00000984";
	
	public RenderAirDrop(ModelAirDropFalling base, float par2) {
		super(base, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityAirDrop entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityAirDrop)entity);
	}

}