package com.hannotify.ch3

val set = setOf(1, 7, 53)
val hashSet = hashSetOf(1, 7, 53)
val list = listOf(1, 7, 53)
val arrayList = arrayListOf(1, 7, 53)
val mutList = mutableListOf(1, 7, 53)
val hashMap = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")  // Note: 'to' is a normal function!

fun main() {
    println("--- TYPES ---")
    println(set.javaClass)            // class java.util.LinkedHashSet
    println(hashSet.javaClass)        // class java.util.HashSet
    println(list.javaClass)           // class java.util.Arrays$ArrayList, immutable
    println(arrayList.javaClass)      // class java.util.ArrayList
    println(mutList.javaClass)        // class java.util.ArrayList
    println(hashMap.javaClass)        // class java.util.HashMap

    println("------- METHODS --------")
    println(set.minus(1))
    println(hashSet.minus(arrayOf(1, 53)))
    println(hashSet.maxByOrNull { it })
    println(list.asReversed())
    println(arrayList.last())
    println(hashMap.any())
    // ... and much more
}