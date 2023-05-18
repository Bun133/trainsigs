package com.github.bun133.trainsigs.graphics

import java.awt.Color
import javax.swing.JFrame

class AWTGraphic(w: Int, h: Int) : Graphic {
    val window = JFrame().also {
        it.setSize(w, h)
        it.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        it.isVisible = true
        it.isResizable = true
        it.setLocationRelativeTo(null)
        it.title = "Train Signs"
    }

    override var width: Int = w
        get() = window.width
        set(value) {
            field = value
            window.setSize(value, height)
        }

    override var height: Int = h
        get() = window.height
        set(value) {
            field = value
            window.setSize(width, value)
        }

    val g = window.graphics

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
}