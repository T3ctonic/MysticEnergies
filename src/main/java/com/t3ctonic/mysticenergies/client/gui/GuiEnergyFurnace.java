package com.t3ctonic.mysticenergies.client.gui;

import com.t3ctonic.mysticenergies.lib.Constants;
import com.t3ctonic.mysticenergies.tile.TileEnergyFurnace;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class GuiEnergyFurnace extends GuiContainer {
    public ResourceLocation guiTexture = new ResourceLocation(Constants.MODID, "textures/gui/energyFurnace.png");
    public TileEnergyFurnace tileEntity;

    public GuiEnergyFurnace(Container container, TileEnergyFurnace tile) {
        super(container);
        tileEntity = tile;
    }

    public void drawGuiContainerForegroundLayer(int posX, int posY) {

    }

    public void drawGuiContainerBackgroundLayer(float idk, int posX, int posY) {
        GL11.glColor4f(1f, 1f, 1f, 1f);
        mc.getTextureManager().bindTexture(guiTexture);
        int x = (width - xSize) / 2;
        int y = (height - ySize) / 2;
        drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
    }
}
