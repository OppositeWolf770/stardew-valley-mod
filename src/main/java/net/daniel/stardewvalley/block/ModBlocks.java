package net.daniel.stardewvalley.block;

import net.daniel.stardewvalley.StardewValley;
import net.daniel.stardewvalley.block.custom.CrystalariumBlock;
import net.daniel.stardewvalley.block.custom.StardewCropBlock;
import net.daniel.stardewvalley.block.custom.ScarecrowBlock;
import net.daniel.stardewvalley.block.custom.crops.CauliflowerCropBlock;
import net.daniel.stardewvalley.item.ModCreativeModeTab;
import net.daniel.stardewvalley.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
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
            () -> new ScarecrowBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARDEW_TAB);

    public static final RegistryObject<Block> CRYSTALARIUM = registerBlock("crystalarium",
            () -> new CrystalariumBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.STARDEW_TAB);

    public static final RegistryObject<Block> CAULIFLOWER_CROP = BLOCKS.register("cauliflower_crop",
            () -> new CauliflowerCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));



    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }



    public static void  register(IEventBus eventBus) { BLOCKS.register(eventBus); }
}
