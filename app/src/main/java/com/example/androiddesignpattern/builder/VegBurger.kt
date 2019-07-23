package com.example.androiddesignpattern.builder

//蔬菜汉堡
class VegBurger : Burger() {
    override fun name(): String {
       return "VegBurger"
    }

    override fun price(): Float {
        return 8.5F
    }
}