package com.mkrdeveloper.datepickerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datePicker = findViewById<DatePicker>(R.id.datePicker)
        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)


        button.setOnClickListener {
            val year = datePicker.year
            val month = datePicker.month
            val day = datePicker.dayOfMonth

            textView.text = "date is: $year/$month/$day"

        }

        datePicker.setOnDateChangedListener { view, year, monthOfYear, dayOfMonth ->

            textView.text = "date changed to: $year/$monthOfYear/$dayOfMonth"
        }
    }
}