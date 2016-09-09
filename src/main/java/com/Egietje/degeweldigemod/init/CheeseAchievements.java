package com.Egietje.degeweldigemod.init;

import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class CheeseAchievements {
	public static Achievement JOIN;
	public static Achievement FLY;
	public static Achievement COOKIE;
	
	public CheeseAchievements() {
		init();
		register();
	}
	
	private void init() {
		JOIN = new Achievement("achievement.join", "join", 0, 0, CheeseItems.CHEESE, JOIN).initIndependentStat().setSpecial();
		FLY = new Achievement("achievement.fly", "fly", 2, 1, CheeseItems.CHEESE_FLY_STICK, FLY).setSpecial();
		COOKIE = new Achievement("achievement.cookie", "cookie", 3, 3, Items.COOKIE, COOKIE).setSpecial();
	}
	
	private void register() {
		JOIN.registerStat();
		FLY.registerStat();
		COOKIE.registerStat();
		AchievementPage.registerAchievementPage(new AchievementPage("Cheese Achievements", new Achievement[] { JOIN, FLY }));
	}
}
