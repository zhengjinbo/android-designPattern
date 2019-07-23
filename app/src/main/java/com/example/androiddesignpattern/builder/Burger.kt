package com.example.androiddesignpattern.builder

//汉堡包
abstract class Burger : Item {
    override abstract fun name(): String

    override fun packing(): Packing {
        return Wrapper()
    }
    override abstract fun price(): Float
}