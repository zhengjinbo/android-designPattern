package com.example.androiddesignpattern.proxy

//诉讼
interface ILawsuit {
    fun submit()  //提交申请
    fun burden()  //进行举证
    fun defend()  //开始辩护
    fun finish() //诉讼完成
}