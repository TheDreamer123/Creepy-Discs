package net.dreamer.discs.tools;

import net.dreamer.discs.CreepyDiscsLmao;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;

public class NightmareHoeBase extends HoeItem {
    public NightmareHoeBase(ToolMaterial toolMaterial) {
        super(toolMaterial,0,0, new Settings().group(CreepyDiscsLmao.CREEPY_DISCS).fireproof().rarity(Rarity.EPIC));
    }
}
