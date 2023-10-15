package com.example.calcul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calcul.databinding.ActivityRectangleBinding

class RectangleActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityRectangleBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        var bindingClass = ActivityRectangleBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btCalcRectangle.setOnClickListener {
            var A = bindingClass.edA.text.toString().toInt()
            var B = bindingClass.edB.text.toString().toInt()
            var result = A*B
            bindingClass.tResultRectan.text = "$result"
        }
   }
}