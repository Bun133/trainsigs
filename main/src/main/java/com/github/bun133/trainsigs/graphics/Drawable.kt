package com.github.bun133.trainsigs.graphics

/**
 * this interface is for drawable objects
 */
interface Drawable {
    fun draw(g: Graphic, x: Int, y: Int)

    /**
     * The entire width
     */
    fun width(): Int

    /**
     * The entire height
     */
    fun height(): Int
}