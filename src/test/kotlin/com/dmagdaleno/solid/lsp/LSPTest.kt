package com.dmagdaleno.solid.lsp

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class LSPTest {

    @Test
    fun shouldReturnSameResult() {
        val sup = Super()
        val sub = Sub()

        assertThat(sup.method()).isEqualTo(sub.method())
    }
}