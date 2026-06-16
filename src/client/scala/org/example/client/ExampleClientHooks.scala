package org.example.client

object ExampleClientHooks {
  def onTitleScreenInit(): Unit = {
    System.out.println("Hello from client Mixin!")
  }
}
