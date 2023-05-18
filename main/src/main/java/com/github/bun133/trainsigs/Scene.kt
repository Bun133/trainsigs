package com.github.bun133.trainsigs

import com.github.bun133.trainsigs.actor.Actor
import com.github.bun133.trainsigs.graphics.Graphic
import com.github.bun133.trainsigs.graphics.drawFrame

class Scene(val g: Graphic) {
    val actors = mutableListOf<Actor>()
    fun draw() {
        g.clear()
        g.drawFrame {
            actors.forEach {
                it.draw(g)
            }
        }
    }
}