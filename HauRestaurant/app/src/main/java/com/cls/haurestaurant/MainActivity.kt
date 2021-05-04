package com.cls.haurestaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cls.haurestaurant.models.Product
import com.cls.haurestaurant.service.ApiInstants
import com.cls.haurestaurant.service.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ApiInstants.retrofit?.create(ApiService::class.java)?.getProductById(10)
        ?.enqueue(object: Callback<Product>{
            override fun onFailure(call: Call<Product>?, t: Throwable?) {
                TODO("Not yet implemented")
            }

            override fun onResponse(call: Call<Product>?, response: Response<Product>?) {
                TODO("Not yet implemented")
            }

        })
    }
}