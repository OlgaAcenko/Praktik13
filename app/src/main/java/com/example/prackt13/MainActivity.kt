package com.example.prackt13

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.sqrt
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextA = findViewById<EditText>(R.id.editTextTextA)
        val editTextB = findViewById<EditText>(R.id.editTextTextB)
        val buttonCalculate = findViewById<Button>(R.id.button)
        val textViewResult = findViewById<TextView>(R.id.textView)

        buttonCalculate.setOnClickListener {
            val a = editTextA.text.toString().toDoubleOrNull()
            val b = editTextB.text.toString().toDoubleOrNull()

            if (a != null && b != null) {
                val c = sqrt(a * a + b * b)
                val perimeter = a + b + c
                val area = 0.5 * a * b

                val result = """
                    Гипотенуза: %.2f
                    Периметр: %.2f
                    Площадь: %.2f
                """.trimIndent().format(c, perimeter, area)

                textViewResult.text = result
            } else {
                textViewResult.text = "Введите корректные значения катетов"
            }
        }

    }
}