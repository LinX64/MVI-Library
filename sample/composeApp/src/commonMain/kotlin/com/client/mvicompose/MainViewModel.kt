package com.client.mvicompose

import com.mvicompose.linx64.ui.MviViewModel

class MainViewModel : MviViewModel<MainViewEvent, MainState, MainNavigationEffect>(MainState.Loading) {

    // TODO: Implement the ViewModel
    override fun handleEvent(event: MainViewEvent) {
        when(event) {
            MainViewEvent.OnLoadRates -> setState { MainState.Loading }
        }
    }
}