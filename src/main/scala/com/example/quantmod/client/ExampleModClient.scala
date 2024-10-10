package com.example.quantmod.client

import com.example.quantmod.init.ModBlocks
import dev.ultreon.quantum.client.api.events.ClientRegistrationEvents
import dev.ultreon.quantum.client.model.block.BlockModelRegistry
import net.fabricmc.api.ClientModInitializer

object ExampleModClient extends ClientModInitializer {
  override def onInitializeClient(): Unit = {
    ClientRegistrationEvents.BLOCK_MODELS.subscribe(() => {
      val blockModelRegistry = BlockModelRegistry.get()
      blockModelRegistry.registerDefault(ModBlocks.EXAMPLE_BLOCK)
    })
  }
}
