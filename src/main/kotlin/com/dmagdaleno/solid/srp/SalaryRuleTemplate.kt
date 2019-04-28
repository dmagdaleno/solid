package com.dmagdaleno.solid.srp

abstract class SalaryRuleTemplate: SalaryRule {

    override fun calculate(employee: Employee): Double {
        return if(employee.salary > salaryThreshold()) {
            employee.salary * maxDiscount()
        }
        else {
            employee.salary * minDiscount()
        }
    }

    abstract fun salaryThreshold(): Double

    abstract fun maxDiscount(): Double

    abstract fun minDiscount(): Double
}