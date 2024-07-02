package com.hannotify.ch4

fun main() {

}

class Outer(var message: String = "Hello") {

    inner class Inner {
        fun message(): String {
            return this@Outer.message + " Kotlin training!"
        }
    }

    class Nested(var name: String = "") {
        fun message() {
            // this@Outer.message
            // no access to outer class instance!
        }
    }
}