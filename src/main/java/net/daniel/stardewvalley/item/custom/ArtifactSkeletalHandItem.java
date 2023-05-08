package net.daniel.stardewvalley.item.custom;

import net.daniel.stardewvalley.StardewValley;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ArtifactSkeletalHandItem extends Item {
    public ArtifactSkeletalHandItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.literal
                    ("It's a wonder all these ancient little pieces lasted so long.")
                    .withStyle(StardewValley.tooltipColor)
            );
        } else {
            pTooltipComponents.add(Component.literal(StardewValley.shiftMessage).withStyle(StardewValley.shiftTooltipColor));
        }
    }
}
