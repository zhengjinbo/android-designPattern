package com.example.androiddesignpattern.builder

//瓶子
class Bottle :Packing {
    override fun pack(): String {
       return "Bottle"
    }
}