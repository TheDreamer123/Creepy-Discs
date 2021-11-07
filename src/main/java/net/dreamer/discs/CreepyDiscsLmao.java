package net.dreamer.discs;

import net.dreamer.discs.armor.BaseArmor;
import net.dreamer.discs.armor.NightmareArmorMaterial;
import net.dreamer.discs.tools.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class CreepyDiscsLmao implements ModInitializer {

    public static final String MOD_ID = "creepy_discs";


    public static final ItemGroup CREEPY_DISCS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "creepy_discs"), () -> new ItemStack(CreepyDiscsLmao.MUSIC_DISC_CAVE1));


    public static final Identifier SOUND_CAVE1_ID = new Identifier("creepy_discs:music_disc.cave1");
    public static SoundEvent SOUND_CAVE1 = new SoundEvent(SOUND_CAVE1_ID);

    public static final Identifier SOUND_CAVE2_ID = new Identifier("creepy_discs:music_disc.cave2");
    public static SoundEvent SOUND_CAVE2 = new SoundEvent(SOUND_CAVE2_ID);

    public static final Identifier SOUND_CAVE3_ID = new Identifier("creepy_discs:music_disc.cave3");
    public static SoundEvent SOUND_CAVE3 = new SoundEvent(SOUND_CAVE3_ID);

    public static final Identifier SOUND_CAVE4_ID = new Identifier("creepy_discs:music_disc.cave4");
    public static SoundEvent SOUND_CAVE4 = new SoundEvent(SOUND_CAVE4_ID);

    public static final Identifier SOUND_CAVE5_ID = new Identifier("creepy_discs:music_disc.cave5");
    public static SoundEvent SOUND_CAVE5 = new SoundEvent(SOUND_CAVE5_ID);

    public static final Identifier SOUND_CAVE6_ID = new Identifier("creepy_discs:music_disc.cave6");
    public static SoundEvent SOUND_CAVE6 = new SoundEvent(SOUND_CAVE6_ID);

    public static final Identifier SOUND_CAVE7_ID = new Identifier("creepy_discs:music_disc.cave7");
    public static SoundEvent SOUND_CAVE7 = new SoundEvent(SOUND_CAVE7_ID);

    public static final Identifier SOUND_CAVE8_ID = new Identifier("creepy_discs:music_disc.cave8");
    public static SoundEvent SOUND_CAVE8 = new SoundEvent(SOUND_CAVE8_ID);

    public static final Identifier SOUND_CAVE9_ID = new Identifier("creepy_discs:music_disc.cave9");
    public static SoundEvent SOUND_CAVE9 = new SoundEvent(SOUND_CAVE9_ID);

    public static final Identifier SOUND_CAVE10_ID = new Identifier("creepy_discs:music_disc.cave10");
    public static SoundEvent SOUND_CAVE10 = new SoundEvent(SOUND_CAVE10_ID);

    public static final Identifier SOUND_CAVE11_ID = new Identifier("creepy_discs:music_disc.cave11");
    public static SoundEvent SOUND_CAVE11 = new SoundEvent(SOUND_CAVE11_ID);

    public static final Identifier SOUND_CAVE12_ID = new Identifier("creepy_discs:music_disc.cave12");
    public static SoundEvent SOUND_CAVE12 = new SoundEvent(SOUND_CAVE12_ID);

    public static final Identifier SOUND_CAVE13_ID = new Identifier("creepy_discs:music_disc.cave13");
    public static SoundEvent SOUND_CAVE13 = new SoundEvent(SOUND_CAVE13_ID);

    public static final Identifier SOUND_CAVE14_ID = new Identifier("creepy_discs:music_disc.cave14");
    public static SoundEvent SOUND_CAVE14 = new SoundEvent(SOUND_CAVE14_ID);

    public static final Identifier SOUND_CAVE15_ID = new Identifier("creepy_discs:music_disc.cave15");
    public static SoundEvent SOUND_CAVE15 = new SoundEvent(SOUND_CAVE15_ID);

    public static final Identifier SOUND_CAVE16_ID = new Identifier("creepy_discs:music_disc.cave16");
    public static SoundEvent SOUND_CAVE16 = new SoundEvent(SOUND_CAVE16_ID);

    public static final Identifier SOUND_CAVE17_ID = new Identifier("creepy_discs:music_disc.cave17");
    public static SoundEvent SOUND_CAVE17 = new SoundEvent(SOUND_CAVE17_ID);

    public static final Identifier SOUND_CAVE18_ID = new Identifier("creepy_discs:music_disc.cave18");
    public static SoundEvent SOUND_CAVE18 = new SoundEvent(SOUND_CAVE18_ID);

    public static final Identifier SOUND_CAVE19_ID = new Identifier("creepy_discs:music_disc.cave19");
    public static SoundEvent SOUND_CAVE19 = new SoundEvent(SOUND_CAVE19_ID);

    public static final Identifier SOUND_UNDERWATER1_ID = new Identifier("creepy_discs:music_disc.underwater1");
    public static SoundEvent SOUND_UNDERWATER1 = new SoundEvent(SOUND_UNDERWATER1_ID);

    public static final Identifier SOUND_UNDERWATER2_ID = new Identifier("creepy_discs:music_disc.underwater2");
    public static SoundEvent SOUND_UNDERWATER2 = new SoundEvent(SOUND_UNDERWATER2_ID);

    public static final Identifier SOUND_UNDERWATER3_ID = new Identifier("creepy_discs:music_disc.underwater3");
    public static SoundEvent SOUND_UNDERWATER3 = new SoundEvent(SOUND_UNDERWATER3_ID);

    public static final Identifier SOUND_UNDERWATER4_ID = new Identifier("creepy_discs:music_disc.underwater4");
    public static SoundEvent SOUND_UNDERWATER4 = new SoundEvent(SOUND_UNDERWATER4_ID);

    public static final Identifier SOUND_UNDERWATER5_ID = new Identifier("creepy_discs:music_disc.underwater5");
    public static SoundEvent SOUND_UNDERWATER5 = new SoundEvent(SOUND_UNDERWATER5_ID);

    public static final Identifier SOUND_UNDERWATER6_ID = new Identifier("creepy_discs:music_disc.underwater6");
    public static SoundEvent SOUND_UNDERWATER6 = new SoundEvent(SOUND_UNDERWATER6_ID);

    public static final Identifier SOUND_UNDERWATER7_ID = new Identifier("creepy_discs:music_disc.underwater7");
    public static SoundEvent SOUND_UNDERWATER7 = new SoundEvent(SOUND_UNDERWATER7_ID);

    public static final Identifier SOUND_UNDERWATER8_ID = new Identifier("creepy_discs:music_disc.underwater8");
    public static SoundEvent SOUND_UNDERWATER8 = new SoundEvent(SOUND_UNDERWATER8_ID);

    public static final Identifier SOUND_UNDERWATER9_ID = new Identifier("creepy_discs:music_disc.underwater9");
    public static SoundEvent SOUND_UNDERWATER9 = new SoundEvent(SOUND_UNDERWATER9_ID);

    public static final Identifier SOUND_UNDERWATER10_ID = new Identifier("creepy_discs:music_disc.underwater10");
    public static SoundEvent SOUND_UNDERWATER10 = new SoundEvent(SOUND_UNDERWATER10_ID);

    public static final Identifier SOUND_UNDERWATER11_ID = new Identifier("creepy_discs:music_disc.underwater11");
    public static SoundEvent SOUND_UNDERWATER11 = new SoundEvent(SOUND_UNDERWATER11_ID);

    public static final Identifier SOUND_NETHER1_ID = new Identifier("creepy_discs:music_disc.nether1");
    public static SoundEvent SOUND_NETHER1 = new SoundEvent(SOUND_NETHER1_ID);

    public static final Identifier SOUND_NETHER2_ID = new Identifier("creepy_discs:music_disc.nether2");
    public static SoundEvent SOUND_NETHER2 = new SoundEvent(SOUND_NETHER2_ID);

    public static final Identifier SOUND_NETHER3_ID = new Identifier("creepy_discs:music_disc.nether3");
    public static SoundEvent SOUND_NETHER3 = new SoundEvent(SOUND_NETHER3_ID);

    public static final Identifier SOUND_NETHER4_ID = new Identifier("creepy_discs:music_disc.nether4");
    public static SoundEvent SOUND_NETHER4 = new SoundEvent(SOUND_NETHER4_ID);

    public static final Identifier SOUND_NETHER5_ID = new Identifier("creepy_discs:music_disc.nether5");
    public static SoundEvent SOUND_NETHER5 = new SoundEvent(SOUND_NETHER5_ID);

    public static final Identifier SOUND_SUMMONING_OF_SATAN_ID = new Identifier("creepy_discs:music_disc.summoning_of_satan");
    public static SoundEvent SOUND_SUMMONING_OF_SATAN = new SoundEvent(SOUND_SUMMONING_OF_SATAN_ID);


    public static final Item MUSIC_DISC_CAVE1 = new ExtendMusicDiscItem(14, SOUND_CAVE1, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_CAVE2 = new ExtendMusicDiscItem(14, SOUND_CAVE2, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_CAVE3 = new ExtendMusicDiscItem(14, SOUND_CAVE3, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_CAVE4 = new ExtendMusicDiscItem(14, SOUND_CAVE4, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_CAVE5 = new ExtendMusicDiscItem(14, SOUND_CAVE5, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_CAVE6 = new ExtendMusicDiscItem(14, SOUND_CAVE6, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_CAVE7 = new ExtendMusicDiscItem(14, SOUND_CAVE7, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_CAVE8 = new ExtendMusicDiscItem(14, SOUND_CAVE8, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_CAVE9 = new ExtendMusicDiscItem(14, SOUND_CAVE9, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_CAVE10 = new ExtendMusicDiscItem(14, SOUND_CAVE10, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_CAVE11 = new ExtendMusicDiscItem(14, SOUND_CAVE11, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_CAVE12 = new ExtendMusicDiscItem(14, SOUND_CAVE12, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_CAVE13 = new ExtendMusicDiscItem(14, SOUND_CAVE13, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_CAVE14 = new ExtendMusicDiscItem(14, SOUND_CAVE14, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_CAVE15 = new ExtendMusicDiscItem(14, SOUND_CAVE15, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_CAVE16 = new ExtendMusicDiscItem(14, SOUND_CAVE16, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_CAVE17 = new ExtendMusicDiscItem(14, SOUND_CAVE17, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_CAVE18 = new ExtendMusicDiscItem(14, SOUND_CAVE18, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_CAVE19 = new ExtendMusicDiscItem(14, SOUND_CAVE19, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_UNDERWATER1 = new ExtendMusicDiscItem(14, SOUND_UNDERWATER1, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_UNDERWATER2 = new ExtendMusicDiscItem(14, SOUND_UNDERWATER2, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_UNDERWATER3 = new ExtendMusicDiscItem(14, SOUND_UNDERWATER3, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_UNDERWATER4 = new ExtendMusicDiscItem(14, SOUND_UNDERWATER4, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_UNDERWATER5 = new ExtendMusicDiscItem(14, SOUND_UNDERWATER5, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_UNDERWATER6 = new ExtendMusicDiscItem(14, SOUND_UNDERWATER6, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_UNDERWATER7 = new ExtendMusicDiscItem(14, SOUND_UNDERWATER7, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_UNDERWATER8 = new ExtendMusicDiscItem(14, SOUND_UNDERWATER8, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_UNDERWATER9 = new ExtendMusicDiscItem(14, SOUND_UNDERWATER9, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_UNDERWATER10 = new ExtendMusicDiscItem(14, SOUND_UNDERWATER10, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_UNDERWATER11 = new ExtendMusicDiscItem(14, SOUND_UNDERWATER11, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_NETHER1 = new ExtendMusicDiscItem(14, SOUND_NETHER1, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_NETHER2 = new ExtendMusicDiscItem(14, SOUND_NETHER2, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_NETHER3 = new ExtendMusicDiscItem(14, SOUND_NETHER3, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_NETHER4 = new ExtendMusicDiscItem(14, SOUND_NETHER4, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_NETHER5 = new ExtendMusicDiscItem(14, SOUND_NETHER5, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));


    public static final Item DISC_CHUNK1 = new Item(new Item.Settings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item DISC_CHUNK2 = new Item(new Item.Settings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item DISC_CHUNK3 = new Item(new Item.Settings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item DISC_CHUNK4 = new Item(new Item.Settings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));

    public static final Item MUSIC_DISC_SUMMONING_OF_SATAN = new ExtendMusicDiscItem(14, SOUND_SUMMONING_OF_SATAN, new FabricItemSettings().group(CREEPY_DISCS).rarity(Rarity.EPIC).maxCount(1));


    public static final Item NIGHTMARE_FUEL = new Item(new Item.Settings().group(CREEPY_DISCS).rarity(Rarity.EPIC).fireproof());


    public static final ArmorMaterial NIGHTMARE_ARMOR = new NightmareArmorMaterial();


    public static final Block NIGHTMARE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 4).requiresTool().sounds(BlockSoundGroup.NETHERITE).strength(50.0F, 1200.0F));

    @Override
    public void onInitialize() {

        Registry.register(Registry.SOUND_EVENT, SOUND_CAVE1_ID, SOUND_CAVE1);

        Registry.register(Registry.SOUND_EVENT, SOUND_CAVE2_ID, SOUND_CAVE2);

        Registry.register(Registry.SOUND_EVENT, SOUND_CAVE3_ID, SOUND_CAVE3);

        Registry.register(Registry.SOUND_EVENT, SOUND_CAVE4_ID, SOUND_CAVE4);

        Registry.register(Registry.SOUND_EVENT, SOUND_CAVE5_ID, SOUND_CAVE5);

        Registry.register(Registry.SOUND_EVENT, SOUND_CAVE6_ID, SOUND_CAVE6);

        Registry.register(Registry.SOUND_EVENT, SOUND_CAVE7_ID, SOUND_CAVE7);

        Registry.register(Registry.SOUND_EVENT, SOUND_CAVE8_ID, SOUND_CAVE8);

        Registry.register(Registry.SOUND_EVENT, SOUND_CAVE9_ID, SOUND_CAVE9);

        Registry.register(Registry.SOUND_EVENT, SOUND_CAVE10_ID, SOUND_CAVE10);

        Registry.register(Registry.SOUND_EVENT, SOUND_CAVE11_ID, SOUND_CAVE11);

        Registry.register(Registry.SOUND_EVENT, SOUND_CAVE12_ID, SOUND_CAVE12);

        Registry.register(Registry.SOUND_EVENT, SOUND_CAVE13_ID, SOUND_CAVE13);

        Registry.register(Registry.SOUND_EVENT, SOUND_CAVE14_ID, SOUND_CAVE14);

        Registry.register(Registry.SOUND_EVENT, SOUND_CAVE15_ID, SOUND_CAVE15);

        Registry.register(Registry.SOUND_EVENT, SOUND_CAVE16_ID, SOUND_CAVE16);

        Registry.register(Registry.SOUND_EVENT, SOUND_CAVE17_ID, SOUND_CAVE17);

        Registry.register(Registry.SOUND_EVENT, SOUND_CAVE18_ID, SOUND_CAVE18);

        Registry.register(Registry.SOUND_EVENT, SOUND_CAVE19_ID, SOUND_CAVE19);

        Registry.register(Registry.SOUND_EVENT, SOUND_UNDERWATER1_ID, SOUND_UNDERWATER1);

        Registry.register(Registry.SOUND_EVENT, SOUND_UNDERWATER2_ID, SOUND_UNDERWATER2);

        Registry.register(Registry.SOUND_EVENT, SOUND_UNDERWATER3_ID, SOUND_UNDERWATER3);

        Registry.register(Registry.SOUND_EVENT, SOUND_UNDERWATER4_ID, SOUND_UNDERWATER4);

        Registry.register(Registry.SOUND_EVENT, SOUND_UNDERWATER5_ID, SOUND_UNDERWATER5);

        Registry.register(Registry.SOUND_EVENT, SOUND_UNDERWATER6_ID, SOUND_UNDERWATER6);

        Registry.register(Registry.SOUND_EVENT, SOUND_UNDERWATER7_ID, SOUND_UNDERWATER7);

        Registry.register(Registry.SOUND_EVENT, SOUND_UNDERWATER8_ID, SOUND_UNDERWATER8);

        Registry.register(Registry.SOUND_EVENT, SOUND_UNDERWATER9_ID, SOUND_UNDERWATER9);

        Registry.register(Registry.SOUND_EVENT, SOUND_UNDERWATER10_ID, SOUND_UNDERWATER10);

        Registry.register(Registry.SOUND_EVENT, SOUND_NETHER1_ID, SOUND_NETHER1);

        Registry.register(Registry.SOUND_EVENT, SOUND_NETHER2_ID, SOUND_NETHER2);

        Registry.register(Registry.SOUND_EVENT, SOUND_NETHER3_ID, SOUND_NETHER3);

        Registry.register(Registry.SOUND_EVENT, SOUND_NETHER4_ID, SOUND_NETHER4);

        Registry.register(Registry.SOUND_EVENT, SOUND_NETHER5_ID, SOUND_NETHER5);

        Registry.register(Registry.SOUND_EVENT, SOUND_SUMMONING_OF_SATAN_ID, SOUND_SUMMONING_OF_SATAN);


        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_cave1"), MUSIC_DISC_CAVE1);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_cave2"), MUSIC_DISC_CAVE2);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_cave3"), MUSIC_DISC_CAVE3);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_cave4"), MUSIC_DISC_CAVE4);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_cave5"), MUSIC_DISC_CAVE5);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_cave6"), MUSIC_DISC_CAVE6);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_cave7"), MUSIC_DISC_CAVE7);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_cave8"), MUSIC_DISC_CAVE8);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_cave9"), MUSIC_DISC_CAVE9);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_cave10"), MUSIC_DISC_CAVE10);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_cave11"), MUSIC_DISC_CAVE11);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_cave12"), MUSIC_DISC_CAVE12);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_cave13"), MUSIC_DISC_CAVE13);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_cave14"), MUSIC_DISC_CAVE14);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_cave15"), MUSIC_DISC_CAVE15);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_cave16"), MUSIC_DISC_CAVE16);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_cave17"), MUSIC_DISC_CAVE17);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_cave18"), MUSIC_DISC_CAVE18);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_cave19"), MUSIC_DISC_CAVE19);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_underwater1"), MUSIC_DISC_UNDERWATER1);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_underwater2"), MUSIC_DISC_UNDERWATER2);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_underwater3"), MUSIC_DISC_UNDERWATER3);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_underwater4"), MUSIC_DISC_UNDERWATER4);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_underwater5"), MUSIC_DISC_UNDERWATER5);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_underwater6"), MUSIC_DISC_UNDERWATER6);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_underwater7"), MUSIC_DISC_UNDERWATER7);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_underwater8"), MUSIC_DISC_UNDERWATER8);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_underwater9"), MUSIC_DISC_UNDERWATER9);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_underwater10"), MUSIC_DISC_UNDERWATER10);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_underwater11"), MUSIC_DISC_UNDERWATER11);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_nether1"), MUSIC_DISC_NETHER1);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_nether2"), MUSIC_DISC_NETHER2);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_nether3"), MUSIC_DISC_NETHER3);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_nether4"), MUSIC_DISC_NETHER4);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_nether5"), MUSIC_DISC_NETHER5);


        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "disc_chunk1"), DISC_CHUNK1);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "disc_chunk2"), DISC_CHUNK2);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "disc_chunk3"), DISC_CHUNK3);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "disc_chunk4"), DISC_CHUNK4);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_summoning_of_satan"), MUSIC_DISC_SUMMONING_OF_SATAN);


        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nightmare_fuel"), NIGHTMARE_FUEL);
        FuelRegistry.INSTANCE.add(NIGHTMARE_FUEL, 16000);


        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nightmare_sword"), new NightmareSwordBase(new NightmareToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nightmare_pickaxe"), new NightmarePickaxeBase(new NightmareToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nightmare_axe"), new NightmareAxeBase(new NightmareToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nightmare_shovel"), new NightmareShovelBase(new NightmareToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nightmare_hoe"), new NightmareHoeBase(new NightmareToolMaterial()));


        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nightmare_helmet"), new BaseArmor(NIGHTMARE_ARMOR,EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nightmare_chestplate"), new BaseArmor(NIGHTMARE_ARMOR,EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nightmare_leggings"), new BaseArmor(NIGHTMARE_ARMOR,EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nightmare_boots"), new BaseArmor(NIGHTMARE_ARMOR,EquipmentSlot.FEET));


        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "nightmare_block"), NIGHTMARE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nightmare_block"), new BlockItem(NIGHTMARE_BLOCK, new FabricItemSettings().group(CREEPY_DISCS).fireproof().rarity(Rarity.EPIC)));


        System.out.println("Creepy Discs loaded successfully. Welcome to madness! Enjoy your stay.");
    }
}