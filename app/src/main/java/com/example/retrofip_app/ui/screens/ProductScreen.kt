package com.example.retrofip_app.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.retrofip_app.viewmodel.ProductViewModel
import com.example.retrofip_app.ui.components.ProductItem

@Composable
fun ProductScreen(viewModel: ProductViewModel) {

    when {
        viewModel.isLoading -> {
            Box(Modifier.fillMaxSize(), contentAlignment = androidx.compose.ui.Alignment.Center) {
                CircularProgressIndicator()
            }
        }

        viewModel.error != null -> {
            Text("Error: ${viewModel.error}")
        }

        else -> {
            LazyColumn {
                items(viewModel.products) { product ->
                    ProductItem(
                        name = product.name,
                        description = product.description,
                        price = product.price,
                        image = product.image
                    )
                }
            }
        }
    }
}
