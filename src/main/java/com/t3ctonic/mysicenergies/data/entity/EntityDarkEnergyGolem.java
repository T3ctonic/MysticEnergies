package com.t3ctonic.mysicenergies.data.entity;

import com.t3ctonic.mysicenergies.Util;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityDarkEnergyGolem extends EntityMob
{
    public EntityDarkEnergyGolem(World par1World)
    {
        super(par1World);
        setHealth(256);
        isImmuneToFire = true;
    }

    public void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(250.0D);
        getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(100.0D);
        getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(5.0D);
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.2D);
        getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(20.0D);
    }

    public boolean getCanSpawnHere()
    {
        return this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL  && isValidLightLevel() && super.getCanSpawnHere();
    }

    public String getLivingSound()
    {
        return "none";
    }

    public String getHurtSound()
    {
        return "mob.irongolem.hit";
    }

    public String getDeathSound()
    {
        return "mob.irongolem.death";
    }

    public void dropRareDrop(int par1)
    {
        switch (rand.nextInt(3))
        {
            case 0:
                dropItem(Util.getItem(1), 1);
                break;
        }
    }
}