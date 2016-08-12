package com.Egietje.degeweldigemod.proxy;

import com.Egietje.degeweldigemod.handler.CheeseCommonHandler;

import net.minecraftforge.common.MinecraftForge;

public class CommonProxy {
	
	public void registerModels() {
		
	}
	
	public void renderEntities() {
		
	}
	
	public void registerEventHandler() {
		MinecraftForge.EVENT_BUS.register(new CheeseCommonHandler());
		
	}
	
}
