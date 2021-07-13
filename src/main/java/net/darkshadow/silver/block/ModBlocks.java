package net.darkshadow.silver.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.darkshadow.silver.SilverMod;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final OreBlock SILVER_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4, 5).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().sounds(BlockSoundGroup.STONE));
    public static final OreBlock DEEPSLATE_SILVER_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(5.5F, 6).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().sounds(BlockSoundGroup.DEEPSLATE));
    public static final Block SILVER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5, 6).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().sounds(BlockSoundGroup.METAL));
    public static final Block RAW_SILVER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.5F, 6).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().sounds(BlockSoundGroup.METAL));

    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(SilverMod.MOD_ID, "silver_ore"), SILVER_ORE);
        Registry.register(Registry.ITEM, new Identifier(SilverMod.MOD_ID, "silver_ore"), new BlockItem(SILVER_ORE, new FabricItemSettings().group(SilverMod.SILVER_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(SilverMod.MOD_ID, "deepslate_silver_ore"), DEEPSLATE_SILVER_ORE);
        Registry.register(Registry.ITEM, new Identifier(SilverMod.MOD_ID, "deepslate_silver_ore"), new BlockItem(DEEPSLATE_SILVER_ORE, new FabricItemSettings().group(SilverMod.SILVER_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(SilverMod.MOD_ID, "silver_block"), SILVER_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(SilverMod.MOD_ID, "silver_block"), new BlockItem(SILVER_BLOCK, new FabricItemSettings().group(SilverMod.SILVER_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(SilverMod.MOD_ID, "raw_silver_block"), RAW_SILVER_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(SilverMod.MOD_ID, "raw_silver_block"), new BlockItem(RAW_SILVER_BLOCK, new FabricItemSettings().group(SilverMod.SILVER_GROUP)));
    }
}
