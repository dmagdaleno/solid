package com.dmagdaleno.solid.dip


class DependencyInversionPrinciple (val dependency: StableAbstraction) {

    fun useDependency(): String {
        return dependency.method()
    }
}