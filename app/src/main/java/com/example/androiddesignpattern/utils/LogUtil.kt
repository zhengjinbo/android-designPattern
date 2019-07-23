package com.example.administrator.myview

import android.util.Log
import com.example.androiddesignpattern.BuildConfig


class LogUtil {

    companion object {

        var isDebug = BuildConfig.DEBUG
        private val TAG = "LogUtil"


        // 下面是传入自定义tag的函数
        fun i(tag: String = TAG, msg: String) {
            if (isDebug)
                Log.i(tag, msg)
        }

        fun d(tag: String = TAG, msg: String) {
            if (isDebug)
                Log.d(tag, msg)
        }

        fun e(tag: String = TAG, msg: String) {
            if (isDebug)
                Log.e(tag, msg)
        }

        fun v(tag: String = TAG, msg: String) {
            if (isDebug)
                Log.i(tag, msg)
        }
    }

}
