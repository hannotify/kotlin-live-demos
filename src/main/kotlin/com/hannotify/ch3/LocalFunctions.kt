package com.hannotify.ch3

fun main() {
    saveUserShorter(User(1, "", ""))
}

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User): User {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException("User name can't be empty")
    }

    if (user.address.isEmpty()) {
        throw IllegalArgumentException("User address can't be empty")
    }

    // Save to database...
    return user
}

fun saveUserBetter(user: User): User {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("$fieldName can't be empty")
        }
    }
    validate(user.name, "Name")
    validate(user.address, "Address")

    // Save to database...
    return user
}

fun saveUserShorter(user: User): User {
    fun validate(value: String, fieldName: String) {
        require(value.isNotEmpty()) { "$fieldName can't be empty" }
        check(value.isNotEmpty()) { "$fieldName can't be empty" }

        if (value.isEmpty()) {
            throw IllegalArgumentException("$fieldName can't be empty")
        }
    }
    validate(user.name, user::name.name)
    validate(user.address, user::address.name)

    // Save to database...
    return user

}

fun User.validate() {
    fun validate(propertyName: String, value: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user $id: empty $propertyName"
            )
        }
    }
    validate(propertyName = this::name.name, value = name)
    validate(propertyName = this::address.name, value = address) // here we get property using reflection
}
