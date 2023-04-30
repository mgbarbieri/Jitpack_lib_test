package com.example.lib_teste

import android.content.Context
import com.millicast.Media

class Libteste (private val context: Context) {
    private var media: Media? = null

    fun teste(): Boolean {
        if (media == null) {
            media = Media.getInstance(context)
            return true
        }
        return false
    }
}