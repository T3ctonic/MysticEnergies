package com.t3ctonic.mysticenergies.items;

import com.t3ctonic.mysticenergies.creativetab.ModCreativeTabs;
import com.t3ctonic.mysticenergies.lib.Constants;
import com.t3ctonic.mysticenergies.material.ModToolMaterials;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemSpade;

public class LiteEnergyShovel extends ItemSpade {

    private String name = "liteEnergyShovel";

    public LiteEnergyShovel() {

        super(ModToolMaterials.liteEnergy);
        this.setUnlocalizedName(Constants.MODID + "_" + name);
        this.setTextureName(Constants.MODID + ":" + name);
        GameRegistry.registerItem(this, name);
        setCreativeTab(ModCreativeTabs.tab);


    }
}
