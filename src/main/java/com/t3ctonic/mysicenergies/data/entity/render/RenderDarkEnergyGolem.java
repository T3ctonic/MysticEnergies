package com.t3ctonic.mysicenergies.data.entity.render;

import com.t3ctonic.mysicenergies.Util;
import com.t3ctonic.mysicenergies.data.entity.model.ModelDarkEneryGolem;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderDarkEnergyGolem extends RenderLiving
{
    public RenderDarkEnergyGolem()
    {
        super(new ModelDarkEneryGolem(), 1f);
    }

    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return new ResourceLocation(Util.getModId() + "textures/entities/darkEnergyGolem.png");
    }
}
