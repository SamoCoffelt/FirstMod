package com.samo.samosfirst.items;

import com.samo.samosfirst.FirstMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Baguette extends Item {
    public Baguette() {
        super(new Item.Properties()
                .group(FirstMod.TAB)
                .food(new Food.Builder()
                        .hunger(7)
                        .saturation(12f)
                        .effect(new EffectInstance(Effects.INSTANT_HEALTH, 100, 1), 0.05f)
                        .build())
        );
    }
}
