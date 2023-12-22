package com.example.sluchnum

import android.os.Bundle
import android.widget.TextView
import kotlin.random.Random
import androidx.appcompat.app.AppCompatActivity

class SluchNum2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_s2)
        val random = Random.nextInt(0,1000)
        val randomInt = Random.nextInt(0,random)
        val textViewRandom : TextView = findViewById(R.id.textView_random2)
        val textViewLabel : TextView = findViewById(R.id.textView_label)

        textViewRandom.text= randomInt.toString()
        textViewLabel.text= getString(R.string.textRandom2,random)
    }
}