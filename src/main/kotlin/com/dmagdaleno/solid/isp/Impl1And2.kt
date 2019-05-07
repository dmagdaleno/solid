package com.dmagdaleno.solid.isp

class Impl1And2: Interface1, Interface2 {

    override fun method1(): String {
        return "Implements method 1"
    }

    override fun method2(): String {
        return "Implements method 2"
    }
}