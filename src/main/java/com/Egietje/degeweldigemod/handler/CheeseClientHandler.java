package com.Egietje.degeweldigemod.handler;

import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.Egietje.degeweldigemod.init.CheeseItems;

import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;

@SideOnly(Side.CLIENT)
public class CheeseClientHandler {
	
	@SubscribeEvent
	public void onFOVUpdate(FOVUpdateEvent event) {
		EntityPlayer player = event.getEntity();
		if (player.isHandActive() && player.getActiveItemStack() != null && player.getActiveItemStack().getItem() == CheeseItems.CHEESE_BOW) {
            int i = player.getItemInUseMaxCount();
            float f1 = (float)i / 10.0F;
            if (f1 > 1.0F) {
                f1 = 1.0F;
            } else {
                f1 = f1 * f1;
            }
            event.setNewfov(event.getFov() * 1.0F - f1 * 0.15F);
        }
	}
}
