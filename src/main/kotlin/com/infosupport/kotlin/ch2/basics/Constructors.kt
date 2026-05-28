package com.infosupport.kotlin.ch2.basics

fun main() {
    val a = A()
    val b = B("Kotlin")

}

class A
class B(val x: String) // primary constructor, has 1 immutable property
class C(anX: String) { // primary constructor, 1 parameter
    val x: String

    init {
        this.x = anX
    }
}
class D(val x: String) {
    var y = ""

    constructor(anX: String, aY: String) : this(anX) {
        this.y = aY
    }
}