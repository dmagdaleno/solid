package com.dmagdaleno.solid.srp

class FifteenOrTwentyFivePerCent: SalaryRuleTemplate() {

    override fun salaryThreshold(): Double {
        return 2000.0
    }

    override fun maxDiscount(): Double {
        return 0.75
    }

    override fun minDiscount(): Double {
        return 0.85
    }
}