package com.t3ctonic.mysticenergies.items;

import com.t3ctonic.mysticenergies.creativetab.ModCreativeTabs;
import com.t3ctonic.mysticenergies.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;


public class PureEnergyBlend extends Item {

    private String name = "pureEnergyBlend";

    public PureEnergyBlend() {

        setUnlocalizedName(Constants.MODID + "_" + name);
        this.setTextureName(Constants.MODID + ":" + name);
        GameRegistry.registerItem(this, name);
        setCreativeTab(ModCreativeTabs.tab);


    }

}
