package com.example.languagelearningapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun progresbar(Progress:Float) {
    Column {
        LinearProgressIndicator(modifier=Modifier
            .fillMaxWidth()
            .size(20.dp),
            progress =Progress,
            color = Color.Green
        )
    }
}