package rusticraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import rusticraft.block.airDrop;
import rusticraft.block.tile.TileEntityAirDrop;
import rusticraft.entity.EntityAirDrop;
import rusticraft.entity.EntityInit;
import rusticraft.item.ItemRock;
import rusticraft.proxy.IProxy;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.EntityRegistry.EntityRegistration;
import cpw.mods.fml.common.registry.GameRegistry;

//Setting Typical mod variables (ie. mod installation setup)
@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
public class Rusticraft {

	// Main instance for the mod
	@Instance("RustiCraft")
	public static Rusticraft instance;

	// Set the handler variable
	ServerEventHandler handler = new ServerEventHandler();

	// Separating the client rendering from the calculation server side
	@SidedProxy(clientSide = "rusticraft.client.ClientProxy", serverSide = "rusticraft.proxy.ServerProxy")
	public static IProxy proxy;

	// Create New block object called Airdrop
	public static Block airDrop = new airDrop(Material.cloth)
			.setBlockTextureName("").setBlockName("airDrop");

	// Waves of mod initialization
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		FMLCommonHandler.instance().bus().register(handler);
		MinecraftForge.EVENT_BUS.register(handler);
		int id = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerModEntity(EntityAirDrop.class, "Air Drop", id,
				this, 64, 1, true);
		EntityInit.mainRegistry();
	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent event) {
		GameRegistry.registerBlock(airDrop, "AirDrop");
		proxy.init();
		GameRegistry.registerTileEntity(TileEntityAirDrop.class, "AirDrop");

	}
}