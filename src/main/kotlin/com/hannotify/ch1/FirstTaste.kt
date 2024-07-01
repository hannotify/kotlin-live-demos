package com.hannotify.ch1

class Person(val name: String, val age: Int? = null)

fun main() {
    val alice = Person("Alice")
    val bob = Person("Bob", 29)

    val people = listOf(alice, bob)

    val maxAge = people.maxOf { it.age ?: 0 }
    val oldestPerson = people.maxByOrNull { it.age ?: 0 }

    println(people)
    println("""The "highest age" is: $maxAge.""")
    println("The oldest person is: ${oldestPerson?.name}")
}
