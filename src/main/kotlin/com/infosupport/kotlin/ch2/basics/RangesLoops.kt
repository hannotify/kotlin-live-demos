package com.infosupport.kotlin.ch2.basics

import java.util.Random


fun main() {
    ranges()
}

fun ranges() {
    val range = 1..10
    val alsoRange = IntRange(1, 10)
    println(range.first)
    println(range.last)

    for (i in 1 until 10 step 2) {
        println(i)
    }

    val randomInt = Random().nextInt(20)
    if (randomInt in 1..10) {
        println("Random number $randomInt is in range")
    }

    val charRange = 'a'..'z'
    for (c in charRange) {
        println(c)
    }
}
