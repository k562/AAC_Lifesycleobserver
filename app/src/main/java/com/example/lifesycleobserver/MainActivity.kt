package com.example.lifesycleobserver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(observer())
        Log.d("MAIN","Activity-oncreate")

    }

    override fun onStart() {
        super.onStart()
        Log.d("MAIN","Activity-onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("MAIN","Activity-onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MAIN","Activity-onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("MAIN","Activity-onStop")
    }

}