package com.cls.haurestaurant.service

import com.cls.haurestaurant.models.Product
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("api/product?")
    fun getProductById(@Query("id") id: Int): Call<Product>
}