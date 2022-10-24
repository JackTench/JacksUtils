package net.jacktench.jacksutils.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class ItemTinyCoke extends Item {

    public ItemTinyCoke(Properties properties) {
        super(properties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        // Burns for 1/8th the time of Railcraft Coal Coke.
        return 400;
    }

}
