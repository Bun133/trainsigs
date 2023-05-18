package com.github.bun133.trainsigs.graphics

import java.awt.image.BufferedImage

/**
 * This class buffers the result of drawable.
 * stored data can be flushed by calling flush()
 */
class BufferedDrawable(val drawable: Drawable) : Drawable {
    private var buffer: BufferedImage? = null

    fun flush() {
        val w = drawable.width()
        val h = drawable.height()
        buffer = BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB)
        drawable.draw(AWTGraphic(buffer!!.graphics, w, h), 0, 0)
    }

    override fun draw(g: Graphic, x: Int, y: Int) {
        if (buffer == null) flush()
        g.drawImage(x, y, buffer!!)
    }


    override fun width(): Int = buffer?.width ?: 0
    override fun height(): Int = buffer?.height ?: 0
}