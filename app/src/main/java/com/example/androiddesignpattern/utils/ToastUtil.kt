package com.example.androiddesignpattern.utils

import android.widget.Toast
import android.widget.Toast.makeText
import com.example.androiddesignpattern.MyApplication

class ToastUtil {

    companion object {
        fun toast(str: String?, length: Int=Toast.LENGTH_SHORT) = makeText(MyApplication.getContext(), str, length).show()
    }
}