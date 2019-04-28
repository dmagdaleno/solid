package com.dmagdaleno.solid.srp

enum class Title(val rule: SalaryRule) {

    DEVELOPER(TenOrTwentyPerCent()),

    TESTER(FifteenOrTwentyFivePerCent())

}