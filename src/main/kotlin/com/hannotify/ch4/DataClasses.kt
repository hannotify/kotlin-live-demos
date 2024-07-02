package com.hannotify.ch4

data class FamilyMember(val name: String, val age: Int)

fun main() {
    val hanno = FamilyMember("Hanno", 30)
    val joep = FamilyMember("Joep", 2)
    val joep2 = FamilyMember("Joep", 2)

    println(joep)
    println(joep == joep2)
    println(joep === joep2)
}