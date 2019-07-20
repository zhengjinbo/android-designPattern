package com.example.androiddesignpattern.strategy

/**
 * 乘法运算
 */
class Multiplication : Strategy {
    override fun operation(number1: Int, number2: Int): Int {
        return number1 * number2
    }


}