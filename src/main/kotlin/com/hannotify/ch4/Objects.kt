package com.hannotify.ch4

object FrontController {
    init {
        println("Creating FrontController")
    }

    fun route(destination: String) = println("Routing to $destination")
}

object HttpClient {
    var baseUrl: String = System.getenv("BACKEND_HOST") ?: "localhost"

    fun callService() {
        println("calling service on url ${baseUrl}")
    }
}

class Manager(val name: String, val age: Int) {
    companion object {
        const val PAY_GRADE = 18

        fun of( name: String, age: Int): Manager {
            return Manager(name, age)
        }
    }
}

val customIterator = object : Iterator<Manager> {
    override fun hasNext(): Boolean {
        TODO("Not yet implemented")
    }

    override fun next(): Manager {
        TODO("Not yet implemented")
    }
}

fun main() {
    println("Running main()")

    FrontController.route("/about")
    HttpClient.callService()

    val manager = Manager.of("Toon", 75)
}