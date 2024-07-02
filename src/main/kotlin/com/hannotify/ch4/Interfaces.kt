package com.hannotify.ch4

interface Named {
    val name: String
}

interface Person : Named {
    val firstName: String
    val lastName: String

    override val name: String get() = "$firstName $lastName"
}

data class Employee(override val firstName: String, override val lastName: String, val position: String) : Person {
}

fun main() {
    val button = Button()
    button.info()
    button.setFocus(true)
    button.click()
}

interface Clickable {
    fun click()

    // default implementation
    fun info() = println("I'm clickable!")
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")

    fun info() = println("I'm focusable!")
}

class Button : Clickable, Focusable {
    override fun click() = println("Button was clicked")

    override fun info() {
        super<Clickable>.info()
        super<Focusable>.info()
    }
}