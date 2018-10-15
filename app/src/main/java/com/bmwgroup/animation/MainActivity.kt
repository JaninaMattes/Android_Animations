package com.bmwgroup.animation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    //fade method is called by view
    fun fadeMicky(view: View) {
        val micky = findViewById<ImageView>(R.id.micky)
        val mini = findViewById<ImageView>(R.id.mini)
        micky.animate().alpha(0f).duration = 2000
        mini.animate().alpha(1f).duration = 2000
    }

    //fade method is called by view
    fun fadeMini(view: View) {
        val micky = findViewById<ImageView>(R.id.micky)
        val mini = findViewById<ImageView>(R.id.mini)
        mini.animate().alpha(0f).duration = 2000
        micky.animate().alpha(1f).duration = 2000
    }

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgMicky = findViewById<ImageView>(R.id.micky)
        imgMicky.setOnClickListener {
            fadeMicky(it)
        }

        val imgMini = findViewById<ImageView>(R.id.mini)
        imgMini.setOnClickListener {
            fadeMini(it)
        }
    }
}
