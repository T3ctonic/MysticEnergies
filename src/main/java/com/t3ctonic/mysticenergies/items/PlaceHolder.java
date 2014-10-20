package com.t3ctonic.mysticenergies.items;

import com.t3ctonic.mysticenergies.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class PlaceHolder extends Item{

    private String name = "placeholdey"; //<--- Intentional

    public PlaceHolder() {

        setUnlocalizedName(Constants.MODID + "_" + name);
        this.setTextureName(Constants.MODID + ":" + "pureEnergy");
        GameRegistry.registerItem(this, name);
        setCreativeTab(null);

    }
}
