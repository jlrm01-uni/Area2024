package com.example.area2024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.doAfterTextChanged


class MainActivity : AppCompatActivity() {
    lateinit var widthWidget: EditText
    lateinit var heightWidget: EditText
    lateinit var resultsWidget: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        widthWidget = findViewById(R.id.widthEditText)
        heightWidget = findViewById(R.id.heightEditText)
        resultsWidget = findViewById(R.id.resultsTextView)

        widthWidget.doAfterTextChanged {
            calculate_area()
        }

        heightWidget.doAfterTextChanged {
            calculate_area()
        }
    }

    fun calculate_area() {
        val width = widthWidget.toString().toFloatOrNull()
        val height = heightWidget.toString().toFloatOrNull()

        if (width == null || height == null) {
            resultsWidget.text = "???"
            return
        }

        val area = width * height

        resultsWidget.text = area.toString()
    }
}