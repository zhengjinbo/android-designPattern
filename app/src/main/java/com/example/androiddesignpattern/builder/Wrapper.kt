package com.example.androiddesignpattern.builder

//包装袋
class Wrapper :Packing {
    override fun pack(): String {
       return "wrapper"
    }
}