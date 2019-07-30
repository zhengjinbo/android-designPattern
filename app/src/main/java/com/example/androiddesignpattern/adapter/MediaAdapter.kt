package com.example.androiddesignpattern.adapter

class MediaAdapter(val audioPlay:String) :MediaPlayer{
    private lateinit var  advancedMediaPlayer :AdvancedMediaPlayer
    init {
        if (audioPlay.equals("Mp4")){
           advancedMediaPlayer= Mp4Play()
        }else if (audioPlay.equals("Vlc")){
            advancedMediaPlayer= VlcPlay()
        }
    }


    override fun play(playType: String, fileName: String) {
        if (audioPlay.equals("Mp4")){
            advancedMediaPlayer.playMp4(fileName)
        }else if (audioPlay.equals("Vlc")){
            advancedMediaPlayer.playVlc(fileName)
        }
    }

}