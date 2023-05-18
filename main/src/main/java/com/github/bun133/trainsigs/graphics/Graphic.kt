package com.github.bun133.trainsigs.graphics

import java.awt.Color
import java.awt.Image

/**
 * this is the interface of handler of graphic
 * left top is (0,0)
 * right bottom is (width,height)
 */
interface Graphic {
    var width: Int
    var height: Int
    fun color(c: Color)

    fun drawLine(x: Int, y: Int, x2: Int, y2: Int)
    fun drawRect(x: Int, y: Int, width: Int, height: Int)
    fun fillRect(x: Int, y: Int, width: Int, height: Int)
    fun drawString(x: Int, y: Int, text: String)

    fun drawImage(x: Int, y: Int, image: Image)
    fun clear(color: Color = Color.WHITE)
}

fun Graphic.drawFrame(f: (g: Graphic) -> Unit) {
    // clear
    clear()
    // draw
    f(this)
}