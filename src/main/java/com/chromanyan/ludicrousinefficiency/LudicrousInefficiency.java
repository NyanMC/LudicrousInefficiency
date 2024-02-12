package com.chromanyan.ludicrousinefficiency;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@SuppressWarnings("unused")
@Mod(LudicrousInefficiency.MODID)
public class LudicrousInefficiency {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "ludicrousinefficiency";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public LudicrousInefficiency() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void lag(TickEvent.PlayerTickEvent event) {
        for (int i = 0; i < 500; i++) {
            LOGGER.info("Inefficiency step: " + i);
        }
    }
}
