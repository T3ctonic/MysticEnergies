package com.t3ctonic.mysicenergies.data.creatvetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TabMystic extends CreativeTabs
{
    public TabMystic()
    {
        super("mysticTab");
    }

    public Item getTabIconItem()
    {
        return Items.glowstone_dust;
    }
}
