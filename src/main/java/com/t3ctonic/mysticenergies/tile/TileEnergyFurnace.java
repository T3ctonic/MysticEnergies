package com.t3ctonic.mysticenergies.tile;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.*;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEnergyFurnace extends TileEntity implements ISidedInventory {
    public int[] slotsTop = new int[] {0};
    public int[] slotsBottom = new int[] {2, 1};
    public int[] slotsSides = new int[] {1};
    public ItemStack[] stack = new ItemStack[3];

    public int burnTime;
    public int itemBurnTime;
    public int cookTime;

    private String customName;

    public int getSizeInventory() {
        return stack.length;
    }

    public ItemStack getStackInSlot(int slot) {
        return stack[slot];
    }

    public ItemStack decrStackSize(int slot, int decr) {
        if (stack[slot] != null) {
            ItemStack itemstack;
            if (stack[slot].stackSize <= decr) {
                itemstack = stack[slot];
                stack[slot] = null;
                return itemstack;
            } else {
                itemstack = stack[slot].splitStack(decr);
                if (stack[slot].stackSize == 0) stack[slot] = null;
                return itemstack;
            }
        } else return null;
    }

    public ItemStack getStackInSlotOnClosing(int slot) {
        if (stack[slot] != null) {
            ItemStack itemstack = stack[slot];
            stack[slot] = null;
            return itemstack;
        } else return null;
    }

    public void setInventorySlotContents(int slot, ItemStack item) {
        stack[slot] = item;
        if (item != null && item.stackSize > getInventoryStackLimit())
            item.stackSize = getInventoryStackLimit();
    }

    public String getInventoryName() {
        return hasCustomInventoryName() ? customName : "container.energyfurnace";
    }

    public boolean hasCustomInventoryName() {
        return customName != null && customName.length() > 0;
    }

    public void readFromNBT(NBTTagCompound tag)
    {
        super.readFromNBT(tag);
        NBTTagList nbttaglist = tag.getTagList("items", 10);
        stack = new ItemStack[this.getSizeInventory()];

        for (int i = 0; i < nbttaglist.tagCount(); ++i)
        {
            NBTTagCompound tagList = nbttaglist.getCompoundTagAt(i);
            byte slot = tagList.getByte("slot");
            if (slot >= 0 && slot < stack.length)
                stack[slot] = ItemStack.loadItemStackFromNBT(tagList);
        }

        burnTime = tag.getShort("burnTime");
        cookTime = tag.getShort("cookTime");
        itemBurnTime = getItemBurnTime(stack[1]);

        if (tag.hasKey("customName", 8))
            customName = tag.getString("customName");
    }

    public void writeToNBT(NBTTagCompound tag)
    {
        super.writeToNBT(tag);
        tag.setShort("burnTime", (short) burnTime);
        tag.setShort("cookTime", (short) cookTime);
        NBTTagList nbttaglist = new NBTTagList();

        for (int slot = 0; slot < stack.length; ++slot)
        {
            if (stack[slot] != null)
            {
                NBTTagCompound tagList = new NBTTagCompound();
                tagList.setByte("slot", (byte) slot);
                stack[slot].writeToNBT(tagList);
                nbttaglist.appendTag(tagList);
            }
        }

        tag.setTag("items", nbttaglist);

        if (hasCustomInventoryName())
            tag.setString("customName", customName);
    }

    public int getInventoryStackLimit() {
        return 64;
    }

    @SideOnly(Side.CLIENT)
    public int getCookProgressScaled(int p)
    {
        return cookTime * p / 200;
    }

    @SideOnly(Side.CLIENT)
    public int getBurnTimeRemainingScaled(int p)
    {
        if (itemBurnTime == 0)
            itemBurnTime = 200;
        return burnTime * p / itemBurnTime;
    }

    public boolean isBurning()
    {
        return burnTime > 0;
    }

    public void updateEntity()
    {
        boolean flag = burnTime > 0;
        boolean flag1 = false;

        if (burnTime > 0) {
            --burnTime;
        } if (!worldObj.isRemote) {
            if (burnTime != 0 || stack[1] != null && stack[0] != null) {
                if (burnTime == 0 && canSmelt()) {
                    itemBurnTime = burnTime = getItemBurnTime(stack[1]);
                    if (burnTime > 0) {
                        flag1 = true;
                        if (stack[1] != null) {
                            --stack[1].stackSize;
                            if (stack[1].stackSize == 0) {
                                stack[1] = stack[1].getItem().getContainerItem(stack[1]);
                            }
                        }
                    }
                } if (isBurning() && canSmelt()) {
                    ++cookTime;
                    if (cookTime == 200) {
                        cookTime = 0;
                        smeltItem();
                        flag1 = true;
                    }
                } else {
                    cookTime = 0;
                }
            } if (flag != burnTime > 0) {
                flag1 = true;
                //todo
            }
        } if (flag1) {
           markDirty();
        }
    }

    private boolean canSmelt() {
        if (stack == null) {
            return false;
        } else {
            ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(stack[0]);
            if (itemstack == null) return false;
            if (stack[2] == null) return true;
            if (!stack[2].isItemEqual(itemstack)) return false;
            int result = stack[2].stackSize + itemstack.stackSize;
            return result <= getInventoryStackLimit() && result <= stack[2].getMaxStackSize();
        }
    }

    public void smeltItem()
    {
        if (canSmelt()) {
            ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(stack[0]);
            if (stack[2] == null) {
                stack[2] = itemstack.copy();
            } else if (stack[2].getItem() == itemstack.getItem()) {
                stack[2].stackSize += itemstack.stackSize;
            }
            --stack[0].stackSize;
            if (stack[0].stackSize <= 0) {
                stack[0] = null;
            }
        }
    }

    public static int getItemBurnTime(ItemStack p_145952_0_)
    {
        if (p_145952_0_ == null)
        {
            return 0;
        }
        else
        {
            Item item = p_145952_0_.getItem();

            if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air)
            {
                Block block = Block.getBlockFromItem(item);

                if (block == Blocks.wooden_slab)
                {
                    return 150;
                }

                if (block.getMaterial() == Material.wood)
                {
                    return 300;
                }

                if (block == Blocks.coal_block)
                {
                    return 16000;
                }
            }

            if (item instanceof ItemTool && ((ItemTool)item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemSword && ((ItemSword)item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemHoe && ((ItemHoe)item).getToolMaterialName().equals("WOOD")) return 200;
            if (item == Items.stick) return 100;
            if (item == Items.coal) return 1600;
            if (item == Items.lava_bucket) return 20000;
            if (item == Item.getItemFromBlock(Blocks.sapling)) return 100;
            if (item == Items.blaze_rod) return 2400;
            return GameRegistry.getFuelValue(p_145952_0_);
        }
    }

    public static boolean isItemFuel(ItemStack item) {
        return getItemBurnTime(item) > 0;
    }

    public boolean isUseableByPlayer(EntityPlayer player) {
        return player.getDistanceSq((double) xCoord + 0.5d, (double) yCoord + 0.5d, (double) zCoord + 0.5d) <= 64d;
    }

    public void openInventory() {

    }

    public void closeInventory() {

    }

    public boolean isItemValidForSlot(int slot, ItemStack item) {
        return slot != 2 && (slot != 1 || isItemFuel(item));
    }

    public int[] getAccessibleSlotsFromSide(int side) {
        return side == 0 ? slotsBottom : (side == 1 ? slotsTop : slotsSides);
    }

    public boolean canInsertItem(int slot, ItemStack item, int amount) {
        return isItemValidForSlot(slot, item);
    }

    public boolean canExtractItem(int slot, ItemStack item, int amount) {
        return amount != 0 || slot != 1 || item.getItem() == Items.bucket;
    }
}
