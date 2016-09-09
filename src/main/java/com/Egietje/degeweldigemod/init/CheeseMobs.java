package com.Egietje.degeweldigemod.init;

import com.Egietje.degeweldigemod.DeGeweldigeMod;
import com.Egietje.degeweldigemod.entities.cheesearrow.EntityCheeseArrow;
import com.Egietje.degeweldigemod.entities.cheesecow.EntityCheeseCow;
import com.Egietje.degeweldigemod.entities.tileentities.blocks.TileEntityCheeseFurnace;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Biomes;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CheeseMobs {
	
	public CheeseMobs() {
		register();
		addSpawn();
	}
	
	public void register() {
		GameRegistry.registerTileEntity(TileEntityCheeseFurnace.class, "CheeseFurnace");
		EntityRegistry.registerModEntity(EntityCheeseCow.class, "CheeseCow", 250, DeGeweldigeMod.DGMInstance, 80, 1, false, 0x917B1B, 0x8E814E);
		EntityRegistry.registerModEntity(EntityCheeseArrow.class, "CheeseArrow", 251, DeGeweldigeMod.DGMInstance, 64, 1, true);
	}
	
	public void addSpawn() {
		EntityRegistry.addSpawn(EntityCheeseCow.class, 8, 4, 4, EnumCreatureType.CREATURE, Biomes.PLAINS);
	}
}
