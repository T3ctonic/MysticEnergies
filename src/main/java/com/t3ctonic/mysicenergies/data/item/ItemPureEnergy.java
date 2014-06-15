package com.t3ctonic.mysicenergies.data.item;

import com.t3ctonic.mysicenergies.Util;
import net.minecraft.item.Item;

public class ItemPureEnergy extends Item
{
    public ItemPureEnergy()
    {
        setUnlocalizedName("pureEnergy");
        setTextureName(Util.getModId() + "pureEnergy");
        setCreativeTab(Util.getCreativeTab(0));
    }
}
