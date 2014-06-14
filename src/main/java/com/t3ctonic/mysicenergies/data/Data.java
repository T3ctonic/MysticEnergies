package com.t3ctonic.mysicenergies.data;

import com.t3ctonic.mysicenergies.Util;
import com.t3ctonic.mysicenergies.data.creatvetab.TabMystic;
import com.t3ctonic.mysicenergies.data.entity.EntityDarkEnergyGolem;
import com.t3ctonic.mysicenergies.data.entity.render.RenderDarkEnergyGolem;

public class Data extends Util
{
    public void init()
    {
        { /** Creativetabs */ //addCreativeTab(int id, Creativetab tab)
            addCreativeTab(0, new TabMystic());
        }
        { /** Blocks */ //addBlock(int id, Block block)

        }
        { /** Items */ //addItem(int id, Item item)

        }
        { /** Entities */ //addEntity(Class entityclass, String name, Render entityRender, int color, int color)
            addEntity(EntityDarkEnergyGolem.class, "darkEnergyGolem", new RenderDarkEnergyGolem(), 0, 0);
        }
    }
}
