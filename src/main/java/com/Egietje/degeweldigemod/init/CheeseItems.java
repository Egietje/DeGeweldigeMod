package com.Egietje.degeweldigemod.init;

import com.Egietje.degeweldigemod.DeGeweldigeMod;
import com.Egietje.degeweldigemod.Reference;
import com.Egietje.degeweldigemod.items.*;
import com.Egietje.degeweldigemod.items.tools.*;

import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CheeseItems {
	public static ToolMaterial cheese_tool_material;
	
	public static ArmorMaterial cheese_armor_material;
	
	public static Item CHEESE_SWORD;
	public static Item CHEESE_PICKAXE;
	public static Item CHEESE_AXE;
	public static Item CHEESE_SHOVEL;
	public static Item CHEESE_HOE;
	public static Item CHEESE_FLY_STICK;
	public static Item CHEESE_BOW;
	
	public static Item CHEESE_HELMET;
	public static Item CHEESE_CHESTPLATE;
	public static Item CHEESE_LEGGINGS;
	public static Item CHEESE_BOOTS;
	
	public static Item CHEESE;
	public static Item CHEESE_COOKED;
	public static Item BREAD_CHEESE;
	public static Item CHEESE_APPLE;
	public static Item CHEESE_BUCKET;
	public static Item CHEESE_SEEDS;
	
	public static Item CHEESE_INGOT;
	public static Item CHEESE_ARROW;
	
	public CheeseItems() {
		init();
		register();
	}
	
	public static void init() {
		cheese_tool_material = EnumHelper.addToolMaterial("cheese_tool_material", 2, 1265, 7.0F, 2.5F, 17);
		
		cheese_armor_material = EnumHelper.addArmorMaterial("cheese_armor_material", "", 22, new int[] {3, 6, 8, 3}, 17, SoundEvents.BLOCK_SLIME_BREAK, 3);
		
		CHEESE_HELMET = new CheeseArmor(cheese_armor_material, EntityEquipmentSlot.HEAD).setCreativeTab(DeGeweldigeMod.tabCheeseStuff);
		CHEESE_CHESTPLATE = new CheeseArmor(cheese_armor_material, EntityEquipmentSlot.CHEST).setCreativeTab(DeGeweldigeMod.tabCheeseStuff);
		CHEESE_LEGGINGS = new CheeseArmor(cheese_armor_material, EntityEquipmentSlot.LEGS).setCreativeTab(DeGeweldigeMod.tabCheeseStuff);
		CHEESE_BOOTS = new CheeseArmor(cheese_armor_material, EntityEquipmentSlot.FEET).setCreativeTab(DeGeweldigeMod.tabCheeseStuff);
		
		CHEESE_SWORD = new CheeseSword(cheese_tool_material).setCreativeTab(DeGeweldigeMod.tabCheeseStuff);
		CHEESE_PICKAXE = new CheesePickaxe(cheese_tool_material).setCreativeTab(DeGeweldigeMod.tabCheeseStuff);
		CHEESE_AXE = new CheeseAxe(cheese_tool_material).setCreativeTab(DeGeweldigeMod.tabCheeseStuff);
		CHEESE_SHOVEL = new CheeseSpade(cheese_tool_material).setCreativeTab(DeGeweldigeMod.tabCheeseStuff);
		CHEESE_HOE = new CheeseHoe(cheese_tool_material).setCreativeTab(DeGeweldigeMod.tabCheeseStuff);
		CHEESE_FLY_STICK = new CheeseFlyStick().setCreativeTab(DeGeweldigeMod.tabCheeseStuff);
		CHEESE_BOW = new CheeseBow().setCreativeTab(DeGeweldigeMod.tabCheeseStuff);
		
		CHEESE = new ItemFood(4, 0.8F, false).setCreativeTab(DeGeweldigeMod.tabCheeseStuff);
		CHEESE_COOKED = new ItemFood(7, 1.3F, true).setCreativeTab(DeGeweldigeMod.tabCheeseStuff);
		BREAD_CHEESE = new ItemFood(15, 1.7F, true).setCreativeTab(DeGeweldigeMod.tabCheeseStuff);
		CHEESE_APPLE = new CheeseApple().setCreativeTab(DeGeweldigeMod.tabCheeseStuff);
		CHEESE_BUCKET = new CheeseBucket().setCreativeTab(DeGeweldigeMod.tabCheeseStuff);
		CHEESE_SEEDS = new ItemSeeds(CheeseBlocks.CHEESE_PLANT, Blocks.FARMLAND).setCreativeTab(DeGeweldigeMod.tabCheeseStuff);
		
		CHEESE_INGOT = new Item().setCreativeTab(DeGeweldigeMod.tabCheeseStuff);
		CHEESE_ARROW = new CheeseArrow().setCreativeTab(DeGeweldigeMod.tabCheeseStuff);
		
		CheeseUtils.setNames(CHEESE, "cheese");
		CheeseUtils.setNames(CHEESE_COOKED, "cheese_cooked");
		CheeseUtils.setNames(BREAD_CHEESE, "bread_cheese");
		CheeseUtils.setNames(CHEESE_APPLE, "cheese_apple");
		CheeseUtils.setNames(CHEESE_BUCKET, "cheese_bucket");
		CheeseUtils.setNames(CHEESE_SEEDS, "cheese_seeds");
		
		CheeseUtils.setNames(CHEESE_INGOT, "cheese_ingot");
		CheeseUtils.setNames(CHEESE_ARROW, "cheese_arrow");
		
		CheeseUtils.setNames(CHEESE_SWORD, "cheese_sword");
		CheeseUtils.setNames(CHEESE_PICKAXE, "cheese_pickaxe");
		CheeseUtils.setNames(CHEESE_AXE, "cheese_axe");
		CheeseUtils.setNames(CHEESE_SHOVEL, "cheese_shovel");
		CheeseUtils.setNames(CHEESE_HOE, "cheese_hoe");
		CheeseUtils.setNames(CHEESE_FLY_STICK, "cheese_fly_stick");
		CheeseUtils.setNames(CHEESE_BOW, "cheese_bow");
		
		CheeseUtils.setNames(CHEESE_HELMET, "cheese_helmet");
		CheeseUtils.setNames(CHEESE_CHESTPLATE, "cheese_chestplate");
		CheeseUtils.setNames(CHEESE_LEGGINGS, "cheese_leggings");
		CheeseUtils.setNames(CHEESE_BOOTS, "cheese_boots");
	}	
	
	public static void register() {
		GameRegistry.register(CHEESE_SWORD);
		GameRegistry.register(CHEESE_PICKAXE);
		GameRegistry.register(CHEESE_AXE);
		GameRegistry.register(CHEESE_SHOVEL);
		GameRegistry.register(CHEESE_HOE);
		GameRegistry.register(CHEESE_FLY_STICK);
		GameRegistry.register(CHEESE_BOW);
		
		GameRegistry.register(CHEESE_HELMET);
		GameRegistry.register(CHEESE_CHESTPLATE);
		GameRegistry.register(CHEESE_LEGGINGS);
		GameRegistry.register(CHEESE_BOOTS);
		
		GameRegistry.register(CHEESE);
		GameRegistry.register(CHEESE_COOKED);
		GameRegistry.register(BREAD_CHEESE);
		GameRegistry.register(CHEESE_APPLE);
		GameRegistry.register(CHEESE_BUCKET);
		GameRegistry.register(CHEESE_SEEDS);
		
		GameRegistry.register(CHEESE_INGOT);
		GameRegistry.register(CHEESE_ARROW);
	}
}
