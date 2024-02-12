package com.chromanyan.ludicrousinefficiency;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
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
    // Create a Deferred Register to hold Blocks which will all be registered under the "ludicrousinefficiency" namespace

    public LudicrousInefficiency() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }


}
