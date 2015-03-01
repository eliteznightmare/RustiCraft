package rusticraft.client;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import rusticraft.block.tile.TileEntityAirDrop;
import rusticraft.proxy.CommonProxy;
import rusticraft.render.TileEntityAirDropRenderer;

public class ClientProxy extends CommonProxy{
	
	//bind all texture to models here
	@Override
	public void init() {
		TileEntitySpecialRenderer render = new TileEntityAirDropRenderer();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAirDrop.class, new TileEntityAirDropRenderer());
		System.out.println("BOOO");
	}
}
