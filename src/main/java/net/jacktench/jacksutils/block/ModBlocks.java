package net.jacktench.jacksutils.block;

import net.jacktench.jacksutils.JacksUtils;
import net.jacktench.jacksutils.block.custom.BlockHotCoals;
import net.jacktench.jacksutils.block.custom.BlockSwiftStone;
import net.jacktench.jacksutils.item.ModCreativeModeTabs;
import net.jacktench.jacksutils.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    // Register for blocks from Jack's Utilities.
    public static final DeferredRegister<Block> blockRegister = DeferredRegister.create(ForgeRegistries.BLOCKS, JacksUtils.modid);

    // Swift Stone
    public static final RegistryObject<Block> swiftStone = registerBlock("swiftstone", () -> new BlockSwiftStone(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTabs.modTab);

    // Hot Coals
    public static final RegistryObject<Block> hotCoals = registerBlock("hotcoals", () -> new BlockHotCoals(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTabs.modTab);

    // Helper function for registering blocks.
    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {

        RegistryObject<T> toReturn = blockRegister.register(name, block);
        registerBlockItem(name, toReturn, tab);

        return toReturn;

    }

    // Helper function for registering blockitems.
    public static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.itemRegister.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    // Called in main mod class.
    public static void register(IEventBus eventBus) {
        blockRegister.register(eventBus);
    }

}
