package com.example.retrofip_app


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.retrofip_app.ui.screens.ProductScreen
import com.example.retrofip_app.ui.theme.RetrofipAppTheme
import com.example.retrofip_app.viewmodel.ProductViewModel



class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            RetrofipAppTheme() {
                val viewModel: ProductViewModel = viewModel()
                ProductScreen(viewModel)
            }
        }
    }
}
