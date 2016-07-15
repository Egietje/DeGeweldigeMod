package com.Egietje.degeweldigemod.entities;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;

public class RenderCheeseEarsPlayer extends RenderPlayer {
	
	public RenderCheeseEarsPlayer(RenderManager renderManager, boolean useSmallArms) {
		super(renderManager, useSmallArms);
		this.addLayer(new LayerCheeseEars(this));
	}
}