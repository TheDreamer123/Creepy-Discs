package net.dreamer.discs.armor;

import net.dreamer.discs.CreepyDiscsLmao;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class NightmareArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {23, 25, 26, 21};
    private static final int[] PROTECTION_VALUES = new int[] {3, 6, 8, 3};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 25;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 17;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ENTITY_ENDERMAN_DEATH;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(CreepyDiscsLmao.NIGHTMARE_FUEL);
    }

    @Override
    public String getName() {
        return "nightmare";
    }

    @Override
    public float getToughness() {
        return 4.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.2F;
    }
}