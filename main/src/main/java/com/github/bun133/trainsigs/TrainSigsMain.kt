package com.github.bun133.trainsigs

import com.github.bun133.trainsigs.graphics.AWTGraphic
import com.github.bun133.trainsigs.graphics.Graphic
import java.awt.Color

fun main() {
    val g: Graphic = AWTGraphic(500, 500)
    val scene: Scene = Scene(g)
    val train = Train(Color.RED, 100.0, 100.0)
    scene.actors.add(train)

    val range = 100..300

    while (true) {
        // wait one frame
        Thread.sleep(16)
        // randomly move train within range
        train.x = range.random().toDouble()
        train.y = range.random().toDouble()
        // update
        scene.draw()
    }
}