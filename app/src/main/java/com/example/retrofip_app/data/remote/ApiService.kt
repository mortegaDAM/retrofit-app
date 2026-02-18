package com.example.retrofip_app.data.remote

import com.example.retrofip_app.data.model.ProductResponse
import retrofit2.http.GET

interface ApiService {

    @GET("api/products")
    suspend fun getProducts(): ProductResponse
}