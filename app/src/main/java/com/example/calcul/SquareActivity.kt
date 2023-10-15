package com.example.calcul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calcul.databinding.ActivitySquareBinding

class SquareActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivitySquareBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivitySquareBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btCalcSquare.setOnClickListener {
            val ed = bindingClass.edTextA.text.toString().toInt()
            val result = ed * ed
            bindingClass.tResultSquare.text = "$result"
        }
    }
}