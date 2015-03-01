package rusticraft;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;


public class ServerEventHandler {
		
		//Called ever time the server ticks, (20 times per second)
		@SubscribeEvent
		public void ServerTickHandler(TickEvent.ServerTickEvent event){
			for (int x = 0; x < 72000; x++){
				
			}
		}
}
