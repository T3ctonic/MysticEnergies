package com.t3ctonic.mysicenergies.data.item.tool;

import com.t3ctonic.mysicenergies.Util;

public class ItemSword extends net.minecraft.item.ItemSword
{
    public ItemSword(int toolMaterialId, String energyName)
    {
        super(Util.getToolMaterial(toolMaterialId));
        setUnlocalizedName(energyName + "Sword");
        setTextureName(Util.getModId() + energyName + "Sword");
        setCreativeTab(Util.getCreativeTab(0));
    }
}
