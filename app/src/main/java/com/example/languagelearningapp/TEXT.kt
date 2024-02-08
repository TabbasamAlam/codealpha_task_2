package com.example.languagelearningapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun definationandExample(defination:String) {
     Box (contentAlignment = Alignment.Center){
         Text(text = defination,
             modifier = Modifier
                 .fillMaxWidth()
                 .padding(horizontal = 10.dp),
                fontSize = 25.sp,
                fontWeight = FontWeight.Normal,
             color = Color.Black)
     }
}

@Composable
fun headingOrstructureFormula(head: String) {
    Box(contentAlignment = Alignment.Center) {
        Text(
            text = head,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Magenta,
            lineHeight = 40.sp
        )
    }
}

@Composable
fun fourSentences(forWhat:String,formula:String) {
    Box (contentAlignment = Alignment.Center){
        Column {

            Box()
            {
                Text(
                    text = forWhat,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 70.dp),
                    fontSize = 15.sp,
                    color = Color.Black
                )

                Text(
                    text = formula,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp),
                    lineHeight = 30.sp,
                    color = Color.Green
                )
            }
        }
    }
}

@Composable
fun important(importantpoint:String) {
    Card(
        border = BorderStroke(width = 5.dp,Color.Red)
    ) {
        Text(
            text = importantpoint,
            modifier= Modifier
                .fillMaxWidth()
                .padding(start = 10.dp)
                .background(Color.Cyan),
            fontSize = 28.sp,
            fontWeight = FontWeight.SemiBold,
            fontStyle = FontStyle.Italic
        )
    }
}

@Composable
fun moreDetails(string:String) {
    Text(
        text = string,
        modifier=Modifier
            .clickable {  },
        fontSize = 15.sp,
        color=Color.Blue,
        lineHeight = 40.sp
    )
}