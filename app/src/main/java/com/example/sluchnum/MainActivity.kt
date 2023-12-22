package com.example.sluchnum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun nextactivity(view: View){
        val randomIntent = Intent(this,SluchNum2:: class.java)
        startActivity(randomIntent)
    }
}