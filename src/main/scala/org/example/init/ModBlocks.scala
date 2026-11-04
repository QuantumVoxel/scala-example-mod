package org.example.init

import net.quantumvoxel.block.Block
import net.quantumvoxel.registry.{Registries, Registry}
import net.quantumvoxel.util.Key
import org.example.ExampleMod

object ModBlocks {
  val EXAMPLE_BLOCK: Block = register("example_block", new Block(new Block.Settings().strength(1.5f)))

  private def register(name: String, block: Block): Block = {
    Registries.BLOCK.register(ExampleMod.key(name), block)
    block
  }

  def init(): Unit = {

  }
}
