package com.example.androiddesignpattern.adapter

import com.example.administrator.myview.LogUtil

class AudioPlay : MediaPlayer {
    private lateinit var mediaAdapter: MediaAdapter

    override fun play(playType: String, fileName: String) {
        if (playType.equals("Mp3")) {
            LogUtil.e("Mp3", "-----------------------")
        } else if (playType.equals("Mp4") || playType.equals("Vlc")) {
            mediaAdapter = MediaAdapter(playType)
            mediaAdapter.play(playType, fileName)
        } else {
            LogUtil.e("other", "-----------------------")
        }
    }

}