package org.example.client.mixins

import net.quantumvoxel.client.gui.screen.TitleScreen
import org.example.client.ExampleClientHooks
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.injection.{At, Inject}
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo

@Mixin(Array(classOf[TitleScreen])) class TitleScreenMixin {
  @Inject(method = Array("init"), at = Array(new At("HEAD"))) private def init(ci: CallbackInfo): Unit = {
    ExampleClientHooks.onTitleScreenInit()
  }
}