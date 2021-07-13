package net.darkshadow.silver.item;

import net.darkshadow.silver.food.SilverCarrot;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.darkshadow.silver.SilverMod;
import net.darkshadow.silver.armor.SilverArmorMaterial;
import net.darkshadow.silver.tools.SilverAxe;
import net.darkshadow.silver.tools.SilverHoe;
import net.darkshadow.silver.tools.SilverPickaxe;
import net.darkshadow.silver.tools.SilverToolMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item SILVER_CARROT = new Item(new FabricItemSettings().group(SilverMod.SILVER_GROUP).food(SilverCarrot.SILVER_CARROT));

    public static final ArmorMaterial silverArmorMaterial = new SilverArmorMaterial();

    public static final Item SILVER_INGOT = new Item(new FabricItemSettings().group(SilverMod.SILVER_GROUP));
    public static final Item RAW_SILVER_INGOT = new Item(new FabricItemSettings().group(SilverMod.SILVER_GROUP));

    // Armor
    public static final Item SILVER_HELMET = new ArmorItem(silverArmorMaterial, EquipmentSlot.HEAD, new FabricItemSettings().group(SilverMod.SILVER_GROUP));
    public static final Item SILVER_CHESTPLATE = new ArmorItem(silverArmorMaterial, EquipmentSlot.CHEST, new FabricItemSettings().group(SilverMod.SILVER_GROUP));
    public static final Item SILVER_LEGGINGS = new ArmorItem(silverArmorMaterial, EquipmentSlot.LEGS, new FabricItemSettings().group(SilverMod.SILVER_GROUP));
    public static final Item SILVER_BOOTS = new ArmorItem(silverArmorMaterial, EquipmentSlot.FEET, new FabricItemSettings().group(SilverMod.SILVER_GROUP));

    // Tools
    public static ToolItem SILVER_SWORD = new SwordItem(SilverToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings().group(SilverMod.SILVER_GROUP));
    public static ToolItem SILVER_SHOVEL = new ShovelItem(SilverToolMaterial.INSTANCE, 1.5F, -3.0F, new Item.Settings().group(SilverMod.SILVER_GROUP));
    public static SilverPickaxe SILVER_PICKAXE = new SilverPickaxe(SilverToolMaterial.INSTANCE, 1, -2.8F, new Item.Settings().group(SilverMod.SILVER_GROUP));
    public static SilverAxe SILVER_AXE = new SilverAxe(SilverToolMaterial.INSTANCE, 7, -3.2F, new Item.Settings().group(SilverMod.SILVER_GROUP));
    public static SilverHoe SILVER_HOE = new SilverHoe(SilverToolMaterial.INSTANCE, 7, -3.2F, new Item.Settings().group(SilverMod.SILVER_GROUP));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(SilverMod.MOD_ID, "silver_carrot"), SILVER_CARROT);
        Registry.register(Registry.ITEM, new Identifier(SilverMod.MOD_ID, "silver_ingot"), SILVER_INGOT);
        Registry.register(Registry.ITEM, new Identifier(SilverMod.MOD_ID, "raw_silver_ingot"), RAW_SILVER_INGOT);
        Registry.register(Registry.ITEM, new Identifier(SilverMod.MOD_ID, "silver_helmet"), SILVER_HELMET);
        Registry.register(Registry.ITEM, new Identifier(SilverMod.MOD_ID, "silver_chestplate"), SILVER_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(SilverMod.MOD_ID, "silver_leggings"), SILVER_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(SilverMod.MOD_ID, "silver_boots"), SILVER_BOOTS);
        Registry.register(Registry.ITEM, new Identifier(SilverMod.MOD_ID, "silver_sword"), SILVER_SWORD);
        Registry.register(Registry.ITEM, new Identifier(SilverMod.MOD_ID, "silver_shovel"), SILVER_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(SilverMod.MOD_ID, "silver_pickaxe"), SILVER_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(SilverMod.MOD_ID, "silver_axe"), SILVER_AXE);
        Registry.register(Registry.ITEM, new Identifier(SilverMod.MOD_ID, "silver_hoe"), SILVER_HOE);
    }
}