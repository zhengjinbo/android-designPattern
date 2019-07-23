package com.example.androiddesignpattern.builder

class MealBuilder {

    fun prepareVegBurger(): Meal {
        var meal: Meal = Meal()
        meal.addItem(VegBurger())
        meal.addItem(Coke())
        return meal
    }

    fun prepareNonVegBurger():Meal{
        var meal :Meal = Meal()
        meal.addItem(ChickenBurger())
        meal.addItem(PePsi())
        return meal
    }
}