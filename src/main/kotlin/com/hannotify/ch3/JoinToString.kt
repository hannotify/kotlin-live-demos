package com.hannotify.ch3;

import javax.swing.JPopupMenu.Separator

fun main() {
    val list = listOf(1, 2, 3)

    println(joinToStringCustom(list, separator = " | ", postfix = "}"))

    println(list.joinToString(prefix = "[", postfix = "]"))
}

@JvmOverloads
fun <T> joinToStringCustom(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "[",
    postfix: String = "]"
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)

    return result.toString()
}