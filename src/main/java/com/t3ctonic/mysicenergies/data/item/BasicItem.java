package com.t3ctonic.mysicenergies.data.item;

import com.t3ctonic.mysicenergies.Util;
import net.minecraft.item.Item;

public class BasicItem extends Item
{
    public BasicItem(String name)
    {
        setUnlocalizedName(name);
        setTextureName(Util.getModId() + name);
        setCreativeTab(Util.getCreativeTab(0));
    }
}
