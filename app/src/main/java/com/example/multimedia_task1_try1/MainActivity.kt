package com.example.multimedia_task1_try1

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {
    private var onCreate = 0
    private var onStart = 1
    private var onResume = 2
    private var onPause = 3
    private var onRestart = 4
    private var onStop = 5
    private var onDestroy = 6
    private var onSave = 7
    private var onRestore = 8


    //Pongo el localDateTime como marca de agua.
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(LocalDateTime.now())
        println("onCreate $onCreate")
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        println(LocalDateTime.now())
        println("onSave $onSave")
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        println(LocalDateTime.now())
        println("onRestore $onRestore")
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onStart() {
        super.onStart()
        println(LocalDateTime.now())
        println("onStart $onStart")
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onResume() {
        super.onResume()
        println(LocalDateTime.now())
        println("onResume $onResume")
    }

/*    protected void onSaveInstanceState (Bundle outState)*/

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onPause() {
        super.onPause()
        println(LocalDateTime.now())
        println("onPause $onPause")
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onRestart() {
        super.onRestart()
        println(LocalDateTime.now())
        println("onRestart $onRestart")
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onStop() {
        super.onStop()
        println(LocalDateTime.now())
        println("onStop $onStop")
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onDestroy() {
        super.onDestroy()
        println(LocalDateTime.now())
        println("onDestroy $onDestroy")
    }
}