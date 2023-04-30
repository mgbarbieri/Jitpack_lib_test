package com.example.myapplicationlibtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lib_teste.Libteste

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lt = Libteste(this)
        lt.getMedia()
    }
}