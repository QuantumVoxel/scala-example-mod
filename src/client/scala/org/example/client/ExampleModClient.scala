package org.example.client

import net.fabricmc.api.ClientModInitializer
import org.example.ExampleMod

class ExampleModClient extends ClientModInitializer {
  override def onInitializeClient(): Unit = {
    ExampleMod.LOGGER.info("Hello from Client!")
  }
}