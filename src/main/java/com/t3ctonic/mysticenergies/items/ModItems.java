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
    public static Item darkEnergyHoe;

    public static Item liteEnergySword;
    public static Item liteEnergyPickaxe;
    public static Item liteEnergyAxe;
    public static Item liteEnergyShovel;
    public static Item liteEnergyHoe;

    public static Item pureEnergyBlend;

    public static Item energyBrick;

    public static Item breadBrick;

    public static void init(){

        pureEnergy = new PureEnergy();
        darkEnergy = new DarkEnergy();
        liteEnergy = new LiteEnergy();

        pureEnergySword = new PureEnergySword();
        pureEnergyPickaxe = new PureEnergyPickaxe();
        pureEnergyAxe = new PureEnergyAxe();
        pureEnergyShovel = new PureEnergyShovel();
        pureEnergyHoe = new PureEnergyHoe();

        darkEnergySword = new DarkEnergySword();
        darkEnergyPickaxe = new DarkEnergyPickaxe();
        darkEnergyAxe = new DarkEnergyAxe();
        darkEnergyShovel = new DarkEnergyShovel();
        darkEnergyHoe = new DarkEnergyHoe();

        liteEnergySword = new LiteEnergySword();
        liteEnergyPickaxe = new LiteEnergyPickaxe();
        liteEnergyAxe = new LiteEnergyAxe();
        liteEnergyShovel = new LiteEnergyShovel();
        liteEnergyHoe = new LiteEnergyHoe();

        pureEnergyBlend = new PureEnergyBlend();

        energyBrick = new EnergyBrick(12, 1f, false);

        breadBrick = new BreadBrick();


    }
}
