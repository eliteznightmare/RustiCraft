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

	// makes the drop not rotate while in the air
	public boolean isAIEnabled() {
		return true;
	}

	// Makes the Entity tough and prevents it from moving
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth)
				.setBaseValue(600.0F);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed)
				.setBaseValue(0.0D);
	}

	// Required by EntityAnimal
	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return null;
	}

	Boolean f = false;
	int yD;

	@Override
	public void onUpdate() {
		// update coords and convert Double to Int
		int xD = (int) posX;
		int zD = (int) posZ;
		int yF = (int) posY;
		//makes Air Drop fall slower the the average entity
		this.motionY *= 0.6D;
		if (f == false) {
			for (int g = 100; g > 0; g--) {
				// Test for solid ground to land on
				if (worldObj.getBlock(xD, g, zD) != Block.getBlockById(0)) {
					yD = g;
					g = 0;
				}
			}
		}
		if (yF == yD + 1) {
			// set block and update for future rendering
			worldObj.setBlock(serverPosX, yD + 1, serverPosZ,
					Rusticraft.airDrop);
			worldObj.scheduleBlockUpdate(serverPosX, yD + 1, serverPosZ,
					Rusticraft.airDrop, 0);
			// Kills the entity
			this.setHealth(0F);
		}
		super.onUpdate();
	}
}
