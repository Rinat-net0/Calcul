package com.example.calcul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calcul.databinding.ActivityCircleBinding

class CircleActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityCircleBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityCircleBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btCalcCircle.setOnClickListener {
            val pi = 3.14159
            val rad = bindingClass.edRadius.text.toString().toInt()
            val result = pi*rad*rad
            bindingClass.tResultCircle.text = "$result"
        }
    }
}