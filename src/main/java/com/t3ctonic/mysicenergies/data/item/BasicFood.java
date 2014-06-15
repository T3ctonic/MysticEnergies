package com.t3ctonic.mysicenergies.data.item;

import com.t3ctonic.mysicenergies.Util;
import net.minecraft.item.ItemFood;

public class BasicFood extends ItemFood
{
    public BasicFood(String name, int heal, float saturation, boolean dogFood)
    {
        super(heal, saturation, dogFood);
        setUnlocalizedName(name);
        setTextureName(Util.getModId() + name);
        setCreativeTab(Util.getCreativeTab(0));
    }
}
