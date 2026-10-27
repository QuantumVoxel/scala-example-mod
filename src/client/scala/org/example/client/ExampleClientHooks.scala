package org.example.client

import org.example.ExampleMod

object ExampleClientHooks {
  def onTitleScreenInit(): Unit = {
    ExampleMod.LOGGER.info("Hello from client Mixin!")
  }
}
