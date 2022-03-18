package com.arka.fantasia;

import net.minecraft.client.gui.screen.MainMenuScreen;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Fantasia.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class CustomMainMenu {

    @SubscribeEvent
    public static void onOpenEvent(GuiOpenEvent Screen) {
        if(Screen.getGui() != null && Screen.getGui().getClass() == MainMenuScreen.class) {
            Screen.setGui(new GuiCustomMainMenu());
        }
    }
}
