package com.example.emil.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        setListeners()
    }

    private fun setListeners() {
        val clickableView: List<View> = listOf(box_one_text, 
            box_two_text, box_three_text, box_four_text, box_five_text,
            constraint_layout, green_button, red_button, yellow_button)
        
        for (item in clickableView) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(inputView: View) {
        when(inputView.id) {
//        Boxes using color class colors for background
            R.id.box_one_text -> inputView.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> inputView.setBackgroundColor(Color.GRAY)

//        Boxes using Android color resources for background
            R.id.box_three_text -> inputView.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> inputView.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> inputView.setBackgroundResource(android.R.color.holo_green_light)

            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)

            else -> inputView.setBackgroundColor(Color.LTGRAY)
        }
    }
}