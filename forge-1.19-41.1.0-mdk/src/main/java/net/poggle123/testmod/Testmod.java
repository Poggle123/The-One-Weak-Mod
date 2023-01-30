package net.poggle123.testmod;

import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.poggle123.testmod.item.ModItems;
import net.poggle123.testmod.block.ModBlocks;
import net.poggle123.testmod.villager.ModPOIs;
import net.poggle123.testmod.world.dimension.ModDimensions;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Testmod.MOD_ID)
public class Testmod {
    public static final String MOD_ID = "testmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Testmod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModDimensions.register();
        ModPOIs.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
