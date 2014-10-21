package com.t3ctonic.mysticenergies.items;

import com.t3ctonic.mysticenergies.creativetab.ModCreativeTabs;
import com.t3ctonic.mysticenergies.lib.Constants;
import com.t3ctonic.mysticenergies.material.ModToolMaterials;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemSword;

public class LiteEnergySword extends ItemSword {

    private String name = "liteEnergySword";

    public LiteEnergySword() {

        super(ModToolMaterials.liteEnergy);
        this.setUnlocalizedName(Constants.MODID + "_" + name);
        this.setTextureName(Constants.MODID + ":" + name);
        GameRegistry.registerItem(this, name);
        setCreativeTab(ModCreativeTabs.tab);


    }
}
