package com.example.retrofip_app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.isSystemInDarkTheme

private val LightColors = lightColorScheme(
    primary = PrimaryColor,
    onPrimary = OnPrimary,
    secondary = SecondaryColor,
    onSecondary = OnSecondary,
    background = BackgroundColor,
    onBackground = OnBackground,
    surface = SurfaceColor,
    onSurface = OnSurface,
    error = ErrorColor
)

private val DarkColors = darkColorScheme(
    primary = PrimaryVariant,
    onPrimary = OnPrimary,
    secondary = SecondaryColor,
    onSecondary = OnSecondary,
    background = Color(0xFF121212),
    onBackground = OnBackground,
    surface = Color(0xFF1E1E1E),
    onSurface = OnSurface,
    error = ErrorColor
)

@Composable
fun RetrofipAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colors,
        typography = AppTypography,
        shapes = AppShapes,
        content = content
    )
}
