package com.Egietje.degeweldigemod.gui;

import java.io.IOException;

import com.Egietje.degeweldigemod.blocks.CheeseCookieBlock;

import javafx.scene.paint.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.client.config.GuiButtonExt;
import net.minecraftforge.fml.client.config.GuiSlider;

public class CheeseCookieGui extends GuiScreen {
	
	public static GuiSlider cookies;
	public boolean slider = false;
	public EntityPlayer player = Minecraft.getMinecraft().thePlayer;
	public static boolean cookiesC = false;
	public static boolean cookiesS = false;
	@Override
	public void initGui() {
		slider = false;
		cookiesC = false;
		cookiesS = false;
		buttonList.add(new GuiButtonExt(1, width / 2 - 100, height / 4 + 42 + -16, 200, 20, "Goed geopend!"));
		cookies = new GuiSlider(8, width / 2 - 100, height / 4 + 42 + -16, 200, 20, "Ik wil ", " koekjes", 1, 50, 1, true, true);
	}
	
	@Override
	protected void actionPerformed(GuiButton button) throws IOException {
		switch(button.id) {
		case 1 :
			buttonList.removeAll(buttonList);
			buttonList.add(new GuiButtonExt(2, width / 2 - 100, height / 4 + 42 + -16, 200, 20, "Stop!"));
			break;
		case 2 :
			buttonList.removeAll(buttonList);
			buttonList.add(new GuiButtonExt(3, width / 2 - 100, height / 4 + 42 + -16, 200, 20, "Ik zei STOP!"));
			break;
		case 3 :
			buttonList.removeAll(buttonList);
			buttonList.add(new GuiButtonExt(4, width / 2 - 100, height / 4 + 42 + -16, 200, 20, "Nooit luisteren he"));
			break;
		case 4 :
			buttonList.removeAll(buttonList);
			buttonList.add(new GuiButtonExt(5, width / 2 - 100, height / 4 + 42 + -16, 200, 20, "Wil je een koekje?"));
			buttonList.add(new GuiButtonExt(6, width / 2 - 100, height / 4 + 72 + -16, 75, 20, "Ja"));
			buttonList.add(new GuiButtonExt(7, width / 2 + 25, height / 4 + 72 + -16, 75, 20, "Nee"));
			break;
		case 5 :
			buttonList.removeAll(buttonList);
			buttonList.add(new GuiButtonExt(8, width / 2 - 100, height / 4 + 42 + -16, 200, 20, "Mahn, niet op klikken"));
			buttonList.add(new GuiButtonExt(9, width / 2 - 100, height / 4 + 72 + -16, 200, 20, "Terug naar koekjes"));
			break;
		case 6 :
			buttonList.removeAll(buttonList);
			buttonList.add(cookies);
			buttonList.add(new GuiButtonExt(10, width / 2 - 100, height / 4 + 72 + -16, 200, 20, "Ok"));
			slider = true;
			break;
		case 7 :
			buttonList.removeAll(buttonList);
			this.mc.displayGuiScreen((GuiScreen)null);
			break;
		case 8 :
			break;
		case 9 :
			buttonList.removeAll(buttonList);
			buttonList.add(new GuiButtonExt(5, width / 2 - 100, height / 4 + 42 + -16, 200, 20, "Wil je een koekje?"));
			buttonList.add(new GuiButtonExt(6, width / 2 - 100, height / 4 + 72 + -16, 75, 20, "Ja"));
			buttonList.add(new GuiButtonExt(7, width / 2 + 25, height / 4 + 72 + -16, 75, 20, "Nee"));
			break;
		case 10 :
			buttonList.removeAll(buttonList);
			slider = false;
			if(!player.isCreative()) {
				if(player.experienceLevel >= 3 * cookies.getValueInt()) {
					cookiesS = true;
					buttonList.add(new GuiButtonExt(11, width / 2 - 100, height / 4 + 42 + -16, 200, 20, "Alsjeblieft"));
				} else {
					buttonList.add(new GuiButtonExt(7, width / 2 - 100, height / 4 + 42 + -16, 200, 20, "Je hebt niet genoeg xp"));
				}
			} else {
				cookiesC = true;
				buttonList.add(new GuiButtonExt(11, width / 2 - 100, height / 4 + 42 + -16, 200, 20, "Alsjeblieft"));
			}
			break;
		case 11 :
			CheeseCookieBlock.remove();
			cookiesC = false;
			cookiesS = false;
			this.mc.displayGuiScreen((GuiScreen)null);
			break;
		}
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		if(slider) {
			drawCenteredString(fontRendererObj, "Je krijgt " + String.valueOf(cookies.getValueInt()) + " koekjes, dat is " + String.valueOf(cookies.getValueInt() * 3) + " XP levels" , width / 2, height / 4 + 102 + -16, 0xFFFFFF);
		}
		super.drawScreen(mouseX, mouseY, partialTicks);
	}
}
