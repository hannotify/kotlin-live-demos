package com.hannotify.ch3

fun String.lastChar(): Char = get(length - 1)

fun main() {
    val button = Button()
    val buttonAsView: View = Button()

    button.click()
    button.off()

    buttonAsView.click()
    buttonAsView.off()
}


abstract class View {
    open fun click() = println("View clicked")
}

class Button : View() {
    override fun click() = println("Button clicked")
}

fun View.off() = println("View off from extension function")
fun Button.off() = println("Button off from extension function")