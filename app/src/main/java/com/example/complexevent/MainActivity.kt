package com.example.complexevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val checkBox = findViewById<CheckBox>(R.id.check_box)
        val progression = findViewById<ProgressBar>(R.id.progress_bar)
        val textView = findViewById<TextView>(R.id.view_text)
        val textEdit = findViewById<EditText>(R.id.edit_text)

        findViewById<Button>(R.id.subbmit).setOnClickListener {
            if (checkBox.isChecked) {
                textView.text = textEdit.text

                progression.progress += 10
            }
        }
    }
}