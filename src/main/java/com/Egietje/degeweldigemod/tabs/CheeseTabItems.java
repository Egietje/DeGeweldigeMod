package com.Egietje.degeweldigemod.tabs;

import com.Egietje.degeweldigemod.Reference;
import com.Egietje.degeweldigemod.init.CheeseItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CheeseTabItems extends CreativeTabs {

	public CheeseTabItems(String label) {
		super(label);
		this.setBackgroundImageName("cheese_background.png");
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}

	@Override
	public Item getTabIconItem() {
		return CheeseItems.CHEESE;
	}

}
