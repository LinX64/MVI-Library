package com.client.mvicompose

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
import com.client.mvicompose.theme.AppTheme
import org.koin.compose.KoinContext
import ui.components.ComposeScreen

@Composable
internal fun App() {
    KoinContext {
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
}

@Composable
private fun MainScreen(
    onNavigateToSettings: () -> Unit,
    mainViewModel: MainViewModel = koinViewModel<MainViewModel>()
) {
    Column {
        Text("Hello, world!")
    }

    ComposeScreen(
        viewModel = mainViewModel,
        onEffect = { effect ->
            when (effect) {
                MainNavigationEffect.NavigateToSettings -> onNavigateToSettings()
            }
        }
    ) { state ->
        // Your UI that uses the state
        // Example: Text(text = state.someProperty)
    }
}


