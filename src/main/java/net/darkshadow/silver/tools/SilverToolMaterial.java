package net.darkshadow.silver.tools;

import net.darkshadow.silver.item.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class SilverToolMaterial implements ToolMaterial {
    public static final SilverToolMaterial INSTANCE = new SilverToolMaterial();

    @Override
    public int getDurability() {
        return 750;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7.0F;
    }

    @Override
    public float getAttackDamage() {
        return 2.5F;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 12;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.SILVER_INGOT);
    }
}
