package com.example.androiddesignpattern.strategy

/**
 * 减法运算
 */
class Subtraction : Strategy {
    override fun operation(number1: Int, number2: Int): Int {
        return number1 - number2
    }


}