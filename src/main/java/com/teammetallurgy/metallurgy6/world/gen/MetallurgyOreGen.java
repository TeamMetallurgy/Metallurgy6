package com.teammetallurgy.metallurgy6.world.gen;

import com.teammetallurgy.metallurgy6.objects.blocks.MetallurgyOres;
import com.teammetallurgy.metallurgy6.util.MetallurgyOreWrapper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class MetallurgyOreGen {

    public static void generateOres(){
        for(Biome b : ForgeRegistries.BIOMES){
            for(MetallurgyOreWrapper oreWrapper : MetallurgyOres.ORE_WRAPPERS){
                if(oreWrapper.getTempCategory() == null || b.getTempCategory() == oreWrapper.getTempCategory()){
                    addOreToBiome(b, oreWrapper);
                }
            }
        }
    }

    private static void addOreToBiome(Biome b, MetallurgyOreWrapper oreWrapper){
        ConfiguredPlacement orePlacement = Placement.COUNT_RANGE.configure(
                new CountRangeConfig(oreWrapper.getRarity(), oreWrapper.getOffsetX(), oreWrapper.getOffsetY(), oreWrapper.getMaxYLevel())
        );
        b.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                        oreWrapper.getOre().getDefaultState(), oreWrapper.getMaxVeinSize()))
                .withPlacement(orePlacement)
        );
    }
}
