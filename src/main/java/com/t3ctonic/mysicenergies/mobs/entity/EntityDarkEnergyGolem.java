package Eclipse7.MysticEnergies.mobs.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import Eclipse7.MysticEnergies.common.MysticEnergies;

public class EntityDarkEnergyGolem extends EntityMob{

	public EntityDarkEnergyGolem(World par1World) {
		super(par1World);
		this.setHealth(this.getHealth());
        this.isImmuneToFire = true;
		}
	protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(250.0D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(100.0D);
        this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setAttribute(5.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.2D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(20.0D);
}
	public int getAttackStength(Entity par1Entity) {
		return 20;
	}
	public boolean getCanSpawnHere() {
		return this.worldObj.difficultySetting > 0 && this.isValidLightLevel() && super.getCanSpawnHere();
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
	protected void dropRareDrop(int par1)
    {
        switch (this.rand.nextInt(3))
        {
            case 0:
                this.dropItem(MysticEnergies.DarkEnergy.itemID, 1);
                break;
                
        }
    }
	@Override
	protected void fall(float distance) {}
}