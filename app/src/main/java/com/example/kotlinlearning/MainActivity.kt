package com.example.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var observers: observer
    lateinit var textcnter:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        observers=ViewModelProvider(this,viewmodel(10)).get(observer::class.java)
        textcnter=findViewById(R.id.txt)
        setText()
    }

    fun setText()
    {
        textcnter.text=observers.cnt.toString()
    }
    fun Inc(v : View)
    {
        observers.Inc()
        setText()
    }


}