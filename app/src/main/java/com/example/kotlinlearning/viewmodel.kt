package com.example.kotlinlearning

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class viewmodel (val cnter:Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return observer(cnter) as T
    }
}