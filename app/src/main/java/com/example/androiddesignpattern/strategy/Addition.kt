package com.example.androiddesignpattern.strategy

/**
 * 加法运算
 */
class Addition : Strategy {
    override fun operation(number1: Int, number2: Int): Int {
        return number1 + number2
    }


}