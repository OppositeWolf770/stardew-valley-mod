package net.daniel.stardewvalley.block;

import net.daniel.stardewvalley.StardewValley;
import net.daniel.stardewvalley.block.custom.*;
import net.daniel.stardewvalley.block.custom.crops.ModCropBlock;
import net.daniel.stardewvalley.block.custom.crops.RegrowableCropBlock;
import net.daniel.stardewvalley.item.ModCrops;
import net.daniel.stardewvalley.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, StardewValley.MODID);

    // Add Blocks below this comment
    public static final RegistryObject<Block> SCARECROW = registerBlock("scarecrow",
            () -> new ScarecrowBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f)
                    .requiresCorrectToolForDrops()
            )
    );

    public static final RegistryObject<Block> CRYSTALARIUM = registerBlock("crystalarium",
            () -> new CrystalariumBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f)
                    .requiresCorrectToolForDrops()
            )
    );

    public static final RegistryObject<Block> KEG = registerBlock("keg",
            () -> new KegBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f)
                    .requiresCorrectToolForDrops()

            )
    );

    public static final RegistryObject<Block> BEE_HOUSE = registerBlock("bee_house",
            () -> new BeeHouseBlock(BlockBehaviour.Properties.of()
                    .pushReaction(PushReaction.PUSH_ONLY)
                    .strength(6f)
                    .requiresCorrectToolForDrops()
            )
    );

    public static final RegistryObject<Block> RECYCLING_MACHINE = registerBlock("recycling_machine",
            () -> new RecyclingMachineBlock(BlockBehaviour.Properties.of()
                    .pushReaction(PushReaction.PUSH_ONLY)
                    .strength(6f)
                    .requiresCorrectToolForDrops()
            )
    );


    // Crops
    public static final RegistryObject<Block> CAULIFLOWER_CROP = BLOCKS.register("cauliflower_crop",
            () -> new ModCropBlock(
                    BlockBehaviour.Properties.copy(Blocks.WHEAT),
                    ModCrops.CAULIFLOWER_SEEDS
            )
    );

    public static final RegistryObject<Block> PARSNIP_CROP = BLOCKS.register("parsnip_crop",
            () -> new ModCropBlock(
                    BlockBehaviour.Properties.copy(Blocks.WHEAT),
                    ModCrops.PARSNIP_SEEDS
            )
    );

    public static final RegistryObject<Block> GARLIC_CROP = BLOCKS.register("garlic_crop",
            () -> new ModCropBlock(
                    BlockBehaviour.Properties.copy(Blocks.WHEAT),
                    ModCrops.GARLIC_SEEDS
            )
    );

    public static final RegistryObject<Block> BLUE_JAZZ_CROP = BLOCKS.register("blue_jazz_crop",
            () -> new ModCropBlock(
                    BlockBehaviour.Properties.copy(Blocks.WHEAT),
                    ModCrops.JAZZ_SEEDS
            )
    );


    public static final RegistryObject<Block> COFFEE_BEAN_CROP = BLOCKS.register("coffee_bean_crop",
            () -> new RegrowableCropBlock(
                    BlockBehaviour.Properties.copy(Blocks.WHEAT),
                    ModCrops.COFFEE_BEAN,
                    ModCrops.COFFEE_BEAN
            )
    );

    public static final RegistryObject<Block> ANCIENT_FRUIT_CROP = BLOCKS.register("ancient_fruit_crop",
            () -> new RegrowableCropBlock(
                    BlockBehaviour.Properties.copy(Blocks.WHEAT),
                    ModCrops.ANCIENT_FRUIT_SEEDS,
                    ModCrops.ANCIENT_FRUIT
            )
    );


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void  register(IEventBus eventBus) { BLOCKS.register(eventBus); }
}
