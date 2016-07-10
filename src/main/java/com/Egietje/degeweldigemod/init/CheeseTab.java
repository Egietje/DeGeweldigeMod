package com.Egietje.degeweldigemod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CheeseTab extends CreativeTabs{

	public CheeseTab(String label) {
		super(label);
		this.setBackgroundImageName("cheese_background.png");
	}

	@Override
	public Item getTabIconItem() {
		return CheeseItems.CHEESE;
	}
	
	@Override
	public boolean hasSearchBar(){
		return true;
	}
}
