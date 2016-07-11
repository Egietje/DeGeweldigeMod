package com.Egietje.degeweldigemod.entities;

import com.Egietje.degeweldigemod.DeGeweldigeMod;
import com.Egietje.degeweldigemod.entities.cheesearrow.EntityCheeseArrow;
import com.Egietje.degeweldigemod.entities.cheesecow.EntityCheeseCow;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class CheeseMobs {
	
	public CheeseMobs() {
		register();
		addSpawn();
	}
	
	public void register() {
		registerModEntityWithEgg(EntityCheeseCow.class, "CheeseCow", 0x917B1B, 0x8E814E, 250);
		EntityRegistry.registerModEntity(EntityCheeseArrow.class, "CheeseArrow", 251, DeGeweldigeMod.DGMInstance, 64, 1, true);
	}
	
	public void addSpawn() {
		EntityRegistry.addSpawn(EntityCheeseCow.class, 8, 4, 4, EnumCreatureType.CREATURE, Biomes.PLAINS);
	}
	
	public void registerModEntityWithEgg(Class entityClass, String entityName, int eggColor, int eggSpotsColor, int entityID) {
	    EntityRegistry.registerModEntity(entityClass, entityName, entityID, DeGeweldigeMod.DGMInstance, 80, 3, false);
	    EntityRegistry.registerEgg(entityClass, eggColor, eggSpotsColor);
	}
	
}
