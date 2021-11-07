package net.dreamer.discs;

import net.minecraft.item.MusicDiscItem;
import net.minecraft.sound.SoundEvent;

public class ExtendMusicDiscItem extends MusicDiscItem {
    public ExtendMusicDiscItem(int comparatorOutput,SoundEvent sound,Settings settings) {
        super(comparatorOutput,sound,settings);
    }
}