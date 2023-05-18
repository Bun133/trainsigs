package com.github.bun133.trainsigs

import com.github.bun133.trainsigs.graphics.AWTGraphic
import com.github.bun133.trainsigs.graphics.Graphic

fun main() {
    val g: Graphic = AWTGraphic(500, 500)

    val range = 300..500
    while (true) {
        // Wait 100ms
        Thread.sleep(100)
        // set graphic's width and height randomly within given range
        g.width = range.random()
        g.height = range.random()
    }
}