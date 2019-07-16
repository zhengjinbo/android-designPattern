package com.example.androiddesignpattern.proxy

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method


class DynamicProxy  constructor(private val obj: Any) : InvocationHandler {

    @Throws(Throwable::class)
    override fun invoke(proxy: Any, method: Method, args: Array<Any>): Any {
        return method.invoke(obj, *args)
    }
}