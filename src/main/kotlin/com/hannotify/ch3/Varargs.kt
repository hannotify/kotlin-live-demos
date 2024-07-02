package com.hannotify.ch3

fun main() {
    val ints = arrayOf(1, 2, 3, 4, 5).toIntArray()
    val intList = listOf(1, 2, 3, 4, 5).toIntArray()

    print(1, 2, 3)
    print(1, 2)
    print(*ints)
    print(*intList)
}


fun print(vararg ints: Int) {
    ints.forEach { println(it) }
}

