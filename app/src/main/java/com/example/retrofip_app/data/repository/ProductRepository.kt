package com.example.retrofip_app.data.repository

import com.example.retrofip_app.data.model.Product
import com.example.retrofip_app.data.remote.RetrofitInstance

class ProductRepository {

    suspend fun getProducts(): List<Product> {
        return RetrofitInstance.api.getProducts().results
    }
}