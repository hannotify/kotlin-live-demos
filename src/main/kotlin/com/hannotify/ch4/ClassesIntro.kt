package com.hannotify.ch4

open class UserVerbose {
    private var nickname: String // private property, a bit like a field

    constructor(nickname: String) { // ctor implementation
        this.nickname = nickname
    }

    fun getNickname() = nickname // the getter makes the private prop available

    fun setNickname(value: String) {
        this.nickname = value
    }
}

open class UserLessVerbose(nickname: String) {
    var nickname = nickname  // public property
        get() = field
        set(value) {
            field = value
        }
}

open class UserEvenLessVerbose(nickname: String) {
    var nickname = nickname
}

open class User(var nickname: String)


