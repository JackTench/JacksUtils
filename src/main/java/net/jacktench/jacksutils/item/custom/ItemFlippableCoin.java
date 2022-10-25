package net.jacktench.jacksutils.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Random;

public class ItemFlippableCoin extends Item {

    public ItemFlippableCoin(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            printCoinFlipToConsole(player);
        }
        return super.use(level, player, hand);
    }

    private void printCoinFlipToConsole(Player player) {
        // Prints result of coin flip to console.
        player.sendSystemMessage(Component.literal("The coin landed on " + getCoinState() + "."));
    }

    private String getCoinState() {

        // Init coin state as printable string.
        String coinState;

        // Get random boolean to determine coin state.
        Random rand = new Random();
        boolean boolCoinState = rand.nextBoolean();

        // Logic
        if(boolCoinState == true) {
            coinState = "Heads";
        } else {
            coinState = "Tails";
        }

        // Return the output of the coin flip as a string.
        return coinState;
    }

}
