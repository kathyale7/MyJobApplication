package com.example.myjobapplication

import java.io.Serializable
import java.util.Date

data class JobFosrm (val first_name: String,
                    val last_name: String,
                    val street_address: String,
                    val street_address2: String,
                    val city: String,
                    val state: String,
                    val zip_code: Int,
                    val country: String,
                    val email: String,
                    val area_code: String,
                    val phone_num: String,
                    val position: String,
                    val start_date: String) : Serializable
