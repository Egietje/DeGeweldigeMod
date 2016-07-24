package com.Egietje.degeweldigemod.init;

import com.Egietje.degeweldigemod.biome.BiomeCheese;

import net.minecraft.init.Biomes;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomePlains;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;

public class CheeseBiomes {
	
	public static Biome CHEESE;
	
	public CheeseBiomes() {
		initBiome();
		registerBiome();
	}
	
	public static void initBiome() {
		CHEESE = new BiomeCheese(137 ,new Biome.BiomeProperties(TextFormatting.YELLOW + "Cheese" + TextFormatting.RESET).setBaseHeight(0.125F).setHeightVariation(0.05F).setTemperature(1.2F).setRainfall(0.7F));
	}
	
	public static void registerBiome() {
		BiomeDictionary.registerBiomeType(CHEESE, Type.PLAINS);
		BiomeManager.addSpawnBiome(CHEESE);
	}
	
}
