package rusticraft.block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import rusticraft.block.tile.TileEntityAirDrop;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class airDrop extends BlockContainer {

	//Array of Item id's for the Airdrop to drop
	public static int[] itemList = { 19, 19, 34, 46, 46, 46, 46, 52, 90, 90,
			90, 103, 119, 129, 129, 129, 130, 130, 130, 138, 152, 152, 152,
			170, 170, 264, 282, 282, 282, 344, 349, 368, 388, 397, 2263, 316, };

	public airDrop(Material p_i45394_1_) {
		super(p_i45394_1_);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new TileEntityAirDrop();
	}

	@Override
	public Item getItemDropped(int metadata, Random random, int fortune) {
		return Item.getItemById(itemList[random.nextInt(itemList.length) - 1]);
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon= iconRegister.registerIcon("rusticraft:airdrop");
	}
}
