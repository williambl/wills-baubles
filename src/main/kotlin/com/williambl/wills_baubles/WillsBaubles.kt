package com.williambl.wills_baubles

import com.williambl.wills_baubles.item.ItemBauble
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item
import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import net.minecraftforge.fml.common.event.FMLServerStartingEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent

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

    @SubscribeEvent
    @JvmStatic
    fun registerItems(event: RegistryEvent.Register<Item>) {
        event.registry.register(ItemBauble("bauble", CreativeTabs.MISC))
    }
}