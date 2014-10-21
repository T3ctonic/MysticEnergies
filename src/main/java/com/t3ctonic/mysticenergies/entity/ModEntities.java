package com.t3ctonic.mysticenergies.entity;

import com.t3ctonic.mysticenergies.lib.Constants;
import to.uk.ilexiconn.llib.content.ContentHandler;
import to.uk.ilexiconn.llib.content.ContentType;
import to.uk.ilexiconn.llib.entity.EntityObj;

@ContentHandler(modid = Constants.MODID, type = ContentType.ENTITY) //LLib can do this for all yur handlers
public class ModEntities {

    public EntityObj darkEnergyGolem;
    //public EntityObj liteEnergyGolem;
    //public EntityObj pureEnergyGolem;

    public void init() {
        darkEnergyGolem = new EntityObj(EntityDarkEnergyGolem.class, "darkEnergyGolem", 0x232323, 0x3f3f3f, "com.t3ctonic.mysticenergies.client.render.RenderDarkEnergyGolem");
        /*/iteEnergyGolem = new EntityObj(EntityLiteEnergyGolem.class, "liteEnergyGolem", 0x232323, 0x3f3f3f, "com.t3ctonic.mysticenergies.client.render.RenderLiteEnergyGolem");
        pureEnergyGolem = new EntityObj(EntityPureEnergyGolem.class, "pureEnergyGolem", 0x232323, 0x3f3f3f, "com.t3ctonic.mysticenergies.client.render.RenderPureEnergyGolem");*/
    }
}
