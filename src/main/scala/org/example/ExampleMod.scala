package org.example

import net.fabricmc.api.ModInitializer
import org.slf4j.{Logger, LoggerFactory}
import org.example.init.{ModBlocks, ModItems}

object ExampleMod {
  val MOD_ID: String = "examplemod"
  val LOGGER: Logger = LoggerFactory.getLogger("ExampleMod")
}

class ExampleMod extends ModInitializer {
  override def onInitialize(): Unit = {
    ExampleMod.LOGGER.info("Hello from Fabric!")

    ModBlocks.init()
    ModItems.init()
  }
}
