package com.example.androiddesignpattern.observer

import android.util.Log

class AndroidDevObserver constructor(val s: Subject) : Observer() {

    init {
        s.attach(this)
    }

    override fun update() {
        Log.e("AndroidDevObserver", "---------" + s.getState())
    }

}