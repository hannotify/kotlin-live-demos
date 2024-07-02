package com.hannotify.ch4

import com.hannotify.ch4.Expr.*

sealed interface Expr {
    class Num(val value: Int) : Expr
    class Sum(val left: Expr, val right: Expr) : Expr
    class Delta(val left: Expr, val right: Expr) : Expr
}

fun eval(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.left) + eval(e.right)
        is Delta -> eval(e.left) - eval(e.right)
    }

fun main() {
    val expression = Delta(Sum(Num(3), Num(7)), Num(8))
    println(eval(expression))
}

sealed class PrintResult {
    data class Success(val numberOfPages: Int) : PrintResult()
    data class OutOfPaper(val reason: String) : PrintResult()
    data class OutOfInk(val reason: String) : PrintResult()
}