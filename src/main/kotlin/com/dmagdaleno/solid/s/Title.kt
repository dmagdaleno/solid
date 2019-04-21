package com.dmagdaleno.solid.s

enum class Title(val rule: SalaryRule) {

    DEVELOPER(TenOrTwentyPerCent()),

    TESTER(FifteenOrTwentyFivePerCent())

}