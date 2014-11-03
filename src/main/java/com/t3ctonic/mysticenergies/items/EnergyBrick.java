package com.t3ctonic.mysticenergies.items;

import com.t3ctonic.mysticenergies.creativetab.ModCreativeTabs;
import com.t3ctonic.mysticenergies.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class EnergyBrick extends ItemFood {

    private String name = "energyBrick";

    public EnergyBrick(int heal, float saturation, boolean wolfMeat) {

        super(heal, saturation, wolfMeat);
        this.setCreativeTab(ModCreativeTabs.tab);
        setTextureName(Constants.MODID + ":" + name);
        GameRegistry.registerItem(this, name);

    }

    public int getMaxItemUseDuration(ItemStack p_77849_1_)
    {
        return 12;
    }

    public EnumRarity getRarity(ItemStack p_77613_1_)
    {
        return EnumRarity.rare;
    }

    protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_, EntityPlayer p_77849_3_)
    {
        if (!p_77849_2_.isRemote)
        {
            p_77849_3_.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 50, 100));
            p_77849_3_.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 125, 150));
            p_77849_3_.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 200, 3));
            p_77849_3_.addPotionEffect(new PotionEffect(Potion.nightVision.id, 300, 100));
        }

    }
}
