package net.jacktench.jacksutils;

import com.mojang.logging.LogUtils;
import net.jacktench.jacksutils.block.ModBlocks;
import net.jacktench.jacksutils.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(JacksUtils.modid)
public class JacksUtils {

    // Declaring a couple of things here, for use all over the mod.
    public static final String modid = "jacksutils";
    private static final Logger logger = LogUtils.getLogger();

    public JacksUtils() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Registers items from Jack's Utils.
        ModItems.register(modEventBus);
        logger.info("JUtil Items Loaded");

        // Registers blocks from Jack's Utils.
        ModBlocks.register(modEventBus);
        logger.info("JUtil Blocks Loaded");

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Prints to Minecraft's console when mod is loaded.
        logger.info("Jack's Utilities Loaded!");
    }

    @Mod.EventBusSubscriber(modid = modid, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
