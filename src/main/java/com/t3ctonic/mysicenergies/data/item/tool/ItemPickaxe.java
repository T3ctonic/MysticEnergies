package com.t3ctonic.mysicenergies.data.item.tool;

import com.t3ctonic.mysicenergies.Util;

public class ItemPickaxe extends net.minecraft.item.ItemPickaxe
{
    public ItemPickaxe(int toolMaterialId, String energyName)
    {
        super(Util.getToolMaterial(toolMaterialId));
        setUnlocalizedName(energyName + "Pickaxe");
        setTextureName(Util.getModId() + energyName + "Pickaxe");
        setCreativeTab(Util.getCreativeTab(0));
    }
}
