package com.dp.loadfile

import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import java.io.*
import java.net.URL
import kotlin.concurrent.thread

class MyClass : ViewModel() {

   // var text = "Coroutin"

    fun run(textView: TextView, url: String?) {
        val ff = viewModelScope.launch (Dispatchers.IO){

            return@launch
        }
    }

    suspend fun run2(){

        println("Coroutin")
    }
}