package com.infosupport.kotlin.ch2.basics

fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        println("Hello ${args[0]}!")
    } else {
        println("Hello World!")
    }

    val s = if (args.isNotEmpty()) args[0] else "World"

    val s2 = if (args.isNotEmpty()) {
        println("within if block")
        args[0]
    } else {
        "World"
    }

    println(s)
    println(s2)

    // string templates
    println("Hello $s2!")
    println("Hello ${if (s2.length > 3) ">3" else "<=3"}!")
}

// top-level function
// 'pure function': output does not depend on any external state
//fun max(a: Int, b: Int): Int {
//    return if (a > b) a else b
//}

// expression body function
fun max(a: Int, b: Int) = if (a > b) a else b

