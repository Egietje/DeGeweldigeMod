package com.Egietje.degeweldigemod.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import com.Egietje.degeweldigemod.init.CheeseItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.ILockableContainer;
import net.minecraft.world.World;

public class ComplimentsMachine extends Block {
	public Random random = new Random();

	public ComplimentsMachine() {
		super(Material.PISTON);
	}

	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
		int compliment = random.nextInt(8);
		Item holdingItem = playerIn.getHeldItemMainhand() != null ? playerIn.getHeldItemMainhand().getItem() : null;
		if (playerIn.isCreative()) {
			if (worldIn.isRemote) {
				return true;
			} else {
				if (compliment == 0) {
					playerIn.addChatMessage(new TextComponentString(TextFormatting.YELLOW + playerIn.getDisplayNameString() + TextFormatting.GOLD +" is AWESOME." + TextFormatting.RESET));
				} else {
					if (compliment == 1) {
						playerIn.addChatMessage(new TextComponentString(TextFormatting.GOLD + "I love " + TextFormatting.YELLOW + playerIn.getDisplayNameString() + TextFormatting.GOLD +  "." + TextFormatting.RESET));
					} else {
						if (compliment == 2) {
							playerIn.addChatMessage(new TextComponentString(TextFormatting.YELLOW + playerIn.getDisplayNameString() + TextFormatting.GOLD + " is nice." + TextFormatting.RESET));
						} else {
							if (compliment == 3) {
								playerIn.addChatMessage(new TextComponentString(TextFormatting.YELLOW + playerIn.getDisplayNameString() + TextFormatting.GOLD + " is my BFF." + TextFormatting.RESET));
							} else {
								if (compliment == 4) {
									playerIn.addChatMessage(new TextComponentString(TextFormatting.YELLOW + playerIn.getDisplayNameString() + TextFormatting.GOLD + " is the best cheese." + TextFormatting.RESET));
								} else {
									if (compliment == 5) {
										playerIn.addChatMessage(new TextComponentString(TextFormatting.YELLOW + playerIn.getDisplayNameString() + TextFormatting.GOLD + " is perfect." + TextFormatting.RESET));
									} else {
										if (compliment == 6) {
											playerIn.addChatMessage(new TextComponentString(TextFormatting.YELLOW + playerIn.getDisplayNameString() + TextFormatting.GOLD + " will win every contest." + TextFormatting.RESET));
										} else {
											if (compliment == 7) {
												playerIn.addChatMessage(new TextComponentString(TextFormatting.YELLOW + playerIn.getDisplayNameString() + TextFormatting.GOLD + " is strong." + TextFormatting.RESET));
											} else {
												return true;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (!playerIn.isCreative()) {
			if (worldIn.isRemote) {
				return true;
			} else {
				if (compliment == 0 && holdingItem == CheeseItems.CHEESE) {
					playerIn.addChatMessage(new TextComponentString(TextFormatting.YELLOW + playerIn.getDisplayNameString() + TextFormatting.GOLD +" is AWESOME." + TextFormatting.RESET));
					removeItem(playerIn);
					playerIn.addExperience(14);
				} else {
					if (compliment == 1 && holdingItem == CheeseItems.CHEESE) {
						playerIn.addChatMessage(new TextComponentString(TextFormatting.GOLD + "I love " + TextFormatting.YELLOW + playerIn.getDisplayNameString() + TextFormatting.GOLD +  "." + TextFormatting.RESET));
						removeItem(playerIn);
						playerIn.addExperience(14);
					} else {
						if (compliment == 2 && holdingItem == CheeseItems.CHEESE) {
							playerIn.addChatMessage(new TextComponentString(TextFormatting.YELLOW + playerIn.getDisplayNameString() + TextFormatting.GOLD + " is nice." + TextFormatting.RESET));
							removeItem(playerIn);
							playerIn.addExperience(14);
						} else {
							if (compliment == 3 && holdingItem == CheeseItems.CHEESE) {
								playerIn.addChatMessage(new TextComponentString(TextFormatting.YELLOW + playerIn.getDisplayNameString() + TextFormatting.GOLD + " is my BFF." + TextFormatting.RESET));
								removeItem(playerIn);
								playerIn.addExperience(14);
							} else {
								if (compliment == 4 && holdingItem == CheeseItems.CHEESE) {
									playerIn.addChatMessage(new TextComponentString(TextFormatting.YELLOW + playerIn.getDisplayNameString() + TextFormatting.GOLD + " is the best cheese." + TextFormatting.RESET));
									removeItem(playerIn);
									playerIn.addExperience(14);
								} else {
									if (compliment == 5 && holdingItem == CheeseItems.CHEESE) {
										playerIn.addChatMessage(new TextComponentString(TextFormatting.YELLOW + playerIn.getDisplayNameString() + TextFormatting.GOLD + " is perfect." + TextFormatting.RESET));
										removeItem(playerIn);
										playerIn.addExperience(14);
									} else {
										if (compliment == 6 && holdingItem == CheeseItems.CHEESE) {
											playerIn.addChatMessage(new TextComponentString(TextFormatting.YELLOW + playerIn.getDisplayNameString() + TextFormatting.GOLD + " will win every contest." + TextFormatting.RESET));
											removeItem(playerIn);
											playerIn.addExperience(14);
										} else {
											if (compliment == 7 && holdingItem == CheeseItems.CHEESE) {
												playerIn.addChatMessage(new TextComponentString(TextFormatting.YELLOW + playerIn.getDisplayNameString() + TextFormatting.GOLD + " is strong." + TextFormatting.RESET));
												removeItem(playerIn);
												playerIn.addExperience(14);
											} else {
												return true;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return true;
	}

	public void removeItem(EntityPlayer playerIn) {
		playerIn.inventory.decrStackSize(playerIn.inventory.currentItem, 1);
	}
}
