package com.Egietje.degeweldigemod.entities.cheesechicken;

import com.Egietje.degeweldigemod.entities.*;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderingHandlerCheeseChicken implements IRenderFactory {
	@Override
	public Render createRenderFor(RenderManager manager) {
		return new RenderCheeseChicken(manager, new ModelCheeseChicken(), 0.5F);
	}
}
