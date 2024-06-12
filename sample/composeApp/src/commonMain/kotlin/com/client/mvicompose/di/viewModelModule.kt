package com.client.mvicompose.di

import com.client.mvicompose.MainViewModel
import org.koin.dsl.module

val viewModelModule = module {
    single { MainViewModel() }
}