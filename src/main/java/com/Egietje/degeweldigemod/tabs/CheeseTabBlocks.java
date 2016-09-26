package com.Egietje.degeweldigemod.tabs;

import com.Egietje.degeweldigemod.init.CheeseBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CheeseTabBlocks extends CreativeTabs {

	public CheeseTabBlocks(String label) {
		super(label);
		this.setBackgroundImageName("cheese_background.png");
	}
		
	@Override
	public boolean hasSearchBar() {
		return true;
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(CheeseBlocks.CHEESE_BLOCK);
	}

}
