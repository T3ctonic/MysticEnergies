package com.t3ctonic.mysicenergies.data;

import com.t3ctonic.mysicenergies.Util;
import com.t3ctonic.mysicenergies.data.creatvetab.TabMystic;
import com.t3ctonic.mysicenergies.data.entity.EntityDarkEnergyGolem;
import com.t3ctonic.mysicenergies.data.entity.render.RenderDarkEnergyGolem;

public class Data extends Util
{
    public void init()
    {
        { /** Creativetabs */
            addCreativeTab(0, new TabMystic());
        }
        { /** Blocks */

        }
        { /** Items */

        }
        { /** Entities */
            addEntity(EntityDarkEnergyGolem.class, "darkEnergyGolem", new RenderDarkEnergyGolem(), 0, 0);
        }
    }
}
