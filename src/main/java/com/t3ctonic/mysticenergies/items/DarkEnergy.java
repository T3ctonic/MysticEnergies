package com.t3ctonic.mysticenergies.items;

import com.t3ctonic.mysticenergies.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class DarkEnergy extends Item{

    private String name = "darkEnergy";

    public DarkEnergy() {

        setUnlocalizedName(Constants.MODID + "_" + name);
        this.setTextureName(Constants.MODID + ":" + name);
        GameRegistry.registerItem(this, name);
        setCreativeTab(CreativeTabs.tabMaterials);


    }

}
