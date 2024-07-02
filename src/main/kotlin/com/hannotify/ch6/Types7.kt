@file:Suppress("KotlinConstantConditions")

package com.hannotify.ch6


// Primitives and other basic types: any, unit, nothing

fun main() {
    any()
    unit()
    nothing()
}

private fun any() {
    // Any is like Java's object
    val i: Any = 42
    val toString = i.toString()
    val equals = i.equals(43)
    val hashCode = i.hashCode()

    // Other methods from java.lang.Object are not available on i, so:
    // i.notify()
    // i.wait()
    // etc.

    // Any can be nullable also
    var j: Any? = null
    val equals1 = j?.equals(42)
    val equals2 = j == 42 // idiomatic equals, also possible on nullable type, gets translated to j?.equals(42)

    j = 43
    val equals3 = j.equals(42)
    val equals4 = j == 42 // idiomatic
}

private fun unit() {
    // Unit is Java's void
    // Unit means: only one instance
    fun returnUnit(): Unit {
        return Unit // Unit is the only value of type Unit;
    }

    // shorter:
    fun f() {
        // returns Unit implicitly
    }

    // We can use Unit as type argument, since Unit has a value (i.e. Unit):
    // See class NoResultProcessor : Processor<Unit> { ..
    // This can't be done with void in Java.
    NoResultProcessor().process()
    StringProcessor().process()

    // The name Unit is chosen instead of Void to better distinguish it from Nothing.
    // - Void and Nothing: meanings are too close.
    // - Unit and Nothing: means only one value vs. no value.
}

private fun nothing() {
    // Useful usage of Nothing:
    val addrNullable = person.company?.address
    println(addrNullable?.city ?: "Unknown")

    val addrNonNullable = person.company?.address ?: fail("No address found") // if no fail, address is non nullable!
    println(addrNonNullable.city)

    // other good example: https://medium.com/@ultimate_guy/a-simple-real-world-example-of-nothing-in-kotlin-33f5d7d01fa6
}

// used in testing libraries
fun fail(message: String): Nothing { // this function never returns anything
    throw IllegalStateException(message)
}

// Lab 1g
