package com.t3ctonic.mysicenergies.data;

import com.t3ctonic.mysicenergies.Util;
import com.t3ctonic.mysicenergies.data.block.BlockDarkEnergyOre;
import com.t3ctonic.mysicenergies.data.block.BlockPureEnergy;
import com.t3ctonic.mysicenergies.data.creatvetab.TabMystic;
import com.t3ctonic.mysicenergies.data.entity.EntityDarkEnergyGolem;
import com.t3ctonic.mysicenergies.data.entity.render.RenderDarkEnergyGolem;
import com.t3ctonic.mysicenergies.data.item.ItemDarkEnergy;
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
            addItem(0, new ItemDarkEnergy());
        }
        { /** Entities */
            addEntity(EntityDarkEnergyGolem.class, "darkEnergyGolem", new RenderDarkEnergyGolem(), 0, 0);
        }
        { /** World Generation */
            addWorldGenerator(new WorldGenDarkEnergyOre(), 1);
        }
    }
}
