package com.davidodari.simplecounter

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        simpleCounter.setListener { value ->
//            Toast.makeText(this,"$value",Toast.LENGTH_SHORT).show()
//        }

    }
}
