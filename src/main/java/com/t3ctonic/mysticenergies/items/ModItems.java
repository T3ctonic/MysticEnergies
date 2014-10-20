package com.t3ctonic.mysticenergies.items;

import net.minecraft.item.Item;

public class ModItems {

    public static Item pureEnergy;
    public static Item darkEnergy;
    public static Item liteEnergy;
    public static Item pureEnergyPickaxe;


    public static void init(){

        pureEnergy = new PureEnergy();
        darkEnergy = new DarkEnergy();
        liteEnergy = new LiteEnergy();
        pureEnergyPickaxe = new PureEnergyPickaxe();

    }
}
