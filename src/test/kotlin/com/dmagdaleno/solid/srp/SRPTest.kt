package com.dmagdaleno.solid.srp

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SRPTest {

    @Test
    fun shouldDiscount20PerCent() {
        val salary = 3001.0
        val employee = Employee("Employee 1", salary, Title.DEVELOPER)
        val discountedSalary = employee.calculateTax()

        assertThat(discountedSalary).isEqualTo(salary * 0.8)
    }

    @Test
    fun shouldDiscount10PerCent() {
        val salary = 3000.0
        val employee = Employee("Employee 1", salary, Title.DEVELOPER)
        val discountedSalary = employee.calculateTax()

        assertThat(discountedSalary).isEqualTo(salary * 0.9)
    }

    @Test
    fun shouldDiscount25PerCent() {
        val salary = 2001.0
        val employee = Employee("Employee 1", salary, Title.TESTER)
        val discountedSalary = employee.calculateTax()

        assertThat(discountedSalary).isEqualTo(salary * 0.75)
    }

    @Test
    fun shouldDiscount15PerCent() {
        val salary = 2000.0
        val employee = Employee("Employee 1", salary, Title.TESTER)
        val discountedSalary = employee.calculateTax()

        assertThat(discountedSalary).isEqualTo(salary * 0.85)
    }
}