package net.jacktench.jacksutils.item;

import net.jacktench.jacksutils.JacksUtils;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    // Register for items from Jack's Utilities.
    public static final DeferredRegister<Item> itemRegister = DeferredRegister.create(ForgeRegistries.ITEMS, JacksUtils.modid);

    // Boring Test Item. Will be deleted soon.
    public static final RegistryObject<Item> testItem = itemRegister.register("testitem",
            () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeModeTabs.modTab)));

    // Called in the main class of the mod.
    public static void register(IEventBus eventBus) {
        itemRegister.register(eventBus);
    }

}
