package com.samo.samosfirst.items;

import com.samo.samosfirst.FirstMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(FirstMod.TAB));
    }
}
