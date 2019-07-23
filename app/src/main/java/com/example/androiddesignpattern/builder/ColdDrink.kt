package com.example.androiddesignpattern.builder

//冷饮
abstract class ColdDrink : Item {
    override abstract fun name(): String

    override fun packing(): Packing {
        return Bottle()
    }
    override abstract fun price(): Float
}