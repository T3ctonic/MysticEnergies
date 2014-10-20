package com.t3ctonic.mysticenergies.creativetab;

import com.t3ctonic.mysticenergies.items.PlaceHolder;
import com.t3ctonic.mysticenergies.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModCreativeTabs {

    private static Item placeHolder;
    public static CreativeTab tab;

    public static void init() {
        placeHolder = new PlaceHolder();
        tab = new CreativeTab("tab", placeHolder);
    }

    private static class CreativeTab extends CreativeTabs {

        public Item item;

        public CreativeTab(String n, Item i) {
            super(Constants.MODID + "." + n);
            item = i;
        }

        public Item getTabIconItem() {
            return item;
        }
    }
}
