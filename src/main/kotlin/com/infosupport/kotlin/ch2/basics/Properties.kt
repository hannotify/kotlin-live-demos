package com.infosupport.kotlin.ch2.basics

fun main() {
    val person = Person()
    person.age = 21
    person.name = "Hanno"

    println(person.age)

    person.age = -1
    println(person.age)

    println(person.startsWithA)
//    person.startsWithA = false
}

class Person {
    var name: String = "Default Name"
    var age: Int = 0 // getter/setter are generated
        get() {
            return field // Kotlin keyword 'field'
        }
        set(newValue) {
            if (newValue >= 0) {
                field = newValue
            }
        }
    var eyeColor: Color = Color.BLUE

    val startsWithA
        get() = name.startsWith("A")
}