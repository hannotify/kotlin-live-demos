@file:JvmName("Util")

package com.hannotify.ch3

var operationCount = 0

fun performOperation() {
    operationCount++
}

fun reportOperationCount() {
    println("Operation performed $operationCount times.")
}

fun main() {
    reportOperationCount()

    repeat(5, { i -> performOperation()})
    // is precies hetzelfde als:
    repeat(5) {
        performOperation()
    }
    reportOperationCount()
}