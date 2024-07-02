package com.hannotify.ch3

fun main() {
    val string = "Kotlin?"
    println(string.lastChar)

    val sb = StringBuilder(string)
    sb.lastChar = '!'
    println(sb)
}

val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value) {
        setCharAt(length - 1, value)
    }