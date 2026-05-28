package com.infosupport.kotlin.ch2.basics

import com.infosupport.kotlin.ch2.basics.Color.*

fun main() {
    val hanno = Person()
    hanno.eyeColor = BLUE

    when (hanno.eyeColor) {
        BLUE, RED, VIOLET -> println("blue, red, violet")
        GREEN if hanno.age > 18 -> println("green, adult")
        GREEN if hanno.age <= 18 -> println("green, child")
        else -> println("some other eye color")
    }
}

fun isBlue(a: Any) {
    when (a) {
        is Color if a == BLUE -> println("blue")
        is RGBColor if a.rgb() == RGBColor.BLUE.rgb() -> println("blue")
        else -> false
    }
}




enum class Color { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }

enum class RGBColor(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238); // semi colon!!

    fun rgb() = (r * 256 + g) * 256 + b
}