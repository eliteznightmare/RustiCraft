package rusticraft.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

public class rock extends Item {
	@Override
	public boolean onBlockStartBreak(ItemStack itemstack, int X, int Y, int Z,
			EntityPlayer player) {
		World world = MinecraftServer.getServer().getEntityWorld();
		if (world.getBlock(X, Y, Z) == Block.getBlockById(17)){
			int meta = world.getBlockMetadata(X, Y, Z);
			ItemStack wood = new ItemStack(Block.getBlockById(5), 2, meta);
			player.inventory.addItemStackToInventory(wood);
		}
		return super.onBlockStartBreak(itemstack, X, Y, Z, player);
	}
}
