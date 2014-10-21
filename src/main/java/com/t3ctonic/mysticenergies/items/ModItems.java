package com.t3ctonic.mysticenergies.items;

import net.minecraft.item.Item;

public class ModItems {

    public static Item pureEnergy;
    public static Item darkEnergy;
    public static Item liteEnergy;


    public static Item pureEnergySword;
    public static Item pureEnergyPickaxe;
    public static Item pureEnergyAxe;
    public static Item pureEnergyShovel;
    public static Item pureEnergyHoe;

    public static Item darkEnergySword;
    public static Item darkEnergyPickaxe;
    public static Item darkEnergyAxe;
    public static Item darkEnergyShovel;
    public static Item darkEnergyHoe

    public static void init(){

        pureEnergy = new PureEnergy();
        darkEnergy = new DarkEnergy();
        liteEnergy = new LiteEnergy();

        pureEnergySword = new PureEnergySword();
        pureEnergyPickaxe = new PureEnergyPickaxe();
        pureEnergyAxe = new PureEnergyAxe();
        pureEnergyShovel = new PureEnergyShovel();
        pureEnergyHoe = new PureEnergyHoe();

        darkEnergyPickaxe = new DarkEnergyPickaxe();
        darkEnergySword = new DarkEnergySword();
        darkEnergyAxe = new DarkEnergyAxe();
        darkEnergyShovel = new DarkEnergyShovel();
        darkEnergyHoe = new DarkEnergyHoe();


    }
}
