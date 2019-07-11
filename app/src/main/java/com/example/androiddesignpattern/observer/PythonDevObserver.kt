package com.example.androiddesignpattern.observer

import android.util.Log

class PythonDevObserver constructor(val s: Subject): Observer() {
    init {
        s.attach(this)
    }

    override fun update() {
        Log.e("PythonDevObserver", "---------" + s.getState())
    }

}