package com.t3ctonic.mysticenergies.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class ContainerEnergyFurnace extends Container {

    public boolean canInteractWith(EntityPlayer player) {
        return true;
    }
}
