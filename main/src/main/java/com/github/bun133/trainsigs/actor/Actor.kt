package com.github.bun133.trainsigs.actor

import com.github.bun133.trainsigs.graphics.Drawable
import com.github.bun133.trainsigs.graphics.Graphic
import kotlin.math.roundToInt

interface Actor {
    fun drawable(): Drawable

    var x:Double
    var y:Double
    fun draw(g: Graphic) {
        drawable().draw(g, x.roundToInt(), y.roundToInt())
    }
}