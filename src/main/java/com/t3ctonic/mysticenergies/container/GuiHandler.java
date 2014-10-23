package com.t3ctonic.mysticenergies.container;

import com.t3ctonic.mysticenergies.client.gui.GuiEnergyFurnace;
import com.t3ctonic.mysticenergies.tile.TileEnergyFurnace;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tile = world.getTileEntity(x, y, z);
        if (tile instanceof TileEnergyFurnace) return new ContainerEnergyFurnace(player.inventory);
        return null;
    }

    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tile = world.getTileEntity(x, y, z);
        if (tile instanceof TileEnergyFurnace) return new GuiEnergyFurnace(new ContainerEnergyFurnace(player.inventory), (TileEnergyFurnace) tile);
        return null;
    }
}
