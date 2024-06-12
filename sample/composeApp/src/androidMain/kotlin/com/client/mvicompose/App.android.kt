package com.client.mvicompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.client.mvicompose.di.viewModelModule
import org.koin.core.context.startKoin

class AppActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startKoin {
            modules(viewModelModule)
        }

        enableEdgeToEdge()

        setContent { App() }
    }
}
