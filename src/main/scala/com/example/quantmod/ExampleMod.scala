package com.example.quantmod

import com.example.quantmod.init.{ModBlocks, ModItems}
import net.fabricmc.api.ModInitializer

object ExampleMod extends ModInitializer {
  val MOD_ID = "example_mod"

  override def onInitialize(): Unit = {
    ModBlocks.register()
    ModItems.register()
  }
}
