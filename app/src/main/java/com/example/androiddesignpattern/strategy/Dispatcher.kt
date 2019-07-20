package com.example.androiddesignpattern.strategy

class Dispatcher{
    private lateinit var strategy: Strategy
    fun setStrategy(strategy: Strategy){
        this.strategy=strategy
    }

    fun doOperation(num1:Int,num2:Int):Int{
        return strategy.operation(num1,num2)
    }
}
