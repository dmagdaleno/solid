package com.dmagdaleno.solid.ocp

class OpenClosedPrinciple(
        val firstDependency: Abstraction01,
        val secondDependency: Abstraction02
) {
    fun executeExample(): String {
        return "${firstDependency.use()}::${secondDependency.execute()}"
    }
}