package com.t3ctonic.mysicenergies.data;

import com.t3ctonic.mysicenergies.Util;
import com.t3ctonic.mysicenergies.data.block.BlockDarkEntityOre;
import com.t3ctonic.mysicenergies.data.creatvetab.TabMystic;
import com.t3ctonic.mysicenergies.data.entity.EntityDarkEnergyGolem;
import com.t3ctonic.mysicenergies.data.entity.render.RenderDarkEnergyGolem;
import com.t3ctonic.mysicenergies.data.item.ItemDarkEnergy;

public class Data extends Util
{
    public void init()
    {
        { /** Creativetabs */ //addCreativeTab(int id, Creativetab tab)
            addCreativeTab(0, new TabMystic());
        }
        { /** Blocks */ //addBlock(int id, Block block)
            addBlock(0, new BlockDarkEntityOre());
        }
        { /** Items */ //addItem(int id, Item item)
            addItem(0, new ItemDarkEnergy(0));

        }
        { /** Entities */ //addEntity(Class entityclass, String name, Render entityRender, int color, int color)
            addEntity(EntityDarkEnergyGolem.class, "darkEnergyGolem", new RenderDarkEnergyGolem(), 0, 0);
        }
    }
}
