package com.t3ctonic.mysicenergies.data.item.tool;

import com.t3ctonic.mysicenergies.Util;
import net.minecraft.item.ItemSpade;

public class ItemShovel extends ItemSpade
{
    public ItemShovel(int toolMaterialId, String energyName)
    {
        super(Util.getToolMaterial(toolMaterialId));
        setUnlocalizedName(energyName + "Shovel");
        setTextureName(Util.getModId() + energyName + "Shovel");
        setCreativeTab(Util.getCreativeTab(0));
    }
}
