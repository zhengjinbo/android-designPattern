package com.example.androiddesignpattern.builder

//可口可乐
class Coke :ColdDrink() {
    override fun name(): String {
        return "ColdDrink"
    }

    override fun price(): Float {
        return 3f
    }
}