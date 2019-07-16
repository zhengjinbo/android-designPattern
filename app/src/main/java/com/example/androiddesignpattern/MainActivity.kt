package com.example.androiddesignpattern

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.androiddesignpattern.observer.AndroidDevObserver
import com.example.androiddesignpattern.observer.JavaDevObserver
import com.example.androiddesignpattern.observer.PythonDevObserver
import com.example.androiddesignpattern.observer.Subject
import com.example.androiddesignpattern.proxy.*
import com.example.androiddesignpattern.utils.ToastUtil
import java.lang.reflect.Proxy

@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btn_observerPattern: Button
    private lateinit var btn_proxy: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()
    }

    private fun initUI() {
        btn_observerPattern = findViewById<Button>(R.id.btn_observerPattern)
        btn_observerPattern.setOnClickListener(this)
        btn_proxy = findViewById<Button>(R.id.btn_proxy)
        btn_proxy.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            this.btn_observerPattern -> {
                ToastUtil.toast("观察者模式")
                val subject = Subject()
                AndroidDevObserver(subject)
                PythonDevObserver(subject)
                JavaDevObserver(subject)
                subject.setState("今晚发布新版本！")
            }
            this.btn_proxy -> {
                ToastUtil.toast("代理模式")
                //                //静态代理
                //                val lawyer: Lawyer = Lawyer(ZhangSan())
                //                lawyer.submit()
                //                lawyer.burden()
                //                lawyer.defend()
                //                lawyer.finish()

                //动态代理
                var zhangSan:ZhangSan = ZhangSan()
                var dynamicProxy: DynProxy = DynProxy(zhangSan)
                val classLoader = zhangSan.javaClass.classLoader
                val Class = arrayOf(ILawsuit::class)
                //动态代理了一个律师
                val lawyer: ILawsuit = Proxy.newProxyInstance(classLoader, arrayOf<Class<*>>(ILawsuit::class.java), dynamicProxy) as ILawsuit
                lawyer.submit()
                lawyer.burden()
                lawyer.defend()
                lawyer.finish()
            }
        }
    }


}


