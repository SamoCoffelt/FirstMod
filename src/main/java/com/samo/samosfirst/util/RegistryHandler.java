package com.samo.samosfirst.util;

import com.samo.samosfirst.FirstMod;
import com.samo.samosfirst.armor.ModArmorMaterial;
import com.samo.samosfirst.blocks.BlockItemBase;
import com.samo.samosfirst.blocks.GreenBlock;
import com.samo.samosfirst.blocks.GreenOre;
import com.samo.samosfirst.items.Baguette;
import com.samo.samosfirst.items.ItemBase;
import com.samo.samosfirst.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, FirstMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, FirstMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> GREEN_INGOT = ITEMS.register("green_ingot", ItemBase::new);
    public static final RegistryObject<Item> GREEN_SHARD = ITEMS.register("green_shard", ItemBase::new);
    public static final RegistryObject<Baguette> BAGUETTE = ITEMS.register("baguette", Baguette::new);

    //Tools
    public static final RegistryObject<SwordItem> GREEN_BLADE = ITEMS.register("green_blade", () ->
            new SwordItem(ModItemTier.GREEN, 9, -3.0f, new Item.Properties().group(FirstMod.TAB)));
    public static final RegistryObject<PickaxeItem> GREEN_PICKAXE = ITEMS.register("green_pickaxe", () ->
            new PickaxeItem(ModItemTier.GREEN, 1, -2.0f, new Item.Properties().group(FirstMod.TAB)));
    public static final RegistryObject<AxeItem> GREEN_AXE = ITEMS.register("green_axe", () ->
            new AxeItem(ModItemTier.GREEN, 10, -4.0f, new Item.Properties().group(FirstMod.TAB)));
    public static final RegistryObject<ShovelItem> GREEN_SHOVEL = ITEMS.register("green_shovel", () ->
            new ShovelItem(ModItemTier.GREEN, 0, -2.0f, new Item.Properties().group(FirstMod.TAB)));
    public static final RegistryObject<HoeItem> GREEN_HOE = ITEMS.register("green_hoe", () ->
            new HoeItem(ModItemTier.GREEN, -1, new Item.Properties().group(FirstMod.TAB)));

    //Armor
    public static final RegistryObject<ArmorItem> GREEN_HELMET = ITEMS.register("green_helmet", () ->
            new ArmorItem(ModArmorMaterial.GREEN, EquipmentSlotType.HEAD, new Item.Properties().group(FirstMod.TAB)));
    public static final RegistryObject<ArmorItem> GREEN_CHESTPLATE = ITEMS.register("green_chestplate", () ->
            new ArmorItem(ModArmorMaterial.GREEN, EquipmentSlotType.CHEST, new Item.Properties().group(FirstMod.TAB)));
    public static final RegistryObject<ArmorItem> GREEN_LEGGINGS = ITEMS.register("green_leggings", () ->
            new ArmorItem(ModArmorMaterial.GREEN, EquipmentSlotType.LEGS, new Item.Properties().group(FirstMod.TAB)));
    public static final RegistryObject<ArmorItem> GREEN_BOOTS = ITEMS.register("green_boots", () ->
            new ArmorItem(ModArmorMaterial.GREEN, EquipmentSlotType.FEET, new Item.Properties().group(FirstMod.TAB)));


    //Blocks
    public static final RegistryObject<Block> GREEN_BLOCK = BLOCKS.register("green_block", GreenBlock::new);
    public static final RegistryObject<Block> GREEN_ORE = BLOCKS.register("green_ore", GreenOre::new);

    //Block Items
    public static final RegistryObject<Item> GREEN_BLOCK_ITEM = ITEMS.register("green_block", () -> new BlockItemBase(GREEN_BLOCK.get()));
    public static final RegistryObject<Item> GREEN_ORE_ITEM = ITEMS.register("green_ore", () -> new BlockItemBase(GREEN_ORE.get()));

}
