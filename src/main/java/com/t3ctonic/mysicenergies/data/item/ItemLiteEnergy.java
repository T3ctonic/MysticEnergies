package com.t3ctonic.mysicenergies.data.item;

import com.t3ctonic.mysicenergies.Util;
import net.minecraft.item.Item;

public class ItemLiteEnergy extends Item
{
    public ItemLiteEnergy()
    {
        setUnlocalizedName("liteEnergy");
        setTextureName(Util.getModId() + "liteEnergy");
        setCreativeTab(Util.getCreativeTab(0));
    }
}
