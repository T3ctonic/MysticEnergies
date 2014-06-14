package com.t3ctonic.mysicenergies.data.item;

import net.minecraft.item.Item;
public class ItemDarkEnergy extends Item {

    public ItemDarkEnergy(int par1)
    {
        super(par1);
        this.setCreativeTab(mysticenergies.TabMysticEnergies);
    }

    public void registerIcons(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon("MysticEnergies:DarkEnergy");
    }

    }
}
