package com.williambl.wills_baubles.item

import baubles.api.BaubleType
import baubles.api.IBauble
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item
import net.minecraft.item.ItemStack

class ItemBauble(registryName: String, creativeTab: CreativeTabs) : Item(), IBauble {

    init {
        this.creativeTab = creativeTab
        this.setRegistryName(registryName)
        this.unlocalizedName = this.registryName.toString()
    }

    override fun getBaubleType(stack: ItemStack?): BaubleType {
        return BaubleType.RING
    }

}