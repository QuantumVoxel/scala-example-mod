package com.example.craft.mod.init

import com.example.craft.mod.ExampleMod
import dev.ultreon.quantum.block.Block
import dev.ultreon.quantum.registry.{DeferRegistry, DeferredElement}

object ModBlocks {
  private val registry = DeferRegistry.of(ExampleMod.MOD_ID)

  val EXAMPLE_BLOCK: DeferredElement[Block] = registry.defer("example_block", () => new Block())

  def register(): Unit = {
    registry.register()
  }
}
