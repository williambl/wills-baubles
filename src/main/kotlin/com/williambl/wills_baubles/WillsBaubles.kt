package com.williambl.wills_baubles

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import net.minecraftforge.fml.common.event.FMLServerStartingEvent

@Mod(modLanguageAdapter = "net.shadowfacts.forgelin.KotlinAdapter", modid = WillsBaubles.MODID,
        name = WillsBaubles.NAME, version = WillsBaubles.VERSION, dependencies = "required-after:forgelin;required-after:baubles")
object WillsBaubles {

    const val MODID = "wills-baubles"
    const val NAME = "Will's Baubles"
    const val VERSION = "1.0.0"

    @Mod.EventHandler
    fun preInit(event: FMLPreInitializationEvent) {
    }

    @Mod.EventHandler
    fun init(event: FMLInitializationEvent) {
    }

    @Mod.EventHandler
    fun postInit(event: FMLPostInitializationEvent) {
    }

    @Mod.EventHandler
    fun serverStart(event: FMLServerStartingEvent) {
    }
}