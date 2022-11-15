package com.example.multimedia_task1_try1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var onCreate = 0
    private var onStart = 1
    private var onResume = 2
    private var onPause = 3
    private var onRestart = 4
    private var onStop = 5
    private var onDestroy = 6

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate $onCreate")

        var mTextView = TextView (this);

        if (savedInstanceState == null) {
            mTextView.setText("Welcome to HelloAndroid!");
        } else {
            mTextView.setText("Welcome back.");
        }

        setContentView(mTextView);
    }

    override fun onStart() {
        super.onStart()
        println("onStart $onStart")
    }

    override fun onResume () {
        super.onResume()
        println("onResume $onResume")
    }

    override fun onPause () {
        super.onPause()
        println("onPause $onPause")
    }

    override fun onRestart () {
        super.onRestart()
        println("onRestart $onRestart")
    }

    override fun onStop () {
        super.onStop()
        println("onStop $onStop")
    }

    override fun onDestroy () {
        super.onDestroy()
        println("onDestroy $onDestroy")
    }
}