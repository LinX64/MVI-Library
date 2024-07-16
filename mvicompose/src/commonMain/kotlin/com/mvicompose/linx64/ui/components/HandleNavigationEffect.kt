package com.mvicompose.linx64.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.mvicompose.linx64.ui.MviViewModel
import kotlinx.coroutines.flow.onEach

@Composable
fun <Effect> HandleNavigationEffect(
    viewModel: MviViewModel<*, *, Effect>,
    onEffect: (Effect) -> Unit
) {
    LaunchedEffect(key1 = viewModel) {
        viewModel.effect.onEach { effect ->
            onEffect(effect)
        }.collect {}
    }
}
