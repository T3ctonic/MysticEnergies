package com.t3ctonic.mysticenergies.tile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TileEnergyFurnace extends TileEntity implements IInventory {
    public boolean running;
    public ItemStack[] stack;

    public TileEnergyFurnace() {
        stack = new ItemStack[3];
    }

    public int getSizeInventory() {
        return stack.length;
    }

    public ItemStack getStackInSlot(int slot) {
        return stack[slot];
    }

    public ItemStack decrStackSize(int decr, int slot) {
        return null;
    }

    public ItemStack getStackInSlotOnClosing(int slot) {
        return null;
    }

    public void setInventorySlotContents(int slot, ItemStack stack) {

    }

    public String getInventoryName() {
        return null;
    }

    public boolean hasCustomInventoryName() {
        return false;
    }

    public int getInventoryStackLimit() {
        return 64;
    }

    public boolean isUseableByPlayer(EntityPlayer player) {
        return true;
    }

    public void openInventory() {

    }

    public void closeInventory() {

    }

    public boolean isItemValidForSlot(int slot, ItemStack stack) {
        return true;
    }
}
