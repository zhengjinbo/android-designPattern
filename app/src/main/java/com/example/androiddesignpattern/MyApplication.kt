package com.example.androiddesignpattern

import android.app.Application
import android.content.Context

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        var instance: Application? = null
        fun getContext(): Context {
            return instance!!
        }

    }

}