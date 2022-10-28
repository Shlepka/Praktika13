package com.example.praktika13

import android.os.Bundle
import android.text.TextUtils.isEmpty
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnClick(view: View) {
        val dolText: EditText = findViewById(R.id.textdol)
        val sumText: EditText = findViewById(R.id.textsum)
        var resultText: TextView = findViewById(R.id.result)
        val doll:Int = dolText.text.toString().toInt()
        val rub = sumText.text.toString().toInt()



        if(isEmpty(dolText.toString()) && isEmpty(sumText.toString())){

            val toast = Toast.makeText(this, "Заполните поля", Toast.LENGTH_LONG)
            toast.show()
        }

            val result = doll * rub
             resultText.text = "Результат : $result рублей"




    }

}