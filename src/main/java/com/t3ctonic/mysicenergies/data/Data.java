package com.t3ctonic.mysicenergies.data;

import com.t3ctonic.mysicenergies.Util;
import com.t3ctonic.mysicenergies.data.block.BlockDarkEnergyOre;
import com.t3ctonic.mysicenergies.data.block.BlockPureEnergy;
import com.t3ctonic.mysicenergies.data.creatvetab.TabMystic;
import com.t3ctonic.mysicenergies.data.entity.EntityDarkEnergyGolem;
import com.t3ctonic.mysicenergies.data.entity.render.RenderDarkEnergyGolem;
import com.t3ctonic.mysicenergies.data.item.BasicItem;
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
        { /** Materials */
            addToolMaterial(0, "PUREENERGY", 3, 5000, 50.0F, 40.0F, 60);
            addToolMaterial(1, "DARKENERGY", 2, 2000, 15.0F, 20.0F, 30);
            addToolMaterial(2, "LITEENERGY", 2, 2000, 15.0F, 20.0F, 30);
        }
        { /** Items */

        }
        { /** Energies */
            int toolID = 0;
            for (String energy : getEnergies())
            {
                addItem(-1, new BasicItem(energy));
                addItem(-1, new ItemAxe(toolID, energy));
                addItem(-1, new ItemHoe(toolID, energy));
                addItem(-1, new ItemPickaxe(toolID, energy));
                addItem(-1, new ItemShovel(toolID, energy));
                addItem(-1, new ItemSword(toolID, energy));
                toolID++;
            }
        }
        { /** Entities */
            addEntity(EntityDarkEnergyGolem.class, "darkEnergyGolem", new RenderDarkEnergyGolem(), 0, 0);
        }
        { /** World Generation */
            addWorldGenerator(new WorldGenDarkEnergyOre(), 1);
        }
    }
}
