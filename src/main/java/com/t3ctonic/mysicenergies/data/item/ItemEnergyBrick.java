package com.t3ctonic.mysicenergies.data.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemEnergyBrick extends BasicFood
{
    public ItemEnergyBrick()
    {
        super("energyBrick", 12, 20, false);
        setAlwaysEdible();
    }

    public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.rare;
    }

    public void onFoodEaten(ItemStack stack, World world, EntityPlayer player)
    {
        if (!world.isRemote)
        {
            player.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 20, 100));
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 125, 150));
            player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 200, 3));
            player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 300, 100));
        }
    }
}
