package com.example.myjobapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class Login : AppCompatActivity() {

lateinit var editTExt: EditText
    lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


///
        val username = findViewById<EditText>(R.id.etuser)
        val password = findViewById<EditText>(R.id.etpassword)
        val enviar = findViewById<Button>(R.id.btnLogin)



        enviar.setOnClickListener {
            val intent = Intent(this, MenuJobApp::class.java)
            val jobForm = JobFosrm ("Maria", "Solis", "2461 Forest Avenue", " ", "New York", "NY", 10011, "United States", "maria.solis@gmai.com", "917", "886-3046", "Product Manager", "04-02-2021")


            intent.putExtra("JobForm", jobForm)

            startActivity(intent)
        }





    }
}