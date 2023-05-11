package net.daniel.stardewvalley.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab STARDEW_TAB = new CreativeModeTab("stardewtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ARTIFACT_CHICKEN_STATUE.get());
        }
    };

    public static final CreativeModeTab ARTIFACTS_TAB = new CreativeModeTab("artifactstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ARTIFACT_LOST_BOOK.get());
        }
    };

    public static final CreativeModeTab MINERALS_TAB = new CreativeModeTab("mineralstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.QUARTZ.get());
        }
    };
}
