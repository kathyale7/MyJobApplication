package com.example.myjobapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MenuJobApp : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_job_app)

        val tvusername = findViewById<TextView>(R.id.textInputEditText)
        val slast_name = findViewById<TextView>(R.id.editText)
        val sstreet_address = findViewById<TextView>(R.id.editText2)
        val sstreet_address2 = findViewById<TextView>(R.id.editText3)
        val scity = findViewById<TextView>(R.id.editText4)
        val sstate  = findViewById<TextView>(R.id.editText5)
        val szip_code = findViewById<TextView>(R.id.editText6)
        val scountry  = findViewById<TextView>(R.id.editText7)
        val semail  = findViewById<TextView>(R.id.editText8)
        val sarea_code  = findViewById<TextView>(R.id.editText9)
        val sphone_num  = findViewById<TextView>(R.id.editText10)
        val sposition   = findViewById<TextView>(R.id.editText11)
        val sstart_date   = findViewById<TextView>(R.id.editText12)


        val back = findViewById<Button>(R.id.button2)




        val form = intent.getSerializableExtra("JobForm") as JobFosrm?

        if (form != null) {
            tvusername.text = "${form.first_name}"
            slast_name.text = "${form.last_name}"
            sstreet_address.text = "${form.street_address}"
            sstreet_address2.text = "${form.street_address2}"
            scity.text = "${form.city}"
            sstate.text = "${form.state}"
            szip_code.text = "${form.zip_code}"
            scountry.text = "${form.country}"
            semail.text = "${form.email}"
            sarea_code.text = "${form.area_code}"
            sphone_num.text = "${form.phone_num}"
            sposition.text = "${form.position}"
            sstart_date.text = "${form.start_date}"
        }


        back.setOnClickListener{
            val intent = Intent (this, Login::class.java)
            startActivity(intent)
        }
    }
    }
