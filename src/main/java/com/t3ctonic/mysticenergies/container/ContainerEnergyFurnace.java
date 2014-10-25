package com.t3ctonic.mysticenergies.container;

import com.t3ctonic.mysticenergies.tile.TileEnergyFurnace;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntityFurnace;

public class ContainerEnergyFurnace extends Container {
    private TileEnergyFurnace tileEnergyFurnace;
    private int lastCookTime;
    private int lastBurnTime;
    private int lastItemBurnTime;

    public ContainerEnergyFurnace(InventoryPlayer inventoryPlayer, TileEnergyFurnace energyFurnace) {
        tileEnergyFurnace = energyFurnace;

        addSlotToContainer(new Slot(tileEnergyFurnace, 0, 27, 16));
        addSlotToContainer(new Slot(tileEnergyFurnace, 1, 27, 54));
        addSlotToContainer(new SlotFurnace(inventoryPlayer.player, tileEnergyFurnace, 2, 138, 35));

        for (int i = 0; i < 3; ++i) for (int j = 0; j < 9; ++j) addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
        for (int i = 0; i < 9; ++i) addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
    }

    public void addCraftingToCrafters(ICrafting crafting)
    {
        super.addCraftingToCrafters(crafting);
        crafting.sendProgressBarUpdate(this, 0, tileEnergyFurnace.cookTime);
        crafting.sendProgressBarUpdate(this, 1, tileEnergyFurnace.burnTime);
        crafting.sendProgressBarUpdate(this, 2, tileEnergyFurnace.itemBurnTime);
    }

    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();
        for (Object crafter : crafters)
        {
            ICrafting icrafting = (ICrafting) crafter;

            if (lastCookTime != tileEnergyFurnace.cookTime) {
                icrafting.sendProgressBarUpdate(this, 0, tileEnergyFurnace.cookTime);
            } if (lastBurnTime != tileEnergyFurnace.burnTime) {
                icrafting.sendProgressBarUpdate(this, 1, tileEnergyFurnace.burnTime);
            } if (lastItemBurnTime != tileEnergyFurnace.itemBurnTime) {
                icrafting.sendProgressBarUpdate(this, 2, tileEnergyFurnace.itemBurnTime);
            }
        }
        lastCookTime = tileEnergyFurnace.cookTime;
        lastBurnTime = tileEnergyFurnace.burnTime;
        lastItemBurnTime = tileEnergyFurnace.itemBurnTime;
    }

    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int id, int progress)
    {
        if (id == 0) {
            tileEnergyFurnace.cookTime = progress;
        } if (id == 1) {
            tileEnergyFurnace.burnTime = progress;
        } if (id == 2) {
            tileEnergyFurnace.itemBurnTime = progress;
        }
    }

    public boolean canInteractWith(EntityPlayer player) {
        return tileEnergyFurnace.isUseableByPlayer(player);
    }

    public ItemStack transferStackInSlot(EntityPlayer player, int id) {
        ItemStack stack = null;
        Slot slot = (Slot) inventorySlots.get(id);

        if (slot != null && slot.getHasStack()) {
            ItemStack stack1 = slot.getStack();
            stack = stack1.copy();

            if (id == 2) {
                if (!mergeItemStack(stack1, 3, 39, true)) {
                    return null;
                }
                slot.onSlotChange(stack1, stack);
            } else if (id != 1 && id != 0) {
                if (FurnaceRecipes.smelting().getSmeltingResult(stack1) != null) {
                    if (!mergeItemStack(stack1, 0, 1, false)) {
                        return null;
                    }
                } else if (TileEntityFurnace.isItemFuel(stack1)) {
                    if (!mergeItemStack(stack1, 1, 2, false)) {
                        return null;
                    }
                } else if (id >= 3 && id < 30) {
                    if (!mergeItemStack(stack1, 30, 39, false)) {
                        return null;
                    }
                } else if (id >= 30 && id < 39 && !mergeItemStack(stack1, 3, 30, false)) {
                    return null;
                }
            } else if (!mergeItemStack(stack1, 3, 39, false)) {
                return null;
            } if (stack1.stackSize == 0) {
                slot.putStack(null);
            } else {
                slot.onSlotChanged();
            } if (stack1.stackSize == stack.stackSize) {
                return null;
            }
            slot.onPickupFromSlot(player, stack1);
        }

        return stack;
    }
}
