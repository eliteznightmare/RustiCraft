package rusticraft.client;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import rusticraft.block.tile.TileEntityAirDrop;
import rusticraft.entity.EntityAirDrop;
import rusticraft.model.ModelAirDropFalling;
import rusticraft.proxy.CommonProxy;
import rusticraft.render.RenderAirDrop;
import rusticraft.render.TileEntityAirDropRenderer;

public class ClientProxy extends CommonProxy{
	
	//bind all texture to models here
	@Override
	public void init() {
		RenderingRegistry.registerEntityRenderingHandler(EntityAirDrop.class, new RenderAirDrop(new ModelAirDropFalling(), 0));
		TileEntitySpecialRenderer render = new TileEntityAirDropRenderer();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAirDrop.class, new TileEntityAirDropRenderer());
	}
}
