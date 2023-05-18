package com.github.bun133.trainsigs.actor

import com.github.bun133.trainsigs.Scene
import com.github.bun133.trainsigs.Ticking
import com.github.bun133.trainsigs.graphics.Drawable
import com.github.bun133.trainsigs.graphics.Graphic
import kotlin.math.roundToInt

interface Actor : Ticking {
    fun drawable(): Drawable

    var x: Double
    var y: Double
    var xSpeed: Double
    var ySpeed: Double

    fun draw(g: Graphic) {
        drawable().draw(g, x.roundToInt(), y.roundToInt())
    }

    override fun tick(scene: Scene) {
        x += xSpeed
        y += ySpeed
    }
}