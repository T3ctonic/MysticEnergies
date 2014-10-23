package com.t3ctonic.mysticenergies.tile;

import net.minecraft.tileentity.TileEntity;

import static cpw.mods.fml.common.registry.GameRegistry.registerTileEntity;

public class TileEnergyFurnace extends TileEntity {
    public TileEnergyFurnace() {
        registerTileEntity(getClass(), "tileEnergyFurnace");
    }
}
