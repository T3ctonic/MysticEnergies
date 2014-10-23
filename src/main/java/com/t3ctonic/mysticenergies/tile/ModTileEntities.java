package com.t3ctonic.mysticenergies.tile;

import cpw.mods.fml.common.registry.GameRegistry;

import java.lang.reflect.Field;

public class ModTileEntities {
    public static Class energyFurnace;

    public static void init() {
        energyFurnace = TileEnergyFurnace.class;

        registerTileEntities();
    }

    private static void registerTileEntities() {
        for (Field field : ModTileEntities.class.getFields()) {
            try {
                GameRegistry.registerTileEntity((Class) field.get(null), field.getName());
            }
            catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}