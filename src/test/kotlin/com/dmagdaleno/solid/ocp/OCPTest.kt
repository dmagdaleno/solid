package com.dmagdaleno.solid.ocp

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class OCPTest {

    @Test
    fun shouldRunDefaultImpl() {
        val abstraction01 = Abstraction01DefaultImpl()
        val abstraction02 = Abstraction02DefaultImpl()
        val ocp = OpenClosedPrinciple(abstraction01, abstraction02)
        val example = ocp.executeExample()
        assertThat(example).isEqualTo("Abstraction01DefaultImpl.use::Abstraction02DefaultImpl.execute")
    }

    @Test
    fun shouldRunSecondImplWithoutChangingOCPClass() {
        val abstraction01 = Abstraction01SecondImpl()
        val abstraction02 = Abstraction02SecondImpl()
        val ocp = OpenClosedPrinciple(abstraction01, abstraction02)
        val example = ocp.executeExample()
        assertThat(example).isEqualTo("Abstraction01SecondImpl.use::Abstraction02SecondImpl.execute")
    }
}