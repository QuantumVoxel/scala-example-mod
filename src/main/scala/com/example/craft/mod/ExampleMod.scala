package com.example.craft.mod

import com.example.craft.mod.init.ModBlocks
import dev.ultreon.quantum.ModInit

class ExampleMod extends ModInit{
  override def onInitialize(): Unit = {
    ModBlocks.register()
  }
}

object ExampleMod {
  val MOD_ID = "example_mod"
}
