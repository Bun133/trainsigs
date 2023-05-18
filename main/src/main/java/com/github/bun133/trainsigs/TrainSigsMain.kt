package com.github.bun133.trainsigs

import com.github.bun133.trainsigs.graphics.AWTGraphic
import com.github.bun133.trainsigs.graphics.Graphic
import java.awt.Color

fun main() {
    val g: Graphic = AWTGraphic(500, 500)
    val scene: Scene = Scene(g)
    val train = Train(Color.RED, 100.0, 100.0, 10.0, 10.0)
    scene.add(train)

    val range = 100..300

    while (true) {
        // wait one frame
        Thread.sleep(16)
        // update
        scene.draw()
    }
}