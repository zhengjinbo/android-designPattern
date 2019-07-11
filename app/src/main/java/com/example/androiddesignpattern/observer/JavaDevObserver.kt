package com.example.androiddesignpattern.observer

import android.util.Log

class JavaDevObserver constructor(val s: Subject): Observer() {
    init {
        s.attach(this)
    }
    override fun update() {
        Log.e("JavaDevObserver", "---------" + s.getState())
    }

}