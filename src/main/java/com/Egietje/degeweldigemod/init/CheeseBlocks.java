package com.Egietje.degeweldigemod.init;

import com.Egietje.degeweldigemod.DeGeweldigeMod;
import com.Egietje.degeweldigemod.Reference;
import com.Egietje.degeweldigemod.blocks.*;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CheeseBlocks {
	
	public static Block CHEESE_BLOCK;
	public static Block CHEESE_ORE;
	public static Block CHEESE_ORE_NETHER;
	public static Block CHEESE_ORE_END;
	public static Block QUICK_CHEESE;
	public static Block COMPLIMENT_MACHINE;
	public static Block BELGIUM_FLAG;
	public static Block CHEESE_PLANT;
	
	public CheeseBlocks() {
		init();
		register();
	}
	
	public static void init() {
		CHEESE_ORE = new CheeseOre().setCreativeTab(DeGeweldigeMod.tabCheeseStuff).setHardness(2F);
		CHEESE_ORE_NETHER = new CheeseOreNether().setCreativeTab(DeGeweldigeMod.tabCheeseStuff).setHardness(2F);
		CHEESE_ORE_END = new CheeseOreEnd().setCreativeTab(DeGeweldigeMod.tabCheeseStuff).setHardness(2F);
		CHEESE_BLOCK = new Block(Material.ROCK).setCreativeTab(DeGeweldigeMod.tabCheeseStuff).setHardness(3F);
		QUICK_CHEESE = new QuickCheese().setHardness(4F);
		COMPLIMENT_MACHINE = new ComplimentsMachine().setCreativeTab(DeGeweldigeMod.tabCheeseStuff).setHardness(3F);
		BELGIUM_FLAG = new BelgiumFlag().setCreativeTab(DeGeweldigeMod.tabCheeseStuff).setHardness(2F);
		CHEESE_PLANT = new CheesePlant();
		
		CheeseUtils.setNames(CHEESE_ORE, "cheese_ore");
		CheeseUtils.setNames(CHEESE_ORE_NETHER, "cheese_ore_nether");
		CheeseUtils.setNames(CHEESE_ORE_END, "cheese_ore_end");
		CheeseUtils.setNames(CHEESE_BLOCK, "cheese_block");
		CheeseUtils.setNames(QUICK_CHEESE, "quick_cheese");
		CheeseUtils.setNames(COMPLIMENT_MACHINE, "compliment_machine");
		CheeseUtils.setNames(BELGIUM_FLAG, "belgium_flag");
		CheeseUtils.setNames(CHEESE_PLANT, "cheese_plant");
	}	
	
	public void register() {
		this.registerBlock(CHEESE_ORE);
		this.registerBlock(CHEESE_ORE_NETHER);
		this.registerBlock(CHEESE_ORE_END);
		this.registerBlock(CHEESE_BLOCK);
		this.registerBlock(QUICK_CHEESE);
		this.registerBlock(COMPLIMENT_MACHINE);
		this.registerBlock(BELGIUM_FLAG);
		this.registerBlock(CHEESE_PLANT);
	}	
	
	private void registerBlock(Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setUnlocalizedName(block.getUnlocalizedName()).setRegistryName(block.getRegistryName()));
	}
}
