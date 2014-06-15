package com.t3ctonic.mysicenergies.data.item.tool;

import com.t3ctonic.mysicenergies.Util;

public class ItemHoe extends net.minecraft.item.ItemHoe
{
    public ItemHoe(int toolMaterialId, String energyName)
    {
        super(Util.getToolMaterial(toolMaterialId));
        setUnlocalizedName(energyName + "Hoe");
        setTextureName(Util.getModId() + energyName + "Hoe");
        setCreativeTab(Util.getCreativeTab(0));
    }
}
