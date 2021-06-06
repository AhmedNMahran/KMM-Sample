package com.ahmednmahran.vfkmm.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ahmednmahran.vfkmm.Greeting
import android.widget.TextView
import com.ahmednmahran.vfkmm.Data

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val usernames = Data().getUserNames()
        val tv: TextView = findViewById(R.id.text_view)
        tv.text = "${greet()}\n ${usernames.joinToString(separator = "\n")}"
    }
}
