package rusticraft.render;

import org.lwjgl.opengl.GL11;

import rusticraft.Reference;
import rusticraft.Rusticraft;
import rusticraft.block.tile.TileEntityAirDrop;
import rusticraft.model.AirDropModel;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class TileEntityAirDropRenderer extends TileEntitySpecialRenderer {

	private AirDropModel model;
	private static final ResourceLocation texture = (new ResourceLocation(Reference.MODID + ":textures/airdrop.png")); 
    public TileEntityAirDropRenderer() {
            this.model = new AirDropModel();
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
