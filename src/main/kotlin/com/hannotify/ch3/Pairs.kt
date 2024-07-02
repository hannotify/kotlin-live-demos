package com.hannotify.ch3

class Pairs {
    val zero = Pair(0, "zero")
    val one = 1 to "one"
    val two = 2 by "two"

    val map = mapOf(zero, one, 7 to "seven", 53 by "fifty-three")
}

infix fun Any.by(other: Any) = Pair(this, other)