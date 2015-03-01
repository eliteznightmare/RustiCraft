package rusticraft;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import rusticraft.item.ItemRock;
import rusticraft.proxy.IProxy;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
public class Rusticraft {
	@Instance("RustiCraft")
	public static Rusticraft instance;
	ServerEventHandler handler = new ServerEventHandler();
	// Separating the client rendering from the calculation server side
	@SidedProxy(clientSide = "rusticraft.client.ClientProxy", serverSide = "rusticraft.proxy.ServerProxy")
	public static IProxy proxy;
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		FMLCommonHandler.instance().bus().register(handler);
		MinecraftForge.EVENT_BUS.register(handler);
	}
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event) {
		// GameRegistry.registerItem(ItemRock, "rock");
		proxy.init();
		}
	
}