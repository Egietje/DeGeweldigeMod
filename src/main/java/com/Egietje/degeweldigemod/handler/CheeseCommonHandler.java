package com.Egietje.degeweldigemod.handler;

import com.Egietje.degeweldigemod.init.CheeseAchievements;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class CheeseCommonHandler {
	@SubscribeEvent
	public void onPlayerJoin(PlayerLoggedInEvent event) {
		EntityPlayer player = event.player;
		player.addChatMessage(new TextComponentString(TextFormatting.GOLD +  "Welcome " + TextFormatting.YELLOW +  player.getDisplayNameString() + TextFormatting.GOLD +  ", have fun!" + TextFormatting.RESET));
		player.addStat(CheeseAchievements.JOIN);
	}
}
