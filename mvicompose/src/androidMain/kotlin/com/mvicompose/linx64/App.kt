package com.mvicompose.linx64

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mvicompose.linx64.ui.theme.AppTheme

@Composable
internal fun App() {
    AppTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .windowInsetsPadding(WindowInsets.safeDrawing)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            MainScreen(onNavigateToSettings = {
                // TODO: Navigate to settings
            })
        }
    }
}

@Composable
private fun MainScreen(
    onNavigateToSettings: () -> Unit,
) {
    Column {
        Text("Hello, world!")
    }
}


