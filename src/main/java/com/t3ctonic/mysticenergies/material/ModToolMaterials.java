package com.t3ctonic.mysticenergies.material;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModToolMaterials {

    public static Item.ToolMaterial pureEnergy;
    public static Item.ToolMaterial darkEnergy;
    public static Item.ToolMaterial liteEnergy;

    public static void init() {
        pureEnergy = EnumHelper.addToolMaterial("PUREENERGY", 3, 5000, 50.0F, 40.0F, 60);
        darkEnergy = EnumHelper.addToolMaterial("DARKENERGY", 2, 2000, 15.0F, 20.0F, 30);
        liteEnergy = EnumHelper.addToolMaterial("LITEENERGY", 2, 2000, 15.0F, 20.0F, 30);
    }
}
