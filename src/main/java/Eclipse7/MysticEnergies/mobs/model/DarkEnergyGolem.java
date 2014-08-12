package Eclipse7.MysticEnergies.mobs.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class DarkEnergyGolem extends ModelBase
{
	 ModelRenderer head;
	    ModelRenderer body;
	    ModelRenderer rightarm;
	    ModelRenderer leftarm;
	    ModelRenderer rightleg;
	    ModelRenderer leftLeg;
    public DarkEnergyGolem()
    {
        this(0.0F);
    }

    public DarkEnergyGolem(float par1)
    {
        this(par1, -7.0F);
    }

    public DarkEnergyGolem(float par1, float par2)
    {
        short short1 = 128;
        short short2 = 128;
        this.head = (new ModelRenderer(this)).setTextureSize(short1, short2);
        this.head.setRotationPoint(0.0F, 0.0F + par2, -2.0F);
        this.head.setTextureOffset(0, 0).addBox(-4.0F, -12.0F, -5.5F, 8, 10, 8, par1);
        this.body = (new ModelRenderer(this)).setTextureSize(short1, short2);
        this.body.setRotationPoint(0.0F, 0.0F + par2, 0.0F);
        this.body.setTextureOffset(0, 40).addBox(-9.0F, -2.0F, -6.0F, 18, 12, 11, par1);
        this.body.setTextureOffset(0, 70).addBox(-4.5F, 10.0F, -3.0F, 9, 5, 6, par1 + 0.5F);
        this.rightarm = (new ModelRenderer(this)).setTextureSize(short1, short2);
        this.rightarm.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.rightarm.setTextureOffset(60, 21).addBox(-13.0F, -2.5F, -3.0F, 4, 30, 6, par1);
        this.leftarm = (new ModelRenderer(this)).setTextureSize(short1, short2);
        this.leftarm.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.leftarm.setTextureOffset(60, 58).addBox(9.0F, -2.5F, -3.0F, 4, 30, 6, par1);
        this.leftLeg = (new ModelRenderer(this, 0, 22)).setTextureSize(short1, short2);
        this.leftLeg.setRotationPoint(-4.0F, 18.0F + par2, 0.0F);
        this.leftLeg.setTextureOffset(37, 0).addBox(-3.5F, -3.0F, -3.0F, 6, 16, 5, par1);
        this.rightleg = (new ModelRenderer(this, 0, 22)).setTextureSize(short1, short2);
        this.rightleg.mirror = true;
        this.rightleg.setTextureOffset(60, 0).setRotationPoint(5.0F, 18.0F + par2, 0.0F);
        this.rightleg.addBox(-3.5F, -3.0F, -3.0F, 6, 16, 5, par1);
    }

 
    public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
        this.head.render(par7);
        this.body.render(par7);
        this.leftLeg.render(par7);
        this.rightleg.render(par7);
        this.rightarm.render(par7);
        this.leftarm.render(par7);
    }


    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
    {
        this.head.rotateAngleY = par4 / (180F / (float)Math.PI);
        this.head.rotateAngleX = par5 / (180F / (float)Math.PI);
        this.rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6222F + (float)Math.PI) * 2.0F * par2 * 0.5F;
        this.leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;        
        this.leftLeg.rotateAngleX = -1.5F * this.func_78172_a(par1, 13.0F) * par2;
        this.rightleg.rotateAngleX = 1.5F * this.func_78172_a(par1, 13.0F) * par2;
        this.leftLeg.rotateAngleY = 0.0F;
        this.rightleg.rotateAngleY = 0.0F;
    }
    
    
    

    
    private float func_78172_a(float par1, float par2)
    {
        return (Math.abs(par1 % par2 - par2 * 0.5F) - par2 * 0.25F) / (par2 * 0.25F);
    }
}
