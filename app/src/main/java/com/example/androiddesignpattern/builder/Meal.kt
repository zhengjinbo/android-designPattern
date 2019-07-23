package com.example.androiddesignpattern.builder

import com.example.administrator.myview.LogUtil

//一餐
class Meal {
    var list: ArrayList<Item> = mutableListOf<Item>() as ArrayList<Item>
    fun addItem(itme: Item) {
        list.add(itme)
    }

    fun getCost(): Float {
        var cost: Float = 0F
        list.forEach{
            cost += it.price()
        }
        return cost
    }

    fun showItem(){
        list.forEach {
           LogUtil.e("Meal","name=${it.name()}")
           LogUtil.e("Meal","price=${it.price()}")
           LogUtil.e("Meal","packing=${it.packing().pack()}")
        }
    }
}