package com.example.androiddesignpattern.builder

//百事可乐
class PePsi :ColdDrink() {
    override fun name(): String {
        return "PePsi"
    }

    override fun price(): Float {
        return 3f
    }
}