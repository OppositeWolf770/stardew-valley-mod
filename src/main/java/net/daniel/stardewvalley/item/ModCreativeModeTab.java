package net.daniel.stardewvalley.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.NonNullList;
import java.util.Comparator;




public class ModCreativeModeTab {
    public static final CreativeModeTab STARDEW_TAB = new CreativeModeTab("stardewtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModArtifacts.ARTIFACT_CHICKEN_STATUE.get());
        }
        @Override
        public void fillItemList(NonNullList<ItemStack> items) {
            super.fillItemList(items);
            items.sort(Comparator.comparing(e -> e.getDisplayName().getString()));
        }
    };

    public static final CreativeModeTab ARTIFACTS_TAB = new CreativeModeTab("artifactstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModArtifacts.ARTIFACT_LOST_BOOK.get());
        }
        @Override
        public void fillItemList(NonNullList<ItemStack> items) {
            super.fillItemList(items);
            items.sort(Comparator.comparing(e -> e.getDisplayName().getString()));
        }
    };

    public static final CreativeModeTab MINERALS_TAB = new CreativeModeTab("mineralstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModMinerals.QUARTZ.get());
        }
        @Override
        public void fillItemList(NonNullList<ItemStack> items) {
            super.fillItemList(items);
            items.sort(Comparator.comparing(e -> e.getDisplayName().getString()));
        }
    };

    public static final CreativeModeTab WEAPONS_TAB = new CreativeModeTab("weaponstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModWeapons.GALAXY_SWORD.get());
        }
        @Override
        public void fillItemList(NonNullList<ItemStack> items) {
            super.fillItemList(items);
            items.sort(Comparator.comparing(e -> e.getDisplayName().getString()));
        }
    };
}
