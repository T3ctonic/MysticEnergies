package com.t3ctonic.mysticenergies.items;


import com.t3ctonic.mysticenergies.creativetab.ModCreativeTabs;
import com.t3ctonic.mysticenergies.lib.Constants;
import com.t3ctonic.mysticenergies.material.ModToolMaterials;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemPickaxe;

public class PureEnergyPickaxe extends ItemPickaxe {

    private String name = "pureEnergyPickaxe";

    public PureEnergyPickaxe() {

        super(ModToolMaterials.pureEnergy);
        this.setUnlocalizedName(Constants.MODID + "_" + name);
        this.setTextureName(Constants.MODID + ":" + name);
        GameRegistry.registerItem(this, name);
        setCreativeTab(ModCreativeTabs.tab);


    }
}
