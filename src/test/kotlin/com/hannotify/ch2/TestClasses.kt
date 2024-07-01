package com.hannotify.ch2

import assertk.assertAll
import assertk.assertThat
import assertk.assertions.isFalse
import assertk.assertions.isTrue
import java.time.LocalDate
import kotlin.test.Test

class TestClasses {
    @Test
    fun testStartsWithA() {
        val bob = Person("Bob", isMarried = true, birthDate = LocalDate.now())
        val alice = Person("Alice", isMarried = false, birthDate = LocalDate.now())

        assertAll {
            assertThat(bob.startsWithA).isFalse()
            assertThat(alice.startsWithA).isTrue()
        }
    }
}