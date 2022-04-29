package com.example.myjobapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class Login : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val username = findViewById<EditText>(R.id.etuser)
        val password = findViewById<EditText>(R.id.etpassword)
        val enviar = findViewById<Button>(R.id.btnLogin)



        enviar.setOnClickListener {
            val intent = Intent(this, MenuJobApp::class.java)


            intent.putExtra("user", username.text)
            intent.putExtra("password", password.text)
            startActivity(intent)
        }





    }
}