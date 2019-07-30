package com.example.androiddesignpattern.adapter

import com.example.administrator.myview.LogUtil

class VlcPlay : AdvancedMediaPlayer{
    override fun playMp4(fileName: String) {
    }

    override fun playVlc(fileName: String) {
        LogUtil.e("playVlc","---------------------")



    }

}