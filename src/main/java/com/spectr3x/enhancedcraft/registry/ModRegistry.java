package com.spectr3x.enhancedcraft.registry;

import com.spectr3x.enhancedcraft.EnhancedCraft;
import com.spectr3x.enhancedcraft.registry.tools.EtheriumSwordItem;
import com.spectr3x.enhancedcraft.registry.tools.EtheriumPickaxeItem;
import com.spectr3x.enhancedcraft.registry.tools.BronzeSwordItem;
import com.spectr3x.enhancedcraft.registry.tools.BronzePickaxeItem;
import com.spectr3x.enhancedcraft.registry.tools.AlloySwordMaterial;
import com.spectr3x.enhancedcraft.registry.tools.AlloyToolAlternateMaterial;
import com.spectr3x.enhancedcraft.registry.tools.AlloyToolMaterial;
import com.spectr3x.enhancedcraft.registry.tools.AlloySwordItem;
import com.spectr3x.enhancedcraft.registry.tools.AlloyPickaxeItem;
import com.spectr3x.enhancedcraft.registry.tools.AlloyAxeItem;
import com.spectr3x.enhancedcraft.registry.tools.AlloyShovelItem;
import com.spectr3x.enhancedcraft.registry.tools.AlloyHoeItem;
import com.spectr3x.enhancedcraft.registry.tools.BronzeAxeItem;
import com.spectr3x.enhancedcraft.registry.tools.BronzeShovelItem;
import com.spectr3x.enhancedcraft.registry.tools.BronzeHoeItem;
import com.spectr3x.enhancedcraft.registry.tools.BronzeToolMaterial;
import com.spectr3x.enhancedcraft.registry.tools.BronzeHoeMaterial;
import com.spectr3x.enhancedcraft.registry.tools.EtheriumAxeItem;
import com.spectr3x.enhancedcraft.registry.tools.EtheriumShovelItem;
import com.spectr3x.enhancedcraft.registry.tools.EtheriumHoeItem;
import com.spectr3x.enhancedcraft.registry.tools.EtheriumToolMaterial;
import com.spectr3x.enhancedcraft.registry.tools.GiantSwordItem;
import com.spectr3x.enhancedcraft.registry.tools.GiantToolMaterial;
import com.spectr3x.enhancedcraft.registry.tools.ObsidianSwordItem;
import com.spectr3x.enhancedcraft.registry.tools.ObsidianPickaxeItem;
import com.spectr3x.enhancedcraft.registry.tools.ObsidianAxeItem;
import com.spectr3x.enhancedcraft.registry.tools.ObsidianShovelItem;
import com.spectr3x.enhancedcraft.registry.tools.ObsidianHoeItem;
import com.spectr3x.enhancedcraft.registry.tools.ObsidianToolMaterial;
import com.spectr3x.enhancedcraft.registry.tools.SwordOfTheNight;
import com.spectr3x.enhancedcraft.registry.tools.SwordOfTheNightToolMaterial;
import com.spectr3x.enhancedcraft.registry.armor.CustomArmorMaterials;
import com.spectr3x.enhancedcraft.registry.blocks.EtheriumOreBlock;
import com.spectr3x.enhancedcraft.registry.blocks.GemstoneBlock;
import com.spectr3x.enhancedcraft.registry.blocks.BronzeOreBlock;
import com.spectr3x.enhancedcraft.registry.materials.PrimordialCatalyst;
import com.spectr3x.enhancedcraft.registry.materials.TomYumStew;
import com.spectr3x.enhancedcraft.registry.misc.SoakedHandsMusicDisc;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ModRegistry {
    public static final ItemGroup ENHANCED_GROUP = FabricItemGroupBuilder.create(
        new Identifier(EnhancedCraft.MOD_ID, "group"))
                                                    .icon(() -> new ItemStack(Items.NETHERITE_SWORD))
                                                    .build();

    // SoundEvents Registry
    public static final Identifier SoakedHands = new Identifier("enhancedcraft:soaked_hands");
    public static SoundEvent SoakedHandsSoundEvent = new SoundEvent(SoakedHands);


    // Block Definitions
    public static final Block EtheriumOreBlock = new EtheriumOreBlock();
    public static final Block BronzeOreBlock = new BronzeOreBlock();
    public static final Block GemstoneBlock = new GemstoneBlock();


    // Item Definitions
    public static final Item Etherium = new Item (new Item.Settings().group(ENHANCED_GROUP).rarity(Rarity.EPIC));
    public static final Item EtheriumOreItem = new BlockItem(EtheriumOreBlock, new Item.Settings().group(ENHANCED_GROUP));
    public static final Item EtheriumHelmet = new ArmorItem(CustomArmorMaterials.EtheriumArmor, EquipmentSlot.HEAD, (new Item.Settings().group(ENHANCED_GROUP)));
    public static final Item EtheriumChestplate = new ArmorItem(CustomArmorMaterials.EtheriumArmor, EquipmentSlot.CHEST, (new Item.Settings().group(ENHANCED_GROUP)));
    public static final Item EtheriumLeggings = new ArmorItem(CustomArmorMaterials.EtheriumArmor, EquipmentSlot.LEGS, (new Item.Settings().group(ENHANCED_GROUP)));
    public static final Item EtheriumBoots = new ArmorItem(CustomArmorMaterials.EtheriumArmor, EquipmentSlot.FEET, (new Item.Settings().group(ENHANCED_GROUP)));
    public static final Item EtheriumSwordItem = new EtheriumSwordItem(new EtheriumToolMaterial());
    public static final Item EtheriumPickaxeItem = new EtheriumPickaxeItem(new EtheriumToolMaterial());
    public static final Item EtheriumAxeItem = new EtheriumAxeItem(new EtheriumToolMaterial());
    public static final Item EtheriumShovelItem = new EtheriumShovelItem(new EtheriumToolMaterial());
    public static final Item EtheriumHoeItem = new EtheriumHoeItem(new EtheriumToolMaterial());

    public static final Item ObsidianSwordItem = new ObsidianSwordItem(new ObsidianToolMaterial());
    public static final Item ObsidianPickaxeItem = new ObsidianPickaxeItem(new ObsidianToolMaterial());
    public static final Item ObsidianAxeItem = new ObsidianAxeItem(new ObsidianToolMaterial());
    public static final Item ObsidianShovelItem = new ObsidianShovelItem(new ObsidianToolMaterial());
    public static final Item ObsidianHoeItem = new ObsidianHoeItem(new ObsidianToolMaterial());

    public static final Item GiantSwordItem = new GiantSwordItem(new GiantToolMaterial());

    public static final Item GemstoneBlockItem = new BlockItem(GemstoneBlock, new Item.Settings().group(ENHANCED_GROUP));
    public static final Item GemstoneShard = new Item (new Item.Settings().group(ENHANCED_GROUP));
    public static final Item GemstoneApple = new Item (new Item.Settings().group(ENHANCED_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(9.6f).alwaysEdible().statusEffect((new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 20, 0)), 1f).statusEffect((new StatusEffectInstance(StatusEffects.RESISTANCE, 20 * 30, 0)), 1f).build()));
    public static final Item Gemfuel = new Item (new Item.Settings().group(ENHANCED_GROUP));

    public static final Item PrimordialCatalyst = new PrimordialCatalyst();
    public static final Item TomYumStew = new TomYumStew();

    public static final Item SwordOfTheNight = new SwordOfTheNight(new SwordOfTheNightToolMaterial());

    public static final Item BronzeIngot = new Item (new Item.Settings().group(ENHANCED_GROUP));
    public static final Item BronzeOreItem = new BlockItem(BronzeOreBlock, new Item.Settings().group(ENHANCED_GROUP));
    public static final Item BronzeHelmet = new ArmorItem(CustomArmorMaterials.BronzeArmor, EquipmentSlot.HEAD, (new Item.Settings().group(ENHANCED_GROUP)));
    public static final Item BronzeChestplate = new ArmorItem(CustomArmorMaterials.BronzeArmor, EquipmentSlot.CHEST, (new Item.Settings().group(ENHANCED_GROUP)));
    public static final Item BronzeLeggings = new ArmorItem(CustomArmorMaterials.BronzeArmor, EquipmentSlot.LEGS, (new Item.Settings().group(ENHANCED_GROUP)));
    public static final Item BronzeBoots = new ArmorItem(CustomArmorMaterials.BronzeArmor, EquipmentSlot.FEET, (new Item.Settings().group(ENHANCED_GROUP)));
    public static final Item BronzeSwordItem = new BronzeSwordItem(new BronzeToolMaterial());
    public static final Item BronzePickaxeItem = new BronzePickaxeItem(new BronzeToolMaterial());
    public static final Item BronzeAxeItem = new BronzeAxeItem(new BronzeToolMaterial());
    public static final Item BronzeShovelItem = new BronzeShovelItem(new BronzeToolMaterial());
    public static final Item BronzeHoeItem = new BronzeHoeItem(new BronzeHoeMaterial());

    public static final Item MetalAlloy = new Item (new Item.Settings().group(ENHANCED_GROUP).rarity(Rarity.UNCOMMON));
    public static final Item AlloyHelmet = new ArmorItem(CustomArmorMaterials.AlloyArmor, EquipmentSlot.HEAD, (new Item.Settings().group(ENHANCED_GROUP)));
    public static final Item AlloyChestplate = new ArmorItem(CustomArmorMaterials.AlloyArmor, EquipmentSlot.CHEST, (new Item.Settings().group(ENHANCED_GROUP)));
    public static final Item AlloyLeggings = new ArmorItem(CustomArmorMaterials.AlloyArmor, EquipmentSlot.LEGS, (new Item.Settings().group(ENHANCED_GROUP)));
    public static final Item AlloyBoots = new ArmorItem(CustomArmorMaterials.AlloyArmor, EquipmentSlot.FEET, (new Item.Settings().group(ENHANCED_GROUP)));
    public static final Item AlloySwordItem = new AlloySwordItem(new AlloySwordMaterial());
    public static final Item AlloyPickaxeItem = new AlloyPickaxeItem(new AlloyToolAlternateMaterial());
    public static final Item AlloyAxeItem = new AlloyAxeItem(new AlloyToolMaterial());
    public static final Item AlloyShovelItem = new AlloyShovelItem(new AlloyToolMaterial());
    public static final Item AlloyHoeItem = new AlloyHoeItem(new AlloyToolMaterial());

    public static final Item SoakedHandsMusicDisc = new SoakedHandsMusicDisc(0, SoakedHandsSoundEvent);


    // Ore Generation Definitions
    public static ConfiguredFeature<?, ?> EtheriumOreFeature = Feature.ORE
    .configure(new OreFeatureConfig(
      OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
      ModRegistry.EtheriumOreBlock.getDefaultState(),
      2)) // vein size
    .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
      0, // bottom offset
      0, // min y level
      9))) // max y level
    .spreadHorizontally()
    .method_30377(8) // Circular spread
    .repeat(2); // number of veins per chunk

    public static ConfiguredFeature<?, ?> BronzeOreFeature = Feature.ORE
    .configure(new OreFeatureConfig(
      OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
      ModRegistry.BronzeOreBlock.getDefaultState(),
      15)) // vein size
    .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
      0, // bottom offset
      0, // min y level
      256))) // max y level
    .spreadHorizontally()
    .method_30377(100) // Circular spread
    .repeat(22); // number of veins per chunk

    public static ConfiguredFeature<?, ?> GemstoneFeature = Feature.ORE
    .configure(new OreFeatureConfig(
      OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
      ModRegistry.GemstoneBlock.getDefaultState(),
      8)) // vein size
    .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
      0, // bottom offset
      10, // min y level
      27))) // max y level
    .spreadHorizontally()
    .method_30377(32) // Circular spread
    .repeat(6); // number of veins per chunk


    // Item Registration Method
    public static void registry() {


        // Item Registry
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "etherium"), Etherium);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "etherium_ore"), EtheriumOreItem);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "etherium_helmet"), EtheriumHelmet);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "etherium_chestplate"), EtheriumChestplate);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "etherium_leggings"), EtheriumLeggings);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "etherium_boots"), EtheriumBoots);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "etherium_sword"), EtheriumSwordItem);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "etherium_pickaxe"), EtheriumPickaxeItem);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "etherium_axe"), EtheriumAxeItem);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "etherium_shovel"), EtheriumShovelItem);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "etherium_hoe"), EtheriumHoeItem);


        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "obsidian_sword"), ObsidianSwordItem);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "obsidian_pickaxe"), ObsidianPickaxeItem);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "obsidian_axe"), ObsidianAxeItem);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "obsidian_shovel"), ObsidianShovelItem);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "obsidian_hoe"), ObsidianHoeItem);

        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "giant_sword"), GiantSwordItem);

        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "gemstone"), GemstoneBlockItem);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "gemstone_shard"), GemstoneShard);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "gemfuel"), Gemfuel);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "gemstone_apple"), GemstoneApple);

        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "primordial_catalyst"), PrimordialCatalyst);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "tom_yum_stew"), TomYumStew);

        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "sword_of_the_night"), SwordOfTheNight);

        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "bronze_ingot"), BronzeIngot);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "bronze_ore"), BronzeOreItem);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "bronze_helmet"), BronzeHelmet);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "bronze_chestplate"), BronzeChestplate);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "bronze_leggings"), BronzeLeggings);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "bronze_boots"), BronzeBoots);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "bronze_sword"), BronzeSwordItem);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "bronze_pickaxe"), BronzePickaxeItem);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "bronze_axe"), BronzeAxeItem);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "bronze_shovel"), BronzeShovelItem);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "bronze_hoe"), BronzeHoeItem);

        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "metal_alloy"), MetalAlloy);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "alloy_helmet"), AlloyHelmet);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "alloy_chestplate"), AlloyChestplate);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "alloy_leggings"), AlloyLeggings);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "alloy_boots"), AlloyBoots);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "alloy_sword"), AlloySwordItem);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "alloy_pickaxe"), AlloyPickaxeItem);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "alloy_axe"), AlloyAxeItem);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "alloy_shovel"), AlloyShovelItem);
        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "alloy_hoe"), AlloyHoeItem);

        Registry.register(Registry.ITEM, new Identifier(EnhancedCraft.MOD_ID, "music_disc_soaked_hands"), SoakedHandsMusicDisc);


        // Fuel Registry
        FuelRegistry.INSTANCE.add(Gemfuel, 1200 * 5);


        // Block Registry
        Registry.register(Registry.BLOCK, new Identifier(EnhancedCraft.MOD_ID, "etherium_ore"), EtheriumOreBlock);
        Registry.register(Registry.BLOCK, new Identifier(EnhancedCraft.MOD_ID, "bronze_ore"), BronzeOreBlock);
        Registry.register(Registry.BLOCK, new Identifier(EnhancedCraft.MOD_ID, "gemstone"), GemstoneBlock);


        // SoundEvents Registry
        Registry.register(Registry.SOUND_EVENT, EnhancedCraft.MOD_ID, SoakedHandsSoundEvent);


        // Structure Generation Registry
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(EnhancedCraft.MOD_ID, "ore_etherium_overworld"), EtheriumOreFeature);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(EnhancedCraft.MOD_ID, "ore_bronze_overworld"), BronzeOreFeature);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(EnhancedCraft.MOD_ID, "ore_gemstone_overworld"), GemstoneFeature);
    }
}