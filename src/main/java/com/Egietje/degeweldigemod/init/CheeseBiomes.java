package com.Egietje.degeweldigemod.init;

import com.Egietje.degeweldigemod.Reference;
import com.Egietje.degeweldigemod.biome.BiomeCheese;

import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CheeseBiomes {
	
	public static Biome CHEESE_BIOME;
	
	public CheeseBiomes() {
		initBiome();
		registerBiome();
	}
	
	public static void initBiome() {
		CHEESE_BIOME = new BiomeCheese(new BiomeProperties(TextFormatting.YELLOW + "Cheese" + TextFormatting.RESET).setWaterColor(0xD6FF42)).setRegistryName(Reference.MODID, "cheese_biome");
	}
	
	public static void registerBiome() {
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(CHEESE_BIOME, 3));
		GameRegistry.register(CHEESE_BIOME);
	}
	
}
