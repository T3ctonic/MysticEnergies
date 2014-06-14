package Eclipse7.MysticEnergies.common;

import Eclipse7.MysticEnergies.mobs.entity.EntityDarkEnergyGolem;
import Eclipse7.MysticEnergies.mobs.model.DarkEnergyGolem;
import Eclipse7.MysticEnergies.mobs.render.DarkEnergyGolemRender;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{

    public void registerRenderInformation()
    {

        RenderingRegistry.registerEntityRenderingHandler(EntityDarkEnergyGolem.class, new DarkEnergyGolemRender(new DarkEnergyGolem(), 0.3F));

    }

}
