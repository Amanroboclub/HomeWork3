package com.rajaman.homework3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mail = findViewById<EditText>(R.id.mainMailEditText)
        val btn = findViewById<Button>(R.id.mainVerifybutton)

        btn.setOnClickListener {
            var counterE = 0
            var counterI = 0
            var com = mail.text.takeLast(3)
            val email = mail.text.toString()
            for(i in (email)){
                if((i=='.')){
                    counterI +=1
                }
                if ((i == '@')){
                counterE +=1
            }}

            if( (counterI >= 1) and (counterE >=1) and (com == "com")){
            Toast.makeText(this,"Valid Mail",Toast.LENGTH_LONG).show()
        }else{
                Toast.makeText(this,"Invalid mail",Toast.LENGTH_LONG).show()
            }
        }
    }
}