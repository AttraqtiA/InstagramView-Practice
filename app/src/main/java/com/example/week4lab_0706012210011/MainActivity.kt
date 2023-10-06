package com.example.week4lab_0706012210011

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.week4lab_0706012210011.data.DataSource
import com.example.week4lab_0706012210011.ui.theme.Week4Lab_0706012210011Theme
import com.example.week4lab_0706012210011.ui.theme.view.InstagramView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Week4Lab_0706012210011Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    InstagramView(DataSource().loadStory(), DataSource().loadFeed(), DataSource().loadSuggestion())
                }
            }
        }
    }
}


