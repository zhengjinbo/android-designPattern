package com.example.androiddesignpattern.adapter

import com.example.administrator.myview.LogUtil

class Mp4Play : AdvancedMediaPlayer{
    override fun playMp4(fileName: String) {
        LogUtil.e("playMp4","---------------------")
    }

    override fun playVlc(fileName: String) {
    }

}