package net.dreamer.discs.tools;

import net.dreamer.discs.CreepyDiscsLmao;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;

public class NightmareSwordBase extends SwordItem {
    public NightmareSwordBase(ToolMaterial toolMaterial) {
        super(toolMaterial,8,-2.4F, new Item.Settings().group(CreepyDiscsLmao.CREEPY_DISCS).fireproof().rarity(Rarity.EPIC));
    }
}
