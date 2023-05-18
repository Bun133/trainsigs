package com.github.bun133.trainsigs.graphics

import java.awt.Color
import java.awt.Graphics
import java.awt.Image
import javax.swing.JFrame

class AWTGraphic : Graphic {
    val g: Graphics
    val frame: JFrame?

    constructor(g: Graphics, w: Int, h: Int) {
        this.g = g
        this.frame = null

        width = w
        height = h
    }

    constructor(w: Int, h: Int) {
        frame = JFrame().also {
            it.setSize(w, h)
            it.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
            it.isVisible = true
            it.isResizable = true
            it.setLocationRelativeTo(null)
            it.title = "Train Signs"
        }
        g = frame.graphics

        width = w
        height = h
    }

    override var width: Int
        set(value) {
            frame?.setSize(value, height)
            field = value
        }
        get() = frame?.width ?: field

    override var height: Int
        set(value) {
            frame?.setSize(width, value)
            field = value
        }
        get() = frame?.height ?: field

    override fun color(c: Color) {
        g.color = c
    }

    override fun drawLine(x: Int, y: Int, x2: Int, y2: Int) {
        g.drawLine(x, y, x2, y2)
    }

    override fun drawRect(x: Int, y: Int, width: Int, height: Int) {
        g.drawRect(x, y, width, height)
    }

    override fun fillRect(x: Int, y: Int, width: Int, height: Int) {
        g.fillRect(x, y, width, height)
    }

    override fun drawString(x: Int, y: Int, text: String) {
        g.drawString(text, x, y)
    }

    override fun drawImage(x: Int, y: Int, image: Image) {
        g.drawImage(image, x, y, null)
    }

    override fun clear(color: Color) {
        g.clearRect(0, 0, width, height)
        g.color = color
        g.fillRect(0, 0, width, height)
    }
}