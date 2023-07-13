package net.daniel.stardewvalley.block.entity;

import net.daniel.stardewvalley.StardewValley;
import net.daniel.stardewvalley.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, StardewValley.MOD_ID);

    public static final RegistryObject<BlockEntityType<KegBlockEntity>> KEG_BLOCK_ENTITY = BLOCK_ENTITIES.register("keg_block_entity",
            () -> BlockEntityType.Builder.of(KegBlockEntity::new, ModBlocks.KEG.get()).build(null));
    public static final RegistryObject<BlockEntityType<CrystalariumBlockEntity>> CRYSTALARIUM_BLOCK_ENTITY = BLOCK_ENTITIES.register("crystalarium_block_entity",
            () -> BlockEntityType.Builder.of(CrystalariumBlockEntity::new, ModBlocks.CRYSTALARIUM.get()).build(null));
    public static final RegistryObject<BlockEntityType<PreservesJarBlockEntity>> PRESERVES_JAR_BLOCK_ENTITY = BLOCK_ENTITIES.register("preserves_jar_block_entity",
            () -> BlockEntityType.Builder.of(PreservesJarBlockEntity::new, ModBlocks.PRESERVES_JAR.get()).build(null));


    public static void  register(IEventBus eventBus) { BLOCK_ENTITIES.register(eventBus); }
}
