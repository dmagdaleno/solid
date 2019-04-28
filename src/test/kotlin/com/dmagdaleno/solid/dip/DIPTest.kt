package com.dmagdaleno.solid.dip

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class DIPTest {

    @Test
    fun shouldRunUnstableImpl() {
        val abstraction: StableAbstraction = UnstableImplementation()
        val dip = DependencyInversionPrinciple(abstraction)
        val example = dip.useDependency()

        assertThat(example).isEqualTo("This is an unstable implementation, but it is ok since we can change it")
    }

}