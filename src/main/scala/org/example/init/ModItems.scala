package org.example.init

import net.quantumvoxel.item.category.ItemCategories
import net.quantumvoxel.item.{BlockItem, Item}
import net.quantumvoxel.registry.Registries
import net.quantumvoxel.util.Key
import org.example.ExampleMod

object ModItems {
  val EXAMPLE_BLOCK_ITEM: Item = register("example_block", new BlockItem(new Item.Settings(), () => ModBlocks.EXAMPLE_BLOCK))

  private def register(name: String, item: Item): Item = {
    Registries.ITEM.register(new Key(ExampleMod.MOD_ID, name), item)
    item
  }

  def init(): Unit = {
    ItemCategories.BUILDING.addContent(EXAMPLE_BLOCK_ITEM)
  }
}
