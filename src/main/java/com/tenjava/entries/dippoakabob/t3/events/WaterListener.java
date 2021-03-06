package com.tenjava.entries.dippoakabob.t3.events;

import com.tenjava.entries.dippoakabob.t3.TenJava;
import com.tenjava.entries.dippoakabob.t3.apocalypse.ApocalypseManager;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.inventory.ItemStack;

/**
 * Created by dippoakabob.
 */
public class WaterListener implements Listener {

	private static int DESPAWN_CHANCE = 3;

	@EventHandler
	public void onWaterPlace(PlayerBucketEmptyEvent event) {
		if(ApocalypseManager.hasStarted()){
			if (TenJava.getRandom().nextInt(DESPAWN_CHANCE) == 0) {
				event.getBlockClicked().getRelative(event.getBlockFace()).setType(Material.AIR);
				event.setItemStack(new ItemStack(Material.BUCKET));
			}
		}
	}

}
