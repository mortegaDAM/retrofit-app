package com.example.retrofip_app.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofip_app.data.model.Product
import com.example.retrofip_app.data.repository.ProductRepository
import kotlinx.coroutines.launch
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


class ProductViewModel : ViewModel() {

    private val repository = ProductRepository()

    var products by mutableStateOf<List<Product>>(emptyList())
        private set

    var isLoading by mutableStateOf(true)
        private set

    var error by mutableStateOf<String?>(null)
        private set

    init {
        loadProducts()
    }

    private fun loadProducts() {
        viewModelScope.launch {
            try {
                products = repository.getProducts()
            } catch (e: Exception) {
                error = "Error al cargar productos"
            } finally {
                isLoading = false
            }
        }
    }
}