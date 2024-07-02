package com.hannotify.ch5

fun main() {
    abcUsingWith()
    abcUsingApply()
}

fun abcUsingApply() =
    StringBuilder().apply {
        append('A')
        append('B')
        append('C')
    }.toString()

fun abcUsingWith(): String {
    val sb = StringBuilder()

    with(sb) {
        append('A')
        append('B')
        append('C')

        toString()
    }
}


