package com.dmagdaleno.solid.srp

class TenOrTwentyPerCent: SalaryRuleTemplate() {

    override fun salaryThreshold(): Double {
        return 3000.0
    }

    override fun maxDiscount(): Double {
        return 0.8
    }

    override fun minDiscount(): Double {
        return 0.9
    }

}