package com.Egietje.degeweldigemod.items.tools;

import com.Egietje.degeweldigemod.init.CheeseAchievements;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class CheeseFlyStick extends Item {
	public CheeseFlyStick() {
		super();
		this.setMaxStackSize(1);
		this.setMaxDamage(137);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
		playerIn.jump();
		playerIn.fallDistance = 0.0F;
		playerIn.addStat(CheeseAchievements.FLY);
		playerIn.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 100, 1);
		itemStackIn.damageItem(1, playerIn);
		return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
	}

}
