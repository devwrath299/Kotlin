package com.example.kotlinlearning

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ViewModel

class observer(var cnts:Int) : ViewModel() {
    var cnt=cnts
    fun Inc(){
        cnt++;
    }
}