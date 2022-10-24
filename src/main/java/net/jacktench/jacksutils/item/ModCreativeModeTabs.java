package net.jacktench.jacksutils.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {

    public static final CreativeModeTab modTab = new CreativeModeTab("jacksutilstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.testItem.get());
        }
    };

}
