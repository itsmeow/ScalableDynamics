package dev.itsmeow.scalabledynamics;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod.EventBusSubscriber(modid = ScalableDynamics.MODID)
@Mod(modid = ScalableDynamics.MODID, name = ScalableDynamics.NAME, version = ScalableDynamics.VERSION)
public class ScalableDynamics {
    
    public static final String MODID = "scalabledynamics";
	public static final String VERSION = "@VERSION@";
	public static final String NAME = "Scalable Dynamics";

	@EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

	}

}