package org.example

import net.fabricmc.api.ModInitializer
import net.quantumvoxel.util.Key
import org.slf4j.{Logger, LoggerFactory}
import org.example.init.{ModBlocks, ModItems}

object ExampleMod {
  val MOD_ID: String = "examplemod"
  val LOGGER: Logger = LoggerFactory.getLogger("ExampleMod")

  def key(name: String): Key = {
    new Key(MOD_ID, name)
  }
}

class ExampleMod extends ModInitializer {
  override def onInitialize(): Unit = {
    ExampleMod.LOGGER.info("Hello from Fabric!")

    ModBlocks.init()
    ModItems.init()
  }
}
