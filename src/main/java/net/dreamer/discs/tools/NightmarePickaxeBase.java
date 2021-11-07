package net.dreamer.discs.tools;

import net.dreamer.discs.CreepyDiscsLmao;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;

public class NightmarePickaxeBase extends PickaxeItem {
    public NightmarePickaxeBase(ToolMaterial toolMaterial) {
        super(toolMaterial,6,-2.8F, new Settings().group(CreepyDiscsLmao.CREEPY_DISCS).fireproof().rarity(Rarity.EPIC));
    }
}
