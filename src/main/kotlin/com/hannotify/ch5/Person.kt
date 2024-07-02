package com.hannotify.ch5

import com.hannotify.ch5.Instrument.Companion.guitar
import com.hannotify.ch5.Instrument.Companion.keyboard
import com.hannotify.ch5.Instrument.Companion.vocal

data class Person(val name: String = "", var age: Int = 0, var instruments: List<Instrument> = emptyList())

data class Instrument(val name: String) {
    constructor(i: Int) : this(i.toString())

    companion object {
        val keyboard = Instrument("Keyboard")
        val guitar = Instrument("Guitar")
        val vocal = Instrument("Vocal")
    }
}

val people = listOf(
    Person("Alice", 29),
    Person("Bob", 31),
    Person("Kurt", 27, listOf(guitar, vocal)),
    Person("Jim", 27, listOf(keyboard, vocal)),
    Person("Amy", 27, listOf(vocal)),
    Person("Janis", 27, listOf(vocal))
)

