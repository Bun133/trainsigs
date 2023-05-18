package com.github.bun133.trainsigs.graphics

import java.awt.Color

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
    fun clear(color: Color = Color.WHITE) {
        color(color)
        drawRect(0, 0, width, height)
    }
}