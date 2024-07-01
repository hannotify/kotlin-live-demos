package com.hannotify.ch2

import java.io.BufferedReader
import java.io.FileWriter
import java.io.IOException

fun main() {
    // loopsAndRanges()

    val kotlinForDevelopers = Course(1, "Kotlin for developers")
    println(kotlinForDevelopers)

    // destructuring
    val (id, name) = kotlinForDevelopers

    println(id)
    println(name)

    destructuringWithLists()
    tryCatch()
}

fun tryCatch() =
    // Throwable
    // Exception
    // RuntimeException
    try {
        val number = readNumber(null)
        println(number)
        number
    } catch (e: IllegalArgumentException) {
        println("Exception occurred: ${e.message}")
        null
    }

@Throws(IOException::class)
fun tryWithResources() {
    val writer = FileWriter("test.txt")

    writer.use {
        it.write("line in file")
    }
}


fun destructuringWithLists() {
    for ((index, element) in listOf(Course(1, "Kotlin"), Course(2, "C#")).withIndex()) {
        val (_, name) = element
        println("$index: $name")
    }
}

fun loopsAndRanges() {
//    do {
//
//    } while (true)
//
//    while (true) {
//        // ..
//    }
    val ageRange = 0..99 step 1 // 99 included!
    println(ageRange.first)
    println(ageRange.last)
    ageRange.step

    val charRange = 'a'..'z'
    val uppercaseChars = 'A'..'Z'

    var numbers = listOf(0, 45161, 2, 3, 4, 5, 6, 7, 8, 9, 10)

//    val range = 0 until 99
//    val range = 0..<99
//    val range = 0.until(99)

    val rangeInversed = 99 downTo 0 step 2
    show(rangeInversed)
    show(ageRange)
}

private fun show(ageRange: IntProgression) {
    for (i in ageRange) {
        println(i)
    }
}

data class Course(val id: Int, val name: String)

private fun readNumber(reader: BufferedReader?): Int? { // optional Int, i.e. nullable
    if (reader == null) {
        // how to throw an exception:
        throw IllegalArgumentException("reader cannot be null")
    }

    // try as an expression:
    return try {
        val readLine = reader.readLine() // throws IOException, but all exceptions are unchecked in kotlin
        Integer.parseInt(readLine)
    } catch (e: NumberFormatException) {
        e.printStackTrace()
        null
    }
}