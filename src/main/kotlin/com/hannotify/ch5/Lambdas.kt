package com.hannotify.ch5

fun main() {
//    lambdas()
    functionReferences()
}

fun functionReferences() {
    val getAge = { person: Person -> person.age }
    val getAgeRef = Person::age

    val runSalute = { s: String -> salute(s) }
    val runSaluteRef = ::salute

    println(getAge(people[0]))
    val dmitry = Person("Dmitry", 34)

    println(getAgeRef(dmitry))
}

fun lambdas() {
    val printNumber = { n: Int -> println(n) }
    val printHello = { println("Hello") }

    iExpectLambda("hello!", printHello)
    iExpectLambda("hello!", { println("bye!")})

    iExpectLambda("hello!") {
        println("bye!")
    }
}

fun iExpectLambda(message: String, block: () -> Unit) {
    println(message)
    block()
}

fun salute(s: String) = println("Salute $s!")

