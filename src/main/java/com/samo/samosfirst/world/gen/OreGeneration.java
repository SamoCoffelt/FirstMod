package com.samo.samosfirst.world.gen;

import com.samo.samosfirst.FirstMod;
import com.samo.samosfirst.util.RegistryHandler;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = FirstMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OreGeneration {

    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event)
    {
        OreGeneration.generateOre();
    }

    public static void generateOre() {
        for (Biome biome : ForgeRegistries.BIOMES) {
                ConfiguredPlacement customConfig = Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(30, 3, 5, 15));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig
                        (OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.GREEN_ORE.get().getDefaultState(), 8)));
            }
        }
    }

