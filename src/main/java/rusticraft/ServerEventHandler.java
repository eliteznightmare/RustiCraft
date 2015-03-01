package rusticraft;

import java.util.List;
import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import rusticraft.entity.EntityAirDrop;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class ServerEventHandler {
	int x = 0;

	// Called ever time the server ticks, (20 times per second)
	@SubscribeEvent
	public void ServerTickHandler(TickEvent.ServerTickEvent event) {
		if (x == 2000) {
			World world = MinecraftServer.getServer().getEntityWorld();
			EntityAirDrop drop = new EntityAirDrop(world);
			Random random = new Random();
			// Generate X and Z cords in a 2000x2000 area around (0,0) for drop
			// location
			int xD = (random.nextInt(10000) % 2001) - 1000;
			int zD = (random.nextInt(10000) % 2001) - 1000;
			int yD = 100;
			// set Drop Locations
			drop.posX = xD;
			drop.posY = yD;
			drop.posZ = zD;
			// Spawn the Entity in the world
			world.spawnEntityInWorld(drop);

			ChatComponentText text = new ChatComponentText(
					"AIR DROP INCOMING AT: X: " + xD + " Y: " + yD + " Z: "
							+ zD);
			ChatStyle style = new ChatStyle();
			style.setColor(EnumChatFormatting.GOLD);
			text.setChatStyle(style);
			FMLCommonHandler.instance().getMinecraftServerInstance()
					.getConfigurationManager().sendChatMsg(text);
			// System.out.println("AIR DROP INCOMING AT: X: " + xD + 0.5 +
			// " Y: "
			// + yD + " Z: " + zD + 0.5);
			x = 0;
		}
		if (x < 200) {
			x++;
		}
	}
}
