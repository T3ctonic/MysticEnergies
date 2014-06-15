package com.t3ctonic.mysicenergies.data;

import com.t3ctonic.mysicenergies.Util;
import com.t3ctonic.mysicenergies.data.block.BlockDarkEnergyOre;
import com.t3ctonic.mysicenergies.data.block.BlockPureEnergy;
import com.t3ctonic.mysicenergies.data.creatvetab.TabMystic;
import com.t3ctonic.mysicenergies.data.entity.EntityDarkEnergyGolem;
import com.t3ctonic.mysicenergies.data.entity.render.RenderDarkEnergyGolem;
import com.t3ctonic.mysicenergies.data.item.ItemDarkEnergy;
import com.t3ctonic.mysicenergies.data.item.ItemLiteEnergy;
import com.t3ctonic.mysicenergies.data.item.ItemPureEnergy;
import com.t3ctonic.mysicenergies.data.item.tool.*;
import com.t3ctonic.mysicenergies.data.world.gen.WorldGenDarkEnergyOre;

public class Data extends Util
{
    public void init()
    {
        { /** Creativetabs */
            addCreativeTab(0, new TabMystic());
        }
        { /** Blocks */
            addBlock(0, new BlockDarkEnergyOre());
            addBlock(1, new BlockPureEnergy());
        }
        { /** Items */
            addItem(0, new ItemPureEnergy());
            addItem(1, new ItemDarkEnergy());
            addItem(2, new ItemLiteEnergy());
        }
        { /** Materials */
            addToolMaterial(0, "PUREENERGY", 3, 5000, 50.0F, 40.0F, 60);
            addToolMaterial(1, "DARKENERGY", 2, 2000, 15.0F, 20.0F, 30);
            addToolMaterial(2, "LITEENERGY", 2, 2000, 15.0F, 20.0F, 30);
        }
        { /** Tools */
            addItem(50, new ItemAxe(0, "pureEnergy"));
            addItem(51, new ItemHoe(0, "pureEnergy"));
            addItem(52, new ItemPickaxe(0, "pureEnergy"));
            addItem(53, new ItemShovel(0, "pureEnergy"));
            addItem(54, new ItemSword(0, "pureEnergy"));

            addItem(55, new ItemAxe(1, "darkEnergy"));
            addItem(56, new ItemHoe(1, "darkEnergy"));
            addItem(57, new ItemPickaxe(1, "darkEnergy"));
            addItem(58, new ItemShovel(1, "darkEnergy"));
            addItem(59, new ItemSword(1, "darkEnergy"));

            addItem(55, new ItemAxe(2, "liteEnergy"));
            addItem(56, new ItemHoe(2, "liteEnergy"));
            addItem(57, new ItemPickaxe(2, "liteEnergy"));
            addItem(58, new ItemShovel(2, "liteEnergy"));
            addItem(59, new ItemSword(2, "liteEnergy"));
        }
        { /** Entities */
            addEntity(EntityDarkEnergyGolem.class, "darkEnergyGolem", new RenderDarkEnergyGolem(), 0, 0);
        }
        { /** World Generation */
            addWorldGenerator(new WorldGenDarkEnergyOre(), 1);
        }
    }
}
