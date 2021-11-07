package net.dreamer.discs.armor;

import net.dreamer.discs.CreepyDiscsLmao;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.util.Rarity;

public class BaseArmor extends ArmorItem {

    public BaseArmor(ArmorMaterial material,EquipmentSlot slot) {
        super(material, slot, new FabricItemSettings().group(CreepyDiscsLmao.CREEPY_DISCS).fireproof().rarity(Rarity.EPIC));
    }
}
