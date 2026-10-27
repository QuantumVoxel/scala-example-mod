package org.example

import net.fabricmc.api.ModInitializer
import org.slf4j.{Logger, LoggerFactory}

object ExampleMod {
  val LOGGER: Logger = LoggerFactory.getLogger("ExampleMod")
}

class ExampleMod extends ModInitializer {
  override def onInitialize(): Unit = {
    ExampleMod.LOGGER.info("Hello from Fabric!")
  }
}
