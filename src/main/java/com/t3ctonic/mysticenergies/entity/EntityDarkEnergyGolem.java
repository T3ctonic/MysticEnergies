package com.t3ctonic.mysticenergies.entity;

import com.t3ctonic.mysticenergies.items.ModItems;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityDarkEnergyGolem extends EntityMob {
    public EntityDarkEnergyGolem(World p_i1686_1_){

        super(p_i1686_1_);
        this.setHealth(this.getHealth());
        this.isImmuneToFire = true;
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(300.0D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(100.0D);
        this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(5.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.2D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(20.0D);
    }

    public int getAttackStength() {
        return 20;
    }

    public boolean getCanSpawnHere() {
        return this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL && this.isValidLightLevel() && super.getCanSpawnHere();
    }

    protected String getLivingSound() {
        return "none";
    }

    protected String getHurtSound() {
        return "mob.irongolem.hit";
    }

    protected String getDeathSound() {
        return "mob.irongolem.death";
    }

    protected void dropRareDrop(int par1){
        switch (this.rand.nextInt(3)){
            case 0:
                this.dropItem(ModItems.darkEnergy, 1);
                break;

        }
    }
    @Override
    protected void fall(float distance) {}



    //todo
}
