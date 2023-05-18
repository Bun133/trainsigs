package com.github.bun133.trainsigs

import com.github.bun133.trainsigs.actor.Actor
import com.github.bun133.trainsigs.graphics.BufferedDrawable
import com.github.bun133.trainsigs.graphics.Drawable
import com.github.bun133.trainsigs.graphics.Graphic
import java.awt.Color

class Train(
    val color: Color,
    override var x: Double,
    override var y: Double,
    override var xSpeed: Double,
    override var ySpeed: Double
) : Actor {
    companion object {
        internal const val WIDTH = 100
        internal const val HEIGHT = 20
    }

    override fun drawable(): Drawable = BufferedDrawable(TrainDrawable(this))
}

class TrainDrawable(private val train: Train) : Drawable {
    override fun draw(g: Graphic, x: Int, y: Int) {
        g.color(train.color)
        g.fillRect(x, y, width(), height())
    }

    override fun width(): Int = Train.WIDTH
    override fun height(): Int = Train.HEIGHT
}