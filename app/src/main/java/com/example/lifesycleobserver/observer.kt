package com.example.lifesycleobserver

import android.media.metrics.Event
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class observer : LifecycleObserver {


     @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
     fun onCreate(){
         Log.d("Main","Observer-oncreate")
     }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause(){
        Log.d("Main","Observer-onPause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume(){
        Log.d("Main","Observer-onResume")

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop(){
        Log.d("Main","Observer-onStop")
    }
}