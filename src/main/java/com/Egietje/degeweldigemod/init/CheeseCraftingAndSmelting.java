package com.Egietje.degeweldigemod.init;

import java.util.Iterator;
import java.util.Map.Entry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CheeseCraftingAndSmelting {
	
	public CheeseCraftingAndSmelting() {
		unregister();
		register();
	}
	
	private void register() {
		GameRegistry.addRecipe(new ItemStack(CheeseBlocks.CHEESE_BLOCK), new Object[]{"CCC","CCC","CCC",'C',CheeseItems.CHEESE});
		GameRegistry.addRecipe(new ItemStack(CheeseBlocks.BELGIUM_FLAG), new Object[]{"BYR","S  ","LLL",'L',new ItemStack(Blocks.STONE_SLAB, 1, 0),'S',Items.STICK,'B',new ItemStack(Items.DYE, 1, 0),'Y',new ItemStack(Items.DYE, 1, 11),'R',new ItemStack(Items.DYE, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(CheeseBlocks.CHEESE_FURNACE), new Object[]{"CCC","CFC","CCC",'C',CheeseItems.CHEESE_INGOT,'F',Blocks.FURNACE});
		GameRegistry.addRecipe(new ItemStack(CheeseBlocks.CHEESE_CRAFTING_TABLE), new Object[]{"CC","CC",'C',CheeseItems.CHEESE_INGOT});
		GameRegistry.addRecipe(new ItemStack(CheeseBlocks.CHEESE_COOKIE_BLOCK), new Object[]{"CCC","CBC","CCC",'C',Items.COOKIE,'B',CheeseBlocks.CHEESE_BLOCK});
		GameRegistry.addRecipe(new ItemStack(Blocks.CRAFTING_TABLE), new Object[]{"SS","PP",'P',Blocks.PLANKS,'S',new ItemStack(Blocks.WOOL)});
		GameRegistry.addRecipe(new ItemStack(Blocks.FURNACE), new Object[]{"SSS","SCS","SSS",'C',CheeseBlocks.CHEESE_FURNACE,'S',Blocks.COBBLESTONE});
		
		GameRegistry.addRecipe(new ItemStack(CheeseItems.BREAD_CHEESE), new Object[]{" B "," C "," B ",'C',CheeseItems.CHEESE,'B',Items.BREAD});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE, 9), new Object[]{"C",'C',CheeseBlocks.CHEESE_BLOCK});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_APPLE), new Object[]{" C ","CAC"," C ",'C',CheeseItems.CHEESE,'A',Items.APPLE});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_SEEDS), new Object[]{" C ","CSC"," C ",'C',CheeseItems.CHEESE,'S',Items.WHEAT_SEEDS});
		
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_INGOT), new Object[]{"CCC","CCC",'C',CheeseItems.CHEESE});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_ARROW), new Object[]{"C","S","F",'C',CheeseItems.CHEESE_INGOT,'S',Items.STICK,'F',Items.FEATHER});
		
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_SWORD), new Object[]{" C "," C "," S ",'C',CheeseItems.CHEESE_INGOT,'S',Items.STICK});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_SHOVEL), new Object[]{" C "," S "," S ",'C',CheeseItems.CHEESE_SHOVEL_HEAD,'S',Items.STICK});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_AXE), new Object[]{" C "," S "," S ",'C',CheeseItems.CHEESE_AXE_HEAD,'S',Items.STICK});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_PICKAXE), new Object[]{" C "," S "," S ",'C',CheeseItems.CHEESE_PICKAXE_HEAD,'S',Items.STICK});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_HOE), new Object[]{"CC "," S "," S ",'C',CheeseItems.CHEESE_INGOT,'S',Items.STICK});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_FLY_STICK), new Object[]{"CCC","CSC"," S ",'C',CheeseItems.CHEESE_INGOT,'S',Items.STICK});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_MULTITOOL), new Object[]{"ASP"," T "," T ",'S',CheeseItems.CHEESE_SHOVEL_HEAD,'A',CheeseItems.CHEESE_AXE_HEAD,'P',CheeseItems.CHEESE_PICKAXE_HEAD,'T',Items.STICK});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_BOW), new Object[]{" ST","SCT"," ST",'C',CheeseItems.CHEESE_INGOT,'S',Items.STICK,'T',Items.STRING});
		
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_SHOVEL_HEAD), new Object[]{" C ",'C',CheeseItems.CHEESE_INGOT});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_AXE_HEAD), new Object[]{"CC ","C  ",'C',CheeseItems.CHEESE_INGOT});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_PICKAXE_HEAD), new Object[]{"CCC",'C',CheeseItems.CHEESE_INGOT});
		
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_HELMET), new Object[]{"CCC","C C",'C',CheeseItems.CHEESE_INGOT});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_CHESTPLATE), new Object[]{"C C","CCC","CCC",'C',CheeseItems.CHEESE_INGOT});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_LEGGINGS), new Object[]{"CCC","C C","C C",'C',CheeseItems.CHEESE_INGOT});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_BOOTS), new Object[]{"C C","C C",'C',CheeseItems.CHEESE_INGOT});
		
		GameRegistry.addSmelting(CheeseItems.CHEESE, new ItemStack(CheeseItems.CHEESE_COOKED), 4.2F);
	}
	
	private void unregister() {
		removeCraftRecipe(new ItemStack(Blocks.CRAFTING_TABLE));
		removeCraftRecipe(new ItemStack(Blocks.FURNACE));
	}
	
	private void removeCraftRecipe(ItemStack stack) {
		Iterator recipes =  CraftingManager.getInstance().getRecipeList().iterator();
		while (recipes.hasNext()) {
			ItemStack output = ((IRecipe) recipes.next()).getRecipeOutput();
			if(output != null && output.getItem() != null) {
				if(output.isItemEqual(stack)) {
					recipes.remove();
				}
			}
		}
	}
	
	private void removeSmeltRecipe(ItemStack stack) {
		Iterator recipes = FurnaceRecipes.instance().getSmeltingList().entrySet().iterator();
		while (recipes.hasNext()) {
			Entry entry = (Entry) recipes.next();
			ItemStack output = (ItemStack) entry.getValue();
			if(output != null && output.getItem() != null) {
				if(output.isItemEqual(stack)) {
					recipes.remove();
				}
			}
		}
	}
}
