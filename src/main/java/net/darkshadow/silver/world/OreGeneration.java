package net.darkshadow.silver.world;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.darkshadow.silver.SilverMod;
import net.darkshadow.silver.block.ModBlocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

public class OreGeneration {
    public static ConfiguredFeature<?, ?> ORE_SILVER_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.SILVER_ORE.getDefaultState(),
                    7))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(
                    YOffset.fixed(0),
                    YOffset.fixed(30)
            ))))
            .spreadHorizontally()
            .repeat(10);

    public static ConfiguredFeature<?, ?> DEEPSLATE_ORE_SILVER_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_SILVER_ORE.getDefaultState(),
                    6))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(
                    YOffset.fixed(0),
                    YOffset.fixed(30)
            ))))
            .spreadHorizontally()
            .repeat(10);

    public static void register() {
        RegistryKey<ConfiguredFeature<?, ?>> oreSilverOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(SilverMod.MOD_ID, "ore_silver_overworld"));
        RegistryKey<ConfiguredFeature<?, ?>> deepslateOreSilverOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(SilverMod.MOD_ID, "deepslate_ore_silver_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSilverOverworld.getValue(), ORE_SILVER_OVERWORLD);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, deepslateOreSilverOverworld.getValue(), DEEPSLATE_ORE_SILVER_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSilverOverworld);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, deepslateOreSilverOverworld);
    }
}