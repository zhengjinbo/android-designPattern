package com.example.androiddesignpattern.observer

import kotlin.collections.ArrayList

/**
 * 被观察者（主体）
 */
 class Subject {
    private var observers = ArrayList<Observer>()
    private var state: String? = null

    fun getState(): String = this!!.state!!
    fun setState(state: String) {
        this.state = state
        notifyAllObservers()
    }

    fun attach(observer: Observer)=observers.add(observer)

    private fun notifyAllObservers() {
        for (observer in observers){
            observer.update()
        }
    }


}