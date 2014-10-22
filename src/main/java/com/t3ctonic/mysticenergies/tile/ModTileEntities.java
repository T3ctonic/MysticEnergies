package com.t3ctonic.mysticenergies.tile;

import com.t3ctonic.mysticenergies.lib.Constants;
import to.uk.ilexiconn.llib.content.ContentHandler;
import to.uk.ilexiconn.llib.content.ContentType;

@ContentHandler(modid = Constants.MODID, type = ContentType.TILEENTITY) //<------ LLib
public class  ModTileEntities {
    public static Class energyFurnace;

    public static void init() {
        energyFurnace = TileEnergyFurnace.class;
    }
}