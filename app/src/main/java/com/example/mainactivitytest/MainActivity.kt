package com.example.testapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    internal var btn_Zouj: Button
    internal var btn_Fard: Button
    internal var m: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btn_Fard = findViewById(R.id.btn_Fard)
        btn_Zouj = findViewById(R.id.btn_Zouj)

        btn_Zouj.visibility = View.GONE
        btn_Fard.visibility = View.GONE
        val f = adadd(m)


        if (f == 0) {
            btn_Zouj.visibility = View.VISIBLE
        } else {
            btn_Fard.visibility = View.VISIBLE
        }


    }

    fun adadd(x: Int): Int {
        return if (x % 2 == 0) {
            0
        } else {
            1
        }
    }

}

