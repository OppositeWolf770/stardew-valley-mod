package net.daniel.stardewvalley.item;

import net.daniel.stardewvalley.StardewValley;
import net.daniel.stardewvalley.item.custom.weapons.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModWeapons {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StardewValley.MODID);



    /*

        Weapons

     */

    public static final RegistryObject<Item> DRAGONTOOTH_CUTLASS = ITEMS.register("dragontooth_cutlass",
            () -> new DragontoothCutlassItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> INFINITY_DAGGER = ITEMS.register("infinity_dagger",
            () -> new InfinityDaggerItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> DRAGONTOOTH_CLUB = ITEMS.register("dragontooth_club",
            () -> new DragontoothClubItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> DRAGONTOOTH_SHIV = ITEMS.register("dragontooth_shiv",
            () -> new DragontoothShivItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> OSSIFIED_BLADE = ITEMS.register("ossified_blade",
            () -> new OssifiedBladeItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> IRIDIUM_NEEDLE = ITEMS.register("iridium_needle",
            () -> new IridiumNeedleItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> INFINITY_BLADE = ITEMS.register("infinity_blade",
            () -> new InfinityBladeItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> INFINITY_GAVEL = ITEMS.register("infinity_gavel",
            () -> new InfinityGavelItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> DWARF_HAMMER = ITEMS.register("dwarf_hammer",
            () -> new DwarfHammerItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> DWARF_SWORD = ITEMS.register("dwarf_sword",
            () -> new DwarfSwordItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> GOLDEN_SCYTHE = ITEMS.register("golden_scythe",
            () -> new GoldenScytheItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> TEMPERED_BROADSWORD = ITEMS.register("tempered_broadsword",
            () -> new TemperedBroadswordItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> BROKEN_TRIDENT = ITEMS.register("broken_trident",
            () -> new BrokenTridentItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> STEEL_FALCHION = ITEMS.register("steel_falchion",
            () -> new SteelFalchionItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> RAPIER = ITEMS.register("rapier",
            () -> new RapierItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> YETI_TOOTH = ITEMS.register("yeti_tooth",
            () -> new YetiToothItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> ABBYS_PLANCHETTE = ITEMS.register("abbys_planchette",
            () -> new AbbysPlanchetteItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> SLINGSHOT = ITEMS.register("slingshot",
            () -> new SlingshotItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> MASTER_SLINGSHOT = ITEMS.register("master_slingshot",
            () -> new MasterSlingshotItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> GALAXY_SLINGSHOT = ITEMS.register("galaxy_slingshot",
            () -> new GalaxySlingshotItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> ELLIOTS_PENCIL = ITEMS.register("elliots_pencil",
            () -> new ElliotsPencilItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> MARUS_WRENCH = ITEMS.register("marus_wrench",
            () -> new MarusWrenchItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> HARVEYS_MALLET = ITEMS.register("harveys_mallet",
            () -> new HarveysMalletItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> PENNYS_FRYER = ITEMS.register("pennys_fryer",
            () -> new PennysFryerItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> LEAHS_WHITTLER = ITEMS.register("leahs_whittler",
            () -> new LeahsWhittlerItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> FEMUR = ITEMS.register("femur",
            () -> new FemurItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> GALAXY_DAGGER = ITEMS.register("galaxy_dagger",
            () -> new GalaxyDaggerItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> WIND_SPIRE = ITEMS.register("wind_spire",
            () -> new WindSpireItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> CRYSTAL_DAGGER = ITEMS.register("crystal_dagger",
            () -> new CrystalDaggerItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> ELF_BLADE = ITEMS.register("elf_blade",
            () -> new ElfBladeItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> SHADOW_DAGGER = ITEMS.register("shadow_dagger",
            () -> new ShadowDaggerItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> BURGLARS_SHANK = ITEMS.register("burglars_shank",
            () -> new BurglarsShankItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> IRON_DIRK = ITEMS.register("iron_dirk",
            () -> new IronDirkItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> CARVING_KNIFE = ITEMS.register("carving_knife",
            () -> new CarvingKnifeItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> FOREST_SWORD = ITEMS.register("forest_sword",
            () -> new ForestSwordItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> NEPTUNES_GLAIVE = ITEMS.register("neptunes_glaive",
            () -> new NeptunesGlaiveItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> INSECT_HEAD = ITEMS.register("insect_head",
            () -> new InsectHeadItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));


    public static final RegistryObject<Item> WOODEN_BLADE = ITEMS.register("wooden_blade",
            () -> new WoodenBladeItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> STEEL_SMALLSWORD = ITEMS.register("steel_smallsword",
            () -> new SteelSmallswordItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> CLAYMORE = ITEMS.register("claymore",
            () -> new ClaymoreItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> LAVA_KATANA = ITEMS.register("lava_katana",
            () -> new LavaKatanaItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> OBSIDIAN_EDGE = ITEMS.register("obsidian_edge",
            () -> new ObsidianEdgeItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> TEMPLARS_BLADE = ITEMS.register("templars_blade",
            () -> new TemplarsBladeItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> IRON_EDGE = ITEMS.register("iron_edge",
            () -> new IronEdgeItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> BONE_SWORD = ITEMS.register("bone_sword",
            () -> new BoneSwordItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> GALAXY_SWORD = ITEMS.register("galaxy_sword",
            () -> new GalaxySwordItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> HOLY_BLADE = ITEMS.register("holy_blade",
            () -> new HolyBladeItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> DARK_SWORD = ITEMS.register("dark_sword",
            () -> new DarkSwordItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> SILVER_SABER = ITEMS.register("silver_saber",
            () -> new SilverSaberItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> RUSTY_SWORD = ITEMS.register("rusty_sword",
            () -> new RustySwordItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModMinerals.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTabs.WEAPONS_TAB)
            ));

    public static void  register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
