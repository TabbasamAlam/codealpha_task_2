package com.example.languagelearningapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ScorllableImageFunction(              //This is the function which take image and make it scrollabel
    vararg imageResIds: Int
) {
    var maxImage = imageResIds.take(13)
    var zoomScale by remember { mutableStateOf(1.0f) }
    var offset by remember { mutableStateOf(Offset(0f, 0f)) }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .pointerInput(Unit) {
                detectTransformGestures { _, pan, zoom, _ ->
                    zoomScale *= zoom
                    offset = if (zoomScale > 1.0f) {
                        Offset(offset.x + pan.x * zoom, offset.y + pan.y * zoom)
                    } else {
                        Offset(0f, 0f)
                    }
                }
            }
    )
    {

        items(maxImage) { imageResIds ->
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .border(2.dp, Color.Gray, shape = MaterialTheme.shapes.small)
            )
            {
                Image(
                    painter = painterResource(id = imageResIds),
                    contentDescription = null,
                    modifier = Modifier
                        .graphicsLayer(
                            scaleX = zoomScale,
                            scaleY = zoomScale,
                            translationX = offset.x,
                            translationY = offset.y
                        )
                        .fillMaxSize()
                )
            } 
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}