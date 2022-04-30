package com.example.myjobapplication;

import java.io.Serializable;

public class JobForm implements Serializable {
    String first_name;
    String last_name;
    String street_address;
    String street_address2;
    String city;
    String state;
    int zip_code;
    String country;
    String email;
    int area_code;
    int phone_num;
    String position;
    String start_date;

    public JobForm(String first_name, String last_name, String street_address, String street_address2, String city, String state, int zip_code,String country, String email, int area_code, int phone_num, String position, String start_date){
        this.first_name = first_name;
        this.last_name = last_name;
        this.street_address = street_address;
        this.street_address2 = street_address;
        this.city = city;
        this.state = state;
        this.zip_code = zip_code;
        this.country = country;
        this.email = email;
        this.area_code = area_code;
        this.phone_num = phone_num;
        this.position = position;
        this.start_date = start_date;

    }
    public JobForm(){

    }

}
