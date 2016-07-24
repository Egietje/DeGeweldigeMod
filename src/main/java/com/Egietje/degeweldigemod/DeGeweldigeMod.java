package com.Egietje.degeweldigemod;

import com.Egietje.degeweldigemod.biome.WorldTypeCheese;
import com.Egietje.degeweldigemod.entities.*;
import com.Egietje.degeweldigemod.handler.*;
import com.Egietje.degeweldigemod.init.*;
import com.Egietje.degeweldigemod.proxy.*;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.init.Biomes;
import net.minecraft.world.WorldType;
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
		new CheeseBlocks();
		new CheeseItems();
		new CheeseMobs();
		new CheeseAchievements();
		new CheeseSpawnPlacementRegistry();
		new CheeseBiomes();
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
		WorldType CHEESE = new WorldTypeCheese(4, "Cheese");
	}
}
