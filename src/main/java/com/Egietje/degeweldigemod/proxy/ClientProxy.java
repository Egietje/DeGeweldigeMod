package com.Egietje.degeweldigemod.proxy;

import java.io.File;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.Hashtable;
import java.util.Map;

import javax.imageio.ImageIO;

import org.lwjgl.opengl.Display;

import com.Egietje.degeweldigemod.DeGeweldigeMod;
import com.Egietje.degeweldigemod.Reference;
import com.Egietje.degeweldigemod.entities.LayerCheeseEars;
import com.Egietje.degeweldigemod.entities.cheesearrow.EntityCheeseArrow;
import com.Egietje.degeweldigemod.entities.cheesearrow.RenderingHandlerCheeseArrow;
import com.Egietje.degeweldigemod.entities.cheesecow.*;
import com.Egietje.degeweldigemod.handler.CheeseClientHandler;
import com.Egietje.degeweldigemod.handler.CheeseCommonHandler;
import com.Egietje.degeweldigemod.init.CheeseBlocks;
import com.Egietje.degeweldigemod.init.CheeseItems;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.sun.javafx.iio.ImageMetadata;
import com.sun.scenario.effect.ImageData;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.resources.SkinManager;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Biomes;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	
	public void registerModels() {
		registerItemModel(CheeseItems.CHEESE, 0);
		registerItemModel(CheeseItems.CHEESE_COOKED, 0);
		registerItemModel(CheeseItems.BREAD_CHEESE, 0);
		registerItemModel(CheeseItems.CHEESE_APPLE, 0);
		registerItemModel(CheeseItems.CHEESE_BUCKET, 0);
		registerItemModel(CheeseItems.CHEESE_SEEDS, 0);
		
		registerItemModel(CheeseItems.CHEESE_INGOT, 0);
		registerItemModel(CheeseItems.CHEESE_ARROW, 0);
		
		registerItemModel(CheeseItems.CHEESE_SWORD, 0);
		registerItemModel(CheeseItems.CHEESE_PICKAXE, 0);
		registerItemModel(CheeseItems.CHEESE_AXE, 0);
		registerItemModel(CheeseItems.CHEESE_SHOVEL, 0);
		registerItemModel(CheeseItems.CHEESE_HOE, 0);
		registerItemModel(CheeseItems.CHEESE_FLY_STICK, 0);
		registerItemModel(CheeseItems.CHEESE_BOW, 0);
		registerItemModel(CheeseItems.CHEESE_MULTITOOL, 0);
		
		registerItemModel(CheeseItems.CHEESE_HELMET, 0);
		registerItemModel(CheeseItems.CHEESE_CHESTPLATE, 0);
		registerItemModel(CheeseItems.CHEESE_LEGGINGS, 0);
		registerItemModel(CheeseItems.CHEESE_BOOTS, 0);
		
		registerItemModel(CheeseItems.CHEESE_PICKAXE_HEAD, 0);
		registerItemModel(CheeseItems.CHEESE_AXE_HEAD, 0);
		registerItemModel(CheeseItems.CHEESE_SHOVEL_HEAD, 0);
		
		registerBlockModel(CheeseBlocks.CHEESE_ORE, 0);
		registerBlockModel(CheeseBlocks.CHEESE_ORE_NETHER, 0);
		registerBlockModel(CheeseBlocks.CHEESE_ORE_END, 0);
		registerBlockModel(CheeseBlocks.CHEESE_BLOCK, 0);
		registerBlockModel(CheeseBlocks.QUICK_CHEESE, 0);
		registerBlockModel(CheeseBlocks.COMPLIMENT_MACHINE, 0);
		registerBlockModel(CheeseBlocks.BELGIUM_FLAG, 0);
		registerBlockModel(CheeseBlocks.CHEESE_PLANT, 0);
		registerBlockModel(CheeseBlocks.CHEESE_FURNACE, 0);
		registerBlockModel(CheeseBlocks.LIT_CHEESE_FURNACE, 0);
		registerBlockModel(CheeseBlocks.CHEESE_CRAFTING_TABLE, 0);
	}
	
	public void registerEventHandler() {
		Display.setTitle("Minecraft - 1.10.2 | DeGeweldigeMod - " + Reference.VERSION);
		
		MinecraftForge.EVENT_BUS.register(new CheeseClientHandler());
	}
	
	public void renderEntities() {
		RenderingRegistry.registerEntityRenderingHandler(EntityCheeseCow.class, new RenderingHandlerCheeseCow());
		RenderingRegistry.registerEntityRenderingHandler(EntityCheeseArrow.class, new RenderingHandlerCheeseArrow());
	}
	
	private void registerItemModel(Item item, int meta) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
	private void registerBlockModel(Block block, int meta) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
