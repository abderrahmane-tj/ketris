package com.ketris

import com.ketris.framework.engine.Game
import com.ketris.screens.test.Screen as TestScreen
import com.ketris.screens.loading.Screen as LoadingScreen

fun main(args: Array<String>) {
  java.awt.EventQueue.invokeLater {
    Game.create(
      screenClass = ::LoadingScreen,
      width = GameConfig.CANVAS_WIDTH,
      height = GameConfig.CANVAS_HEIGHT
    )

    Window(title = "Ketris", canvas = Game.canvas)

    Game.start()
  }
}
