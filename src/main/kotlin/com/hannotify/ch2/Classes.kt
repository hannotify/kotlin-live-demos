package com.hannotify.ch2

import com.hannotify.ch2.Color.*
import java.io.Serializable
import java.time.LocalDate

fun main() {
    val hanno = Person("Hanno", true, birthDate = LocalDate.of(1990, 1, 1))
//    hanno.name = "Jaap"Jaap
    hanno.isMarried = false
//    hanno.birthDate = LocalDate.now()
    hanno.age = 39
    println(hanno.startsWithA)
    val alice = Person("Alice", true, birthDate = LocalDate.of(1990, 1, 1))
    println(alice.startsWithA)

    println(smartIf("geenColor"))
}

class A : Serializable

class B(val x: String) {
    lateinit var y: String

    constructor(x: String, y: String) : this(x) {
        this.y = y
    }
}

class Person(
    val name: String, // immutable (field, getter)
    var isMarried: Boolean, // mutable (field, getter, setter)
    val eyesColor: Color = BLUE,
    birthDate: LocalDate
) {
    var birthDate: LocalDate = birthDate
        private set

    var age: Int = 0
        get() {
            return field
        }
        set(updatedAge) {
            println("Age is being updated to $updatedAge")
            field = updatedAge
        }

    val startsWithA
        get() = name.startsWith("A")

    fun mixColors(c: Color) = when (setOf(this.eyesColor, c)) {
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            setOf(BLUE, VIOLET) -> INDIGO
            else -> throw IllegalArgumentException("Invalid color")
    }
}

enum class Color { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }
enum class RGBColor(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238); // semi colon!!

    fun rgb() = (r * 256 + g) * 256 + b
}

fun smartIf(a: Any) =
    // Java
    // if (a instanceof Color color) {
    //      color.getName()
    // }

    // Kotlin
    if (a is Color) {
        a.name
    } else if (a is RGBColor) {
        a.rgb().toString()
    } else {
        "unknown"
    }
