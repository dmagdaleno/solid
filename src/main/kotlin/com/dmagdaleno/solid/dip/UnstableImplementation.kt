package com.dmagdaleno.solid.dip

class UnstableImplementation : StableAbstraction {
    override fun method(): String {
        return "This is an unstable implementation, but it is ok since we can change it"
    }
}