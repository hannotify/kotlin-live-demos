package com.hannotify.ch2

fun main(args: Array<String>) {
    val s = if (args.isNotEmpty()) args[0] else "world"

    val s2 = if (args.isNotEmpty()) {
        println("wait for it...")
        args[0]
    } else {
        "world"
    }

    println("Hello $s!")
    println("Hello $s2!")
    println("Hello ${if (args.isNotEmpty()) args[0] else "world"}!")

    var y: Double

    y = 3.1415926535897
}

fun max(a: Int, b: Int = 500): Int {
    return if (a > b) a else b
}

fun maxExpressionBody(a: Int, b: Int) = if (a > b) a
    else b
