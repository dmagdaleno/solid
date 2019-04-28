package com.dmagdaleno.solid.srp

data class Employee (
        val name: String = "undefined",
        val salary: Double = 0.0,
        val title: Title
) {

    fun calculateTax(): Double {
        return title.rule.calculate(this)
    }
}