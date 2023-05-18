package com.github.bun133.trainsigs

import com.github.bun133.trainsigs.actor.Actor
import com.github.bun133.trainsigs.graphics.Graphic
import com.github.bun133.trainsigs.graphics.drawFrame
import java.awt.Color

class Scene(val g: Graphic) {
    private val actors = mutableListOf<Actor>()
    private val tickers = mutableListOf<Ticking>()

    fun add(obj: Any) {
        if (obj is Actor) actors.add(obj)
        if (obj is Ticking) tickers.add(obj)
    }

    fun draw() {
        g.drawFrame({
            actors.forEach {
                it.draw(g)
            }
        }, Color.BLACK)

        tick()
    }

    private var lastTicked = 0L

    /**
     * Interval millis to tick
     */
    private val TICK_INTERVAL = 16L
    fun tick() {
        val now = System.currentTimeMillis()
        if (now - lastTicked < TICK_INTERVAL) {
            return
        }

        lastTicked = now
        tickers.forEach {
            it.tick(this)
        }
    }
}