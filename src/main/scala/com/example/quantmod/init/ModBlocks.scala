package com.example.quantmod.init

import com.example.quantmod.ExampleMod
import dev.ultreon.quantum.block.Block
import dev.ultreon.quantum.registry.{DeferRegistry, DeferredElement, Registries}

object ModBlocks {
  private val registry = DeferRegistry.of(ExampleMod.MOD_ID, Registries.BLOCK)

  val EXAMPLE_BLOCK: DeferredElement[Block] = registry.defer("example_block", () => new Block())

  def register(): Unit = {
    registry.register()
  }
}
