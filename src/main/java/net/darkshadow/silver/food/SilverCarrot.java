package net.darkshadow.silver.food;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SilverCarrot extends Item {

    public SilverCarrot(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    public static final FoodComponent SILVER_CARROT = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.6F).statusEffect(
            new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1), 1.0F
    ).statusEffect(
            new StatusEffectInstance(StatusEffects.RESISTANCE, 3000, 0), 1.0F
    ).statusEffect(
            new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 3000, 0), 1.0F
    ).statusEffect(
            new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 1), 1.0F
    ).alwaysEdible().build();

}