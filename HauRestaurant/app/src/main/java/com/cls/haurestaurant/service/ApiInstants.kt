package com.cls.haurestaurant.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiInstants {
    var instants : ApiInstants?= null
    var retrofit :Retrofit ?=null

    init {
        val baseUrl : String = "baseurl";
        if(instants == null){
            instants = ApiInstants;
            retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}