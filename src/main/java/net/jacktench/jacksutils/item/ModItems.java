package net.jacktench.jacksutils.item;

import net.jacktench.jacksutils.JacksUtils;
import net.jacktench.jacksutils.item.custom.ItemTinyCoal;
import net.jacktench.jacksutils.item.custom.ItemTinyCoke;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    // Register for items from Jack's Utilities.
    public static final DeferredRegister<Item> itemRegister = DeferredRegister.create(ForgeRegistries.ITEMS, JacksUtils.modid);

    // Coin
    public static final RegistryObject<Item> coin = itemRegister.register("coin",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).fireResistant().tab(ModCreativeModeTabs.modTab)));

    // Tiny Coal, Charcoal and Coal Coke.
    public static final RegistryObject<Item> tinyCoal = itemRegister.register("tinycoal", () -> new ItemTinyCoal(new Item.Properties().tab(ModCreativeModeTabs.modTab)));
    public static final RegistryObject<Item> tinyCharcoal = itemRegister.register("tinycharcoal", () -> new ItemTinyCoal(new Item.Properties().tab(ModCreativeModeTabs.modTab)));
    public static final RegistryObject<Item> tinyCoke = itemRegister.register("tinycoke", () -> new ItemTinyCoke(new Item.Properties().tab(ModCreativeModeTabs.modTab)));

    // Called in the main class of the mod.
    public static void register(IEventBus eventBus) {
        itemRegister.register(eventBus);
    }

}
