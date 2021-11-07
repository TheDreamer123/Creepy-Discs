package net.dreamer.discs.tools;

import net.dreamer.discs.CreepyDiscsLmao;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class NightmareToolMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 3032;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 11;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 17;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(CreepyDiscsLmao.NIGHTMARE_FUEL);
    }
}