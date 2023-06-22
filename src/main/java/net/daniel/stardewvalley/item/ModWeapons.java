package net.daniel.stardewvalley.item;

import net.daniel.stardewvalley.StardewValley;
import net.daniel.stardewvalley.item.custom.WeaponItem;
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
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "The blade was forged from a magical tooth."
            ));

    public static final RegistryObject<Item> INFINITY_DAGGER = ITEMS.register("infinity_dagger",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "The true form of the Galaxy Dagger."
            ));

    public static final RegistryObject<Item> DRAGONTOOTH_CLUB = ITEMS.register("dragontooth_club",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "This club was crafted from a magical tooth."
            ));

    public static final RegistryObject<Item> DRAGONTOOTH_SHIV = ITEMS.register("dragontooth_shiv",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "The blade was forged from a magical tooth."
            ));

    public static final RegistryObject<Item> OSSIFIED_BLADE = ITEMS.register("ossified_blade",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "A large, sharp blade formed from bone."
            ));

    public static final RegistryObject<Item> IRIDIUM_NEEDLE = ITEMS.register("iridium_needle",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "The point is unbelievably sharp, even down to the atomic level."
            ));

    public static final RegistryObject<Item> INFINITY_BLADE = ITEMS.register("infinity_blade",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "The true form of the Galaxy Sword."
            ));

    public static final RegistryObject<Item> INFINITY_GAVEL = ITEMS.register("infinity_gavel",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "The true form of the Galaxy Hammer."
            ));

    public static final RegistryObject<Item> DWARF_HAMMER = ITEMS.register("dwarf_hammer",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "It emits a very faint whirring sound."
            ));

    public static final RegistryObject<Item> DWARF_SWORD = ITEMS.register("dwarf_sword",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "It's ancient, but the blade never dulls."
            ));


    // TODO Redefine Golden Scythe as a tool??
    public static final RegistryObject<Item> GOLDEN_SCYTHE = ITEMS.register("golden_scythe",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "It's more powerful than a normal scythe."
            ));

    public static final RegistryObject<Item> TEMPERED_BROADSWORD = ITEMS.register("tempered_broadsword",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "It looks like it could withstand anything."
            ));

    public static final RegistryObject<Item> BROKEN_TRIDENT = ITEMS.register("broken_trident",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "It came from the sea, but it's still sharp."
            ));

    public static final RegistryObject<Item> STEEL_FALCHION = ITEMS.register("steel_falchion",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "Light and powerful."
            ));

    public static final RegistryObject<Item> RAPIER = ITEMS.register("rapier",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "An elegant blade."
            ));

    public static final RegistryObject<Item> YETI_TOOTH = ITEMS.register("yeti_tooth",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "It's icy cold to the touch."
            ));

    public static final RegistryObject<Item> ABBYS_PLANCHETTE = ITEMS.register("abbys_planchette",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "It's made from fine marblewood."
            ));

    //TODO Maybe make slingshots their own item type?
    public static final RegistryObject<Item> SLINGSHOT = ITEMS.register("slingshot",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "Requires stones for ammo."
            ));

    public static final RegistryObject<Item> MASTER_SLINGSHOT = ITEMS.register("master_slingshot",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "Requires stones for ammo."
            ));

    public static final RegistryObject<Item> GALAXY_SLINGSHOT = ITEMS.register("galaxy_slingshot",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "It looks really powerful."
            ));

    public static final RegistryObject<Item> ELLIOTS_PENCIL = ITEMS.register("elliots_pencil",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "Elliott used this to write his book. It's sharp!"
            ));

    public static final RegistryObject<Item> MARUS_WRENCH = ITEMS.register("marus_wrench",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "A big, metal wrench. It smells like Maru."
            ));

    public static final RegistryObject<Item> HARVEYS_MALLET = ITEMS.register("harveys_mallet",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "It brings back memories of Harvey's clinic."
            ));

    public static final RegistryObject<Item> PENNYS_FRYER = ITEMS.register("pennys_fryer",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "Penny's favorite frying pan. There's some rubbery gunk stuck to the inside."
            ));

    public static final RegistryObject<Item> LEAHS_WHITTLER = ITEMS.register("leahs_whittler",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "Leah's favorite tool for shaping driftwood."
            ));

    public static final RegistryObject<Item> FEMUR = ITEMS.register("femur",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "An old, heavy bone caked in centuries of grime."
            ));

    public static final RegistryObject<Item> GALAXY_DAGGER = ITEMS.register("galaxy_dagger",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "It's unlike anything you've seen."
            ));

    public static final RegistryObject<Item> WIND_SPIRE = ITEMS.register("wind_spire",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "A swift little blade."
            ));

    public static final RegistryObject<Item> CRYSTAL_DAGGER = ITEMS.register("crystal_dagger",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "The blade is made of purified quartz."
            ));

    public static final RegistryObject<Item> ELF_BLADE = ITEMS.register("elf_blade",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "Only the nimble hands of an elf could craft this."
            ));

    public static final RegistryObject<Item> SHADOW_DAGGER = ITEMS.register("shadow_dagger",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "When you hold the blade to your ear you can hear 1,000 souls shrieking."
            ));

    public static final RegistryObject<Item> BURGLARS_SHANK = ITEMS.register("burglars_shank",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "A weapon of choice for the swift and silent."
            ));

    public static final RegistryObject<Item> IRON_DIRK = ITEMS.register("iron_dirk",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "A common dagger."
            ));

    public static final RegistryObject<Item> CARVING_KNIFE = ITEMS.register("carving_knife",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "A small, light blade."
            ));

    public static final RegistryObject<Item> FOREST_SWORD = ITEMS.register("forest_sword",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "Made powerful by forest magic."
            ));

    public static final RegistryObject<Item> NEPTUNES_GLAIVE = ITEMS.register("neptunes_glaive",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "An heirloom from beyond the Gem Sea."
            ));

    public static final RegistryObject<Item> INSECT_HEAD = ITEMS.register("insect_head",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "Not very pleasant to wield."
            ));


    public static final RegistryObject<Item> WOODEN_BLADE = ITEMS.register("wooden_blade",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "Not bad for a piece of carved wood."
            ));

    public static final RegistryObject<Item> STEEL_SMALLSWORD = ITEMS.register("steel_smallsword",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "A standard metal blade."
            ));

    public static final RegistryObject<Item> CLAYMORE = ITEMS.register("claymore",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "It's really heavy."
            ));

    public static final RegistryObject<Item> LAVA_KATANA = ITEMS.register("lava_katana",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "A powerful blade forged in a pool of churning lava."
            ));

    public static final RegistryObject<Item> OBSIDIAN_EDGE = ITEMS.register("obsidian_edge",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "It's incredibly sharp."
            ));

    public static final RegistryObject<Item> TEMPLARS_BLADE = ITEMS.register("templars_blade",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "It once belonged to an honorable knight."
            ));

    public static final RegistryObject<Item> IRON_EDGE = ITEMS.register("iron_edge",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "A heavy broadsword."
            ));

    public static final RegistryObject<Item> BONE_SWORD = ITEMS.register("bone_sword",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "A very light piece of sharpened bone."
            ));

    public static final RegistryObject<Item> GALAXY_SWORD = ITEMS.register("galaxy_sword",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "It's unlike anything you've ever seen."
            ));

    public static final RegistryObject<Item> HOLY_BLADE = ITEMS.register("holy_blade",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "It feels hopeful to wield."
            ));

    public static final RegistryObject<Item> DARK_SWORD = ITEMS.register("dark_sword",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "It's glowing with vampire energy."
            ));

    public static final RegistryObject<Item> SILVER_SABER = ITEMS.register("silver_saber",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "Plated with silver to deter rust."
            ));

    public static final RegistryObject<Item> RUSTY_SWORD = ITEMS.register("rusty_sword",
            () -> new WeaponItem(new Tier() {
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
                    ,
                    "A rusty, dull old sword."
            ));

    public static void  register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
