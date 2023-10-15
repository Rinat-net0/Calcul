package com.example.calcul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.calcul.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }

    fun onClickCircle (view: View){
        val open = Intent(this, CircleActivity :: class.java)
        startActivity(open)
    }

    fun onClickSquare (view: View){
        val open = Intent(this, SquareActivity ::class.java)
        startActivity(open)
    }

    fun onClickRectangle (view: View){
        val open = Intent(this, RectangleActivity ::class.java)
        startActivity(open)
    }

}