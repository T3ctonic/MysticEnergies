package com.t3ctonic.mysicenergies.data;

import com.t3ctonic.mysicenergies.Util;
import com.t3ctonic.mysicenergies.data.block.BlockDarkEnergyOre;
import com.t3ctonic.mysicenergies.data.block.basic.BasicBlock;
import com.t3ctonic.mysicenergies.data.creatvetab.TabMystic;
import com.t3ctonic.mysicenergies.data.entity.EntityDarkEnergyGolem;
import com.t3ctonic.mysicenergies.data.entity.render.RenderDarkEnergyGolem;
import com.t3ctonic.mysicenergies.data.item.ItemEnergyBrick;
import com.t3ctonic.mysicenergies.data.item.basic.BasicItem;
import com.t3ctonic.mysicenergies.data.item.tool.*;
import com.t3ctonic.mysicenergies.data.world.gen.WorldGenDarkEnergyOre;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Data extends Util
{
    public void init()
    {
        { /** Creativetabs */
            addCreativeTab(0, new TabMystic());
        }
        { /** Blocks */
            addBlock(0, new BlockDarkEnergyOre());
            addBlock(1, new BasicBlock("pureEnergyOre", Material.iron, Item.getItemFromBlock(Util.getBlock(1))).setHardness(15f).setResistance(100));
        }
        { /** Materials */
            addToolMaterial(0, "PUREENERGY", 3, 5000, 50.0F, 40.0F, 60);
            addToolMaterial(1, "DARKENERGY", 2, 2000, 15.0F, 20.0F, 30);
            addToolMaterial(2, "LITEENERGY", 2, 2000, 15.0F, 20.0F, 30);
        }
        { /** Energies */
            int id = 0;
            for (String energy : getEnergies())
            {
                addItem(id, new BasicItem(energy));
                addItem(-1, new ItemAxe(id, energy));
                addItem(-1, new ItemHoe(id, energy));
                addItem(-1, new ItemPickaxe(id, energy));
                addItem(-1, new ItemShovel(id, energy));
                addItem(-1, new ItemSword(id, energy));
                id++;
            }
        }
        { /** Items */
            addItem(3, new ItemEnergyBrick());
        }
        { /** World Generation */
            addWorldGenerator(new WorldGenDarkEnergyOre(), 1);
        }
    }

    @SideOnly(Side.SERVER)
    public void initServer()
    {
        { /** Entities */
            addServerEntity(EntityDarkEnergyGolem.class, "darkEnergyGolem", 0, 0);
        }
    }

    @SideOnly(Side.CLIENT)
    public void initClient()
    {
        { /** Entities */
            addClientEntity(EntityDarkEnergyGolem.class, "darkEnergyGolem", new RenderDarkEnergyGolem(), 0, 0);
        }
        { /** Block Renderers */

        }
        { /** Item Renderers */

        }
    }
}