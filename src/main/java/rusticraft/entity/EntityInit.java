package rusticraft.entity;

import net.minecraft.entity.EntityList;
import rusticraft.Rusticraft;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityInit {
	public static void mainRegistry() {
		registerEntity();
	}

	public static void registerEntity() {

		createEntity(EntityAirDrop.class, "AirDrop", 0x0004FF, 0xFF00E1);

	}

	public static void createEntity(Class entityClass, String entityName,
			int solidColor, int spotColor) {
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry
				.registerGlobalEntityID(entityClass, entityName, randomId);
		
		createEgg(randomId, solidColor, spotColor);

	}

	private static void createEgg(int randomId, int solidColor, int spotColor) {
		EntityList.entityEggs.put(Integer.valueOf(randomId),
				new EntityList.EntityEggInfo(randomId, solidColor, spotColor));

	}

}
