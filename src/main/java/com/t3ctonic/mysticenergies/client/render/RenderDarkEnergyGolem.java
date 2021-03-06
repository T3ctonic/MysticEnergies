package com.t3ctonic.mysticenergies.client.render;

import com.t3ctonic.mysticenergies.client.model.ModelEnergyGolem;
import com.t3ctonic.mysticenergies.lib.Constants;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderDarkEnergyGolem extends RendererLivingEntity {
    public ResourceLocation texture;

    public RenderDarkEnergyGolem() {
        super(new ModelEnergyGolem(), 0.3f);
        texture = new ResourceLocation(Constants.MODID, "textures/entities/DarkEnergyGolem.png");
    }

    public ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return texture;
    }
}
