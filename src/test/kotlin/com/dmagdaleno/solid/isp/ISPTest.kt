package com.dmagdaleno.solid.isp

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ISPTest {

    @Test
    fun shouldImplementMethod1And2() {
        val impl = Impl1And2()

        assertThat(impl.method1()).isEqualTo("Implements method 1")
        assertThat(impl.method2()).isEqualTo("Implements method 2")
    }

    @Test
    fun shouldImplementOnlyMethod3() {
        val impl = Impl3()

        assertThat(impl.method3()).isEqualTo("Implements only method 3")
    }
}