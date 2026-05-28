package com.infosupport.kotlin.ch1.intro

data class Person(val name: String, val age: Int? = null)

fun main() {
    val hanno = Person("Hanno", 41) // type inference
    val rianne = Person("Rianne")
    val obinna = Person(name = "Obinna", age = 32)

    val people = listOf(hanno, rianne, obinna)
    val highestAge = people.maxOf { it.age ?: 0 }  // elvis operator

    val oldestPersonNullable = people.maxByOrNull { it.age ?: 0 }
    val oldestPerson = people.maxBy { it.age ?: 0 }

    println("""The "highest" age is $highestAge.""")
    println("The oldest person is ${oldestPerson}.")
    println("The oldest person is ${oldestPersonNullable?.name}.")
}
