package net.dreamer.discs.tools;

import net.dreamer.discs.CreepyDiscsLmao;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;

public class NightmareAxeBase extends AxeItem {
    public NightmareAxeBase(ToolMaterial toolMaterial) {
        super(toolMaterial,10,-3.0F, new Settings().group(CreepyDiscsLmao.CREEPY_DISCS).fireproof().rarity(Rarity.EPIC));
    }
}
