package rusticraft.render;

import org.lwjgl.opengl.GL11;

import rusticraft.Reference;
import rusticraft.model.BarrelModel;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileEntityBarrelRender extends TileEntitySpecialRenderer {

	private BarrelModel model;
	private static final ResourceLocation texture = (new ResourceLocation(Reference.MODID + ":textures/barrel.png")); 
    public TileEntityBarrelRender() {
            this.model = new BarrelModel();
    }
    
    
    //Binding texture, aligning model, 
    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
            GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
            this.bindTexture(texture);
            GL11.glPushMatrix();
            this.model.renderModel(0.0625F);
            GL11.glPopMatrix();
            GL11.glPopMatrix();
    }
}
