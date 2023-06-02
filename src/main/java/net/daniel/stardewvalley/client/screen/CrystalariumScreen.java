package net.daniel.stardewvalley.client.screen;

import net.daniel.stardewvalley.common.container.CrystalariumContainer;
import net.minecraft.client.gui.screens.inventory.ContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ChestMenu;

public class CrystalariumScreen extends ContainerScreen {

    public CrystalariumScreen(ChestMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }
}
