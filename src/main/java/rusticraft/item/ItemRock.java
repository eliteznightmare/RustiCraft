package rusticraft.item;

import rusticraft.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemRock extends Item {
	public ItemRock() {
		super();
	}

	/*
	 * Bind the item to a .png texture in game
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("rusticraft:rock");
	}

	/*
	 * Adds the destroy effect on the rock
	 */
	@Override
	public boolean onBlockStartBreak(ItemStack itemstack, int X, int Y, int Z,
			EntityPlayer player) {
		System.out.println(player.worldObj.getBlock(X, Y, Z).getUnlocalizedName());
		if (player.worldObj.getBlock(X, Y, Z).getUnlocalizedName().contains("log")){
			System.out.println("Boo");
		}
		return super.onBlockStartBreak(itemstack, X, Y, Z, player);
	}
}
