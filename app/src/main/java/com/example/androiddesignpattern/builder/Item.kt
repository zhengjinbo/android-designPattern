package com.example.androiddesignpattern.builder

interface Item {
    fun name():String
    fun packing():Packing
    fun price():Float
}