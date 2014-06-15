package com.t3ctonic.mysicenergies.data.creatvetab;

import com.t3ctonic.mysicenergies.Util;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabMystic extends CreativeTabs
{
    public TabMystic()
    {
        super("mysticTab");
    }

    public Item getTabIconItem()
    {
        return Util.getItem(0);
    }
}
