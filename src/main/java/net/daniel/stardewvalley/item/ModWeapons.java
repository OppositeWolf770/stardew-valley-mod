package net.daniel.stardewvalley.item;

import net.daniel.stardewvalley.StardewValley;
import net.daniel.stardewvalley.item.custom.weapons.DragontoothCutlassItem;
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> INFINITY_DAGGER = ITEMS.register("infinity_dagger",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> DRAGONTOOTH_CLUB = ITEMS.register("dragontooth_club",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> DRAGONTOOTH_SHIV = ITEMS.register("dragontooth_shiv",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> OSSIFIED_BLADE = ITEMS.register("ossified_blade",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> IRIDIUM_NEEDLE = ITEMS.register("iridium_needle",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> INFINITY_BLADE = ITEMS.register("infinity_blade",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> INFINITY_GAVEL = ITEMS.register("infinity_gavel",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> DWARF_HAMMER = ITEMS.register("dwarf_hammer",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> DWARF_SWORD = ITEMS.register("dwarf_sword",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> GOLDEN_SCYTHE = ITEMS.register("golden_scythe",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> TEMPERED_BROADSWORD = ITEMS.register("tempered_broadsword",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> BROKEN_TRIDENT = ITEMS.register("broken_trident",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> STEEL_FALCHION = ITEMS.register("steel_falchion",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> RAPIER = ITEMS.register("rapier",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> YETI_TOOTH = ITEMS.register("yeti_tooth",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> ABBYS_PLANCHETTE = ITEMS.register("abbys_planchette",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> SLINGSHOT = ITEMS.register("slingshot",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> MASTER_SLINGSHOT = ITEMS.register("master_slingshot",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> GALAXY_SLINGSHOT = ITEMS.register("galaxy_slingshot",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> ELLIOTS_PENCIL = ITEMS.register("elliots_pencil",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> MARUS_WRENCH = ITEMS.register("marus_wrench",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> HARVEYS_MALLET = ITEMS.register("harveys_mallet",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> PENNYS_FRYER = ITEMS.register("pennys_fryer",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> LEAHS_WHITTLER = ITEMS.register("leahs_whittler",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> FEMUR = ITEMS.register("femur",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> GALAXY_DAGGER = ITEMS.register("galaxy_dagger",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> WIND_SPIRE = ITEMS.register("wind_spire",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> CRYSTAL_DAGGER = ITEMS.register("crystal_dagger",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> ELF_BLADE = ITEMS.register("elf_blade",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> SHADOW_DAGGER = ITEMS.register("shadow_dagger",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> BURGLARS_SHANK = ITEMS.register("burglars_shank",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> IRON_DIRK = ITEMS.register("iron_dirk",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> CARVING_KNIFE = ITEMS.register("carving_knife",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> FOREST_SWORD = ITEMS.register("forest_sword",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> NEPTUNES_GLAIVE = ITEMS.register("neptunes_glaive",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> INSECT_HEAD = ITEMS.register("insect_head",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));


    public static final RegistryObject<Item> WOODEN_BLADE = ITEMS.register("wooden_blade",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> STEEL_SMALLSWORD = ITEMS.register("steel_smallsword",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> CLAYMORE = ITEMS.register("claymore",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> LAVA_KATANA = ITEMS.register("lava_katana",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> OBSIDIAN_EDGE = ITEMS.register("obsidian_edge",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> TEMPLARS_BLADE = ITEMS.register("templars_blade",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> IRON_EDGE = ITEMS.register("iron_edge",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> BONE_SWORD = ITEMS.register("bone_sword",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> GALAXY_SWORD = ITEMS.register("galaxy_sword",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> HOLY_BLADE = ITEMS.register("holy_blade",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> DARK_SWORD = ITEMS.register("dark_sword",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> SILVER_SABER = ITEMS.register("silver_saber",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static final RegistryObject<Item> RUSTY_SWORD = ITEMS.register("rusty_sword",
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
                    .tab(ModCreativeModeTab.WEAPONS_TAB)
            ));

    public static void  register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
