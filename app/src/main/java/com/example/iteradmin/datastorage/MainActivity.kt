package com.example.iteradmin.datastorage

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.input)
        val add = findViewById<Button>(R.id.add)

        val sp:SharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE)
        val editor:SharedPreferences.Editor = sp.edit()
        editor.putString("name", "Rabbit")
        editor.commit()

        add.setOnClickListener{
            startActivity(Intent(this, Main2Activity::class.java))
        }
    }
}
