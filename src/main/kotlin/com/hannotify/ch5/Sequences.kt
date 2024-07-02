package com.hannotify.ch5

fun main() {
    // Kotlin sequence = Java stream

    // Example of a sequence
    people.asSequence()
        .filter { it.age == 27 }  // intermediate operation
        .map { it.instruments }
        .flatten()
        .filter { it.name.length <= 5 }
        .take(5)
        .sortedBy { it.name }
        .forEachIndexed { index, i -> println("Instrument $index = ${i.name}") } // terminal operation

    // For a list of operations, see https://kotlinlang.org/docs/reference/collection-operations.html

    createSequence()
}

fun createSequence() {
    val naturalNumbers = generateSequence(1) { it + 1 }
    val numbersUntil100 = naturalNumbers.takeWhile { it <= 100 }
    val sum = numbersUntil100.sum()
    println("Sum: $sum")

    val fibonacciUntil100000 = fibonacci().takeWhile { it <= 100000 }.toList()
    println(fibonacciUntil100000)
}

fun fibonacci() = sequence {
    var terms = Pair(0, 1)

    while (true) {
        yield(terms.first)
        terms = Pair(terms.second, terms.first + terms.second)
    }
}
