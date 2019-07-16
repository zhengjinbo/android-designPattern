package com.example.androiddesignpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynProxy implements InvocationHandler {

    private final Object o;

  public DynProxy(Object o){
        this.o=o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(o,args);
    }
}
