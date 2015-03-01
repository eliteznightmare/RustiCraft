package rusticraft.entity;

import rusticraft.Rusticraft;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityAirDrop extends EntityAnimal {

	public EntityAirDrop(World par1World) {
		super(par1World);

	}

	public boolean isAIEnabled() {
		return true;
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth)
				.setBaseValue(600.0F);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed)
				.setBaseValue(0.0D);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return null;
	}
	Boolean f = false;
	int yD;
	@Override
	public void onUpdate() {
		int xD = (int) posX;
		int zD = (int) posZ;
		int yF = (int) posY;
		this.motionY *= 0.6D;
		if (f == false){
			//System.out.println("The first if has been accessed");
			for (int g = 100; g > 0; g--){
				//System.out.println("The second if has been accessed");
				if (worldObj.getBlock(xD, g, zD) != Block.getBlockById(0)){
					yD = g;
					g = 0;
				}
				}
			}
		if (yF == yD + 1){
			//worldObj.setBlock(serverPosX, yD+1, serverPosZ, Rusticraft.airDrop);
			worldObj.setBlock(serverPosX, yD+1, serverPosZ, Rusticraft.airDrop);
			worldObj.scheduleBlockUpdate(serverPosX, yD+1, serverPosZ, Rusticraft.airDrop, 0);
			this.setHealth(0F);
		}
		super.onUpdate();
	}
}
