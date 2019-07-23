package com.example.androiddesignpattern.builder

//鸡肉汉堡
class ChickenBurger : Burger() {
    override fun name(): String {
       return "ChickenBurger"
    }

    override fun price(): Float {
        return 15F
    }
}