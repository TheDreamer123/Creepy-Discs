package net.dreamer.discs.tools;

import net.dreamer.discs.CreepyDiscsLmao;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;

public class NightmareShovelBase extends ShovelItem {
    public NightmareShovelBase(ToolMaterial toolMaterial) {
        super(toolMaterial,6.5F,-3.0F, new Settings().group(CreepyDiscsLmao.CREEPY_DISCS).fireproof().rarity(Rarity.EPIC));
    }
}
