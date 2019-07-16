package com.example.androiddesignpattern.proxy

import android.util.Log

class ZhangSan:ILawsuit{
    override fun submit() {
        Log.e("submit","老板拖欠工资，特此申请劳动仲裁")
    }

    override fun burden() {
        Log.e("burden","这是劳动合同和过去一年的工资流水")
    }

    override fun defend() {
        Log.e("defend","证据确凿，无需多说什么")
    }

    override fun finish() {
        Log.e("finish","诉讼成功，结算工资")

    }

}