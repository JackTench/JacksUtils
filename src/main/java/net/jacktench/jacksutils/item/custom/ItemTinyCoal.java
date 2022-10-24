package net.jacktench.jacksutils.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class ItemTinyCoal extends Item {

    public ItemTinyCoal(Properties properties) {
        super(properties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        // Burns for 1/8th the time of regular coal.
        return 200;
    }

}
