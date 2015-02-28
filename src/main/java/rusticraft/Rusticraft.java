package rusticraft;

import net.minecraft.item.Item;
import rusticraft.item.ItemRock;
import rusticraft.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version= Reference.VERSION)
public class Rusticraft {
	@Instance("CulinaryCraft")
	public static Rusticraft instance;
	@SidedProxy(clientSide = "rusticraft.client.ClientProxy", serverSide = "rusticraft.proxy.ServerProxy")
	public static IProxy proxy;
	public static final Item ItemRock = new ItemRock();
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
	}
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event){
		GameRegistry.registerItem(ItemRock, "rock");
	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}