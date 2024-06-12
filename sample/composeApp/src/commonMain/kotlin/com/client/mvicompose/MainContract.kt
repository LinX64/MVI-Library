package com.client.mvicompose

sealed interface MainViewEvent {
    data object OnLoadRates : MainViewEvent
}

sealed interface MainNavigationEffect {
    data object NavigateToSettings : MainNavigationEffect
}

sealed interface MainState {
    data object Loading : MainState
    data class Success(val text: String) : MainState
    data class Error(val message: String) : MainState
}
