package com.example.lib_teste

import android.content.Context
import com.millicast.Media

class Libteste (private val context: Context) {
    private var media: Media? = null

    fun getMedia(): Media? {
        if (media == null) {
            media = Media.getInstance(context)
        }
        return media
    }
}