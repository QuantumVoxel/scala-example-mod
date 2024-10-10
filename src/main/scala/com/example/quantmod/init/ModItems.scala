package com.example.quantmod.init

import com.example.quantmod.ExampleMod
import dev.ultreon.libs.registries.v0.DelayedRegister
import dev.ultreon.quantum.item.{BlockItem, Item}
import dev.ultreon.quantum.registry.{DeferRegistry, DeferredElement, Registries}

object ModItems {
  private val registry = DeferRegistry.of(ExampleMod.MOD_ID, Registries.ITEM)

  val EXAMPLE_BLOCK: DeferredElement[BlockItem] = registry.defer("example_block", () => new BlockItem(new Item.Properties(), ModBlocks.EXAMPLE_BLOCK))

  def register(): Unit = {
    registry.register()
  }
}
