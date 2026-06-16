package org.example

object ExampleHooks {
  def onCommonInit(): Unit = {
    ExampleMod.LOGGER.info("Hello from Mixin!")
  }
}
