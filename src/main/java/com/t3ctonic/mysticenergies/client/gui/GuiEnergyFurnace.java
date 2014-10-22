package com.t3ctonic.mysticenergies.client.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;

public class GuiEnergyFurnace extends GuiContainer {
    public GuiEnergyFurnace(Container container) {
        super(container);
    }

    protected void drawGuiContainerForegroundLayer(int sizeX, int sizeY) {
        drawString(fontRendererObj, "HALLO nederlands hehe", 100, 100, 0);
    }

    protected void drawGuiContainerBackgroundLayer(float idk, int sizeX, int sizeY) {
    }
}
