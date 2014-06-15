package com.t3ctonic.mysicenergies.data.item.tool;

import com.t3ctonic.mysicenergies.Util;

public class ItemAxe extends net.minecraft.item.ItemAxe
{
    public ItemAxe(int toolMaterialId, String energyName)
    {
        super(Util.getToolMaterial(toolMaterialId));
        setUnlocalizedName(energyName + "Axe");
        setTextureName(Util.getModId() + energyName + "Axe");
        setCreativeTab(Util.getCreativeTab(0));
    }
}
