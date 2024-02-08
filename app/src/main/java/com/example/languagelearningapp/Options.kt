package com.example.languagelearningapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource as painterResource

@Composable
fun Option() {
    var futherOption1 by remember { mutableStateOf(false) }//These three var for move to next screen
    var futherOption2 by remember { mutableStateOf(false) }
    var futherOption3 by remember { mutableStateOf(false) }
    var back by remember { mutableStateOf(false) }//This var is for back button


    if (futherOption1 == true) {
        Tenses()
    } else if (futherOption2 == true) {
        PartofSpeech()
    } else if (futherOption3 == true) {
        imageOfVerbs()
    } else if (back == true) {
        LearningApp()
    } else {
        Column(
            verticalArrangement = Arrangement.Top,
            modifier = Modifier.background(Color.DarkGray)
        ) {
            backButton (onClick = {back=true})//form back button
            Spacer(modifier = Modifier.padding(90.dp))
            Column(modifier = Modifier.padding(start = 70.dp))
            {
                stylesButtton(string = "Tenses", onClick1 = {futherOption1=true})
                stylesButtton(string = "Parts of Speech", onClick1 = {futherOption2=true})
                stylesButtton(string = "Forms of Verb", onClick1 = {futherOption3=true})
            }
        }
    }
}

@Composable
fun imageOfVerbs() {
    var back by remember { mutableStateOf(false) }

    if (back == true) {
        Option()
    } else {
        Column {
            backButton (onClick = {back=true})//form back button
            Spacer(modifier = Modifier.padding(12.dp))
            ScorllableImageFunction(
                R.drawable.verb1,
                R.drawable.verb2,
                R.drawable.verb3,
                R.drawable.verb4,
                R.drawable.verb5,
                R.drawable.verb6,
                R.drawable.verb7,
                R.drawable.verb8,
                R.drawable.verb9,
                R.drawable.verb10,
                R.drawable.verb11,
                R.drawable.verb12,
            )
        }
    }
}