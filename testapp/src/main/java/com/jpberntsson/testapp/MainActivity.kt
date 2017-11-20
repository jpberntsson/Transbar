package com.jpberntsson.testapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import com.jpberntsson.windowfitter.transparentStatusBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        transparentStatusBar(window)
        setContentView(R.layout.activity_main)
        val image = findViewById<ImageView>(R.id.image)
        image.setOnClickListener({
            Log.d("test", "hej");
            transparentStatusBar(window)
        })
    }




}
