package net.jacktench.jacksutils.item;

import net.jacktench.jacksutils.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {

    // Creative tab for Jack's Utilities.
    public static final CreativeModeTab modTab = new CreativeModeTab("jacksutilstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.swiftStone.get());
        }
    };

    // Temporary creative tab for junk.
    public static final CreativeModeTab junkTab = new CreativeModeTab("jacksjunktab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.testItem.get());
        }
    };

}
