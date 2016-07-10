package com.Egietje.degeweldigemod;

import org.lwjgl.opengl.Display;

import com.Egietje.degeweldigemod.entities.CheeseSpawnPlacementRegistry;
import com.Egietje.degeweldigemod.entities.cheesearrow.EntityCheeseArrow;
import com.Egietje.degeweldigemod.entities.cheesecow.EntityCheeseCow;
import com.Egietje.degeweldigemod.entities.cheesecow.ModelCheeseCow;
import com.Egietje.degeweldigemod.entities.cheesecow.RenderCheeseCow;
import com.Egietje.degeweldigemod.handler.CheeseCommonHandler;
import com.Egietje.degeweldigemod.init.CheeseAchievements;
import com.Egietje.degeweldigemod.init.CheeseBlocks;
import com.Egietje.degeweldigemod.init.CheeseCraftingAndSmelting;
import com.Egietje.degeweldigemod.init.CheeseGeneration;
import com.Egietje.degeweldigemod.init.CheeseItems;
import com.Egietje.degeweldigemod.init.CheeseTab;
import com.Egietje.degeweldigemod.proxy.CommonProxy;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = "[1.10.2]")
public class DeGeweldigeMod {
	public static final CheeseTab tabCheeseStuff = new CheeseTab("tabCheeseStuff");
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
	
	@Instance(Reference.MODID)
	public static DeGeweldigeMod DGMInstance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		registerModEntityWithEgg(EntityCheeseCow.class, "CheeseCow", 0x917B1B, 0x8E814E, 250);
		EntityRegistry.addSpawn(EntityCheeseCow.class, 8, 4, 4, EnumCreatureType.CREATURE, Biomes.PLAINS);
		EntityRegistry.registerModEntity(EntityCheeseArrow.class, "CheeseArrow", 251, this.DGMInstance, 64, 1, true);
		
		new CheeseBlocks();
		new CheeseItems();
		new CheeseAchievements();
		new CheeseSpawnPlacementRegistry();
		
		proxy.registerModels();
		proxy.renderEntities();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		new CheeseCraftingAndSmelting();

		proxy.registerEventHandler();
		
		GameRegistry.registerWorldGenerator(new CheeseGeneration(), 0);
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
	}
	
	public void registerModEntityWithEgg(Class entityClass, String entityName, int eggColor, int eggSpotsColor, int entityID) {
    EntityRegistry.registerModEntity(entityClass, entityName, entityID, this.DGMInstance, 80, 3, false);
    EntityRegistry.registerEgg(entityClass, eggColor, eggSpotsColor);
	}
}
