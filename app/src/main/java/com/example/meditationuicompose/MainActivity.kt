package com.example.meditationuicompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import com.example.meditationuicompose.ui.HomeScreen
import com.example.meditationuicompose.ui.theme.MeditationUiComposeTheme

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUiComposeTheme {
              HomeScreen()
            }
        }
    }
}

