package com.example.androiddesignpattern

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.androiddesignpattern.observer.AndroidDevObserver
import com.example.androiddesignpattern.observer.JavaDevObserver
import com.example.androiddesignpattern.observer.PythonDevObserver
import com.example.androiddesignpattern.observer.Subject
import com.example.androiddesignpattern.utils.ToastUtil

@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btn_observerPattern: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()
    }

    private fun initUI() {
        btn_observerPattern = findViewById<Button>(R.id.btn_observerPattern)
        btn_observerPattern.setOnClickListener(this)
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
        }
    }

}