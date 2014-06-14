package com.t3ctonic.mysicenergies.data.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDarkEneryGolem extends ModelBase
{
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftLeg;

    public ModelDarkEneryGolem()
    {
        this(0f, -7f);
    }

    public ModelDarkEneryGolem(float par1, float par2)
    {
        int textureX = 128;
        int textureY = 128;
        
        head = (new ModelRenderer(this)).setTextureSize(textureX, textureY);
        head.setRotationPoint(0.0F, 0.0F + par2, -2.0F);
        head.setTextureOffset(0, 0).addBox(-4.0F, -12.0F, -5.5F, 8, 10, 8, par1);
        body = (new ModelRenderer(this)).setTextureSize(textureX, textureY);
        body.setRotationPoint(0.0F, 0.0F + par2, 0.0F);
        body.setTextureOffset(0, 40).addBox(-9.0F, -2.0F, -6.0F, 18, 12, 11, par1);
        body.setTextureOffset(0, 70).addBox(-4.5F, 10.0F, -3.0F, 9, 5, 6, par1 + 0.5F);
        rightarm = (new ModelRenderer(this)).setTextureSize(textureX, textureY);
        rightarm.setRotationPoint(0.0F, -7.0F, 0.0F);
        rightarm.setTextureOffset(60, 21).addBox(-13.0F, -2.5F, -3.0F, 4, 30, 6, par1);
        leftarm = (new ModelRenderer(this)).setTextureSize(textureX, textureY);
        leftarm.setRotationPoint(0.0F, -7.0F, 0.0F);
        leftarm.setTextureOffset(60, 58).addBox(9.0F, -2.5F, -3.0F, 4, 30, 6, par1);
        leftLeg = (new ModelRenderer(this, 0, 22)).setTextureSize(textureX, textureY);
        leftLeg.setRotationPoint(-4.0F, 18.0F + par2, 0.0F);
        leftLeg.setTextureOffset(37, 0).addBox(-3.5F, -3.0F, -3.0F, 6, 16, 5, par1);
        rightleg = (new ModelRenderer(this, 0, 22)).setTextureSize(textureX, textureY);
        rightleg.mirror = true;
        rightleg.setTextureOffset(60, 0).setRotationPoint(5.0F, 18.0F + par2, 0.0F);
        rightleg.addBox(-3.5F, -3.0F, -3.0F, 6, 16, 5, par1);
    }


    public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
        head.render(par7);
        body.render(par7);
        leftLeg.render(par7);
        rightleg.render(par7);
        rightarm.render(par7);
        leftarm.render(par7);
    }

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
    {
        head.rotateAngleY = par4 / (180F / (float) Math.PI);
        head.rotateAngleX = par5 / (180F / (float) Math.PI);
        rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6222F + (float) Math.PI) * 2.0F * par2 * 0.5F;
        leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
        leftLeg.rotateAngleX = -1.5F * func_78172_a(par1, 13.0F) * par2;
        rightleg.rotateAngleX = 1.5F * func_78172_a(par1, 13.0F) * par2;
        leftLeg.rotateAngleY = 0.0F;
        rightleg.rotateAngleY = 0.0F;
    }

    public float func_78172_a(float par1, float par2)
    {
        return (Math.abs(par1 % par2 - par2 * 0.5F) - par2 * 0.25F) / (par2 * 0.25F);
    }
}
