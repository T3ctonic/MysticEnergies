package com.t3ctonic.mysicenergies.data.item;

import com.t3ctonic.mysicenergies.Util;
import net.minecraft.item.Item;
public class ItemDarkEnergy extends Item
{
    public ItemDarkEnergy()
    {
        setUnlocalizedName("darkEnergy");
        setTextureName(Util.getModId() + "darkEnergy");
        setCreativeTab(Util.getCreativeTab(0));
    }
}

