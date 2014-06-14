package Eclipse7.MysticEnergies.mobs.render;

import Eclipse7.MysticEnergies.mobs.entity.EntityDarkEnergyGolem;
import Eclipse7.MysticEnergies.mobs.model.DarkEnergyGolem;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class DarkEnergyGolemRender extends RenderLiving
{
    private static final ResourceLocation field_110827_a = new ResourceLocation("MysticEnergies:textures/mobs/darkEnergyGolem.png");
    protected DarkEnergyGolem model;

    public DarkEnergyGolemRender(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
        model = ((DarkEnergyGolem) mainModel);

    }

    public void DarkEnergyGolemRender(EntityDarkEnergyGolem entity, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(entity, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        DarkEnergyGolemRender((EntityDarkEnergyGolem) par1EntityLiving, par2, par4, par6, par8, par9);
    }

    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        DarkEnergyGolemRender((EntityDarkEnergyGolem) par1Entity, par2, par4, par6, par8, par9);

    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return field_110827_a;
    }

}
