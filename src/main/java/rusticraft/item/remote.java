package rusticraft.item;

import java.util.Random;

import rusticraft.entity.EntityAirDrop;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class remote extends Item {
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world,
			EntityPlayer player) {
		EntityAirDrop drop = new EntityAirDrop(world);
		Random random = new Random();
		// Generate X and Z cords in a 2000x2000 area around (0,0) for drop
		// location
		int xD = player.serverPosX;
		int zD = player.serverPosZ;
		int yD = 100;
		// set Drop Locations
		drop.posX = xD;
		drop.posY = yD;
		drop.posZ = zD;
		// Spawn the Entity in the world
		world.spawnEntityInWorld(drop);

		ChatComponentText text = new ChatComponentText(
				"AIR DROP INCOMING AT: X: " + xD + " Y: " + yD + " Z: " + zD);
		ChatStyle style = new ChatStyle();
		style.setColor(EnumChatFormatting.GOLD);
		text.setChatStyle(style);
		FMLCommonHandler.instance().getMinecraftServerInstance()
				.getConfigurationManager().sendChatMsg(text);
		--itemstack.stackSize;
		return super.onItemRightClick(itemstack, world, player);
	}

}
