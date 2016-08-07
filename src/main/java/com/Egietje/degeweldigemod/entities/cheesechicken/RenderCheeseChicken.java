package com.Egietje.degeweldigemod.entities.cheesechicken;

import com.Egietje.degeweldigemod.Reference;
import com.Egietje.degeweldigemod.entities.cheesecow.EntityCheeseCow;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderCheeseChicken extends RenderLiving<EntityCheeseChicken> {
	private static final ResourceLocation CHEESE_CHICKEN_TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/cheese_chicken.png");

	public RenderCheeseChicken(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(renderManagerIn, modelBaseIn, shadowSizeIn);
	}

	protected ResourceLocation getEntityTexture(EntityCheeseChicken entity) {
		return CHEESE_CHICKEN_TEXTURES;
	}
}