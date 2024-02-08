package com.example.languagelearningapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Tenses() {
    var back by rememberSaveable { mutableStateOf(false) }//This var is for back button

    var presentTenseType by rememberSaveable{ mutableStateOf(false) }
    var pastTenseType by rememberSaveable { mutableStateOf(false) }
    var futureTenseType by rememberSaveable { mutableStateOf(false) }
    var moveToQuiz by rememberSaveable { mutableStateOf(false) }

    if (presentTenseType == true) {
        TypesOfPresentTenses()
    } else if (pastTenseType == true) {
        TypesOfPastTenses()
    } else if (futureTenseType == true) {
        TypesOfFutureTenses()
    } else if (moveToQuiz == true) {
          quiz1()
    }
    else if (back==true)
    {
        Option()
    }
    else {
        Column(verticalArrangement = Arrangement.Top,
            modifier = Modifier.background(Color.Cyan))
        {

           backButton (onClick = {back=true})
            Spacer(modifier = Modifier.padding(90.dp))
            Column(modifier = Modifier.padding(start = 70.dp))
            {
                stylesButtton(string = "Present Tense", onClick1 = {presentTenseType=true})
                stylesButtton(string = "Past Tense", onClick1 = {pastTenseType=true})
                stylesButtton(string = "Future Tense", onClick1= {futureTenseType=true})
                stylesButtton(string = "Quiz", onClick1= {moveToQuiz=true})
            }
        }
    }
}

@Composable
fun PartofSpeech() {
    var back by remember { mutableStateOf(false) }//This var is for back button

    var moveToNoun by remember { mutableStateOf(false) }
    var moveToPronoun by remember { mutableStateOf(false) }
    var moveToVerb by remember { mutableStateOf(false) }
    var movetoAdjective by remember { mutableStateOf(false) }
    var moveToAdverb by remember { mutableStateOf(false) }
    var moveToPreposition by remember { mutableStateOf(false) }
    var moveToConjection by remember { mutableStateOf(false) }
    var moveToInterjection by remember { mutableStateOf(false) }

    var moveToQuiz by rememberSaveable { mutableStateOf(false) }


    if (back == true) {
        Option()
    }
    else if (moveToNoun==true)
    {
        Noun()
    }
    else if (moveToPronoun==true)
    {
        Pronoun()
    }
    else if (moveToVerb==true)
    {
        Verb()
    }
    else if (moveToPreposition==true)
    {
        Preposition()
    }
    else if (movetoAdjective==true)
    {
        Adjective()
    }
    else if (moveToAdverb==true)
    {
        Adverb()
    }
    else if (moveToConjection==true)
    {
        Conjection()
    }
    else if (moveToInterjection==true)
    {
        Interjection()
    }
    else if (moveToQuiz == true) {
        quiz2()
    }
    else {
        Column(
            verticalArrangement = Arrangement.Top,
            modifier = Modifier.background(Color.Gray)
        ) {
            backButton (onClick = {back=true})//form back button
            Spacer(modifier = Modifier.padding(10.dp))
            LazyColumn(modifier = Modifier.padding(start = 100.dp))
            {
                item {
                    stylesButtton(string = "Noun ", onClick1 = {moveToNoun=true})
                    stylesButtton(string = "Pronoun ", onClick1 = {moveToPronoun=true})
                    stylesButtton(string = "Verb ", onClick1 = {moveToVerb=true})
                    stylesButtton(string = "Adjective ", onClick1 = {movetoAdjective=true})
                    stylesButtton(string = "Adverb ", onClick1 = {moveToAdverb=true})
                    stylesButtton(string = "Preposition ", onClick1 = {moveToPreposition=true})
                    stylesButtton(string = "Conjection ", onClick1 = {moveToConjection=true})
                    stylesButtton(string = "Interjection ", onClick1 = {moveToInterjection=true})
                    stylesButtton(string = "Quiz", onClick1= {moveToQuiz=true})
                }
            }
        }
    }
}

@Composable
fun TypesOfPresentTenses() {
    var back by remember { mutableStateOf(false) }//This var is for back button

    var movetoSimplePresent by remember { mutableStateOf(false) }
    var movetoPresentContinues by remember { mutableStateOf(false) }
    var movetopresentperfect by remember { mutableStateOf(false) }
    var movetopresentperfectcontinueus by remember { mutableStateOf(false) }

    if (back == true) {
        Tenses()
    }
    else if (movetoSimplePresent==true)
    {
        SimplePresent()
    }
    else if (movetoPresentContinues==true)
    {
        PresentContinues()
    }
    else if (movetopresentperfect==true)
    {
        PresentPerfect()
    }
    else if (movetopresentperfectcontinueus==true)
    {
        PresentPerfectContinueus()
    }
    else {
        Column(
            verticalArrangement = Arrangement.Top,
            modifier = Modifier.background(Color.LightGray)
        )
        {
            backButton (onClick = {back=true})//form back button
            Spacer(modifier = Modifier.padding(90.dp))
            Column(modifier = Modifier.padding(start = 70.dp))
            {
                stylesButtton(string = "Simple Present", onClick1 = {movetoSimplePresent =true})
                stylesButtton(string = "Present  Continuous", onClick1 = {movetoPresentContinues=true})
                stylesButtton(string = "Present Perfect ", onClick1 = {movetopresentperfect=true})
                stylesButtton(string = "Present Perfect Continuous", onClick1 = {movetopresentperfectcontinueus=true})
            }
        }
    }
}

@Composable
fun TypesOfPastTenses() {
    var back by remember { mutableStateOf(false) }//This var is for back button

    var movetoSimplepast by remember { mutableStateOf(false) }
    var movetopastContinues by remember { mutableStateOf(false) }
    var movetopastperfect by remember { mutableStateOf(false) }
    var movetopastperfectcontinueus by remember { mutableStateOf(false) }


    if (back == true) {
        Tenses()
    }
    else if (movetoSimplepast==true)
    {
        SimplePast()
    }
    else if (movetopastContinues==true)
    {
        PastContinous()
    }
    else if (movetopastperfect==true)
    {
        PastPerfect()
    }
    else if (movetopastperfectcontinueus==true)
    {
        PastPerfectContinueus()
    }
    else {
        Column(
            verticalArrangement = Arrangement.Top,
            modifier = Modifier.background(Color.Green)
        )
        {
            backButton (onClick = {back=true})//form back button
            Spacer(modifier = Modifier.padding(90.dp))
            Column(modifier = Modifier.padding(start = 70.dp))
            {
                stylesButtton(string = "Simple Past", onClick1 = {movetoSimplepast=true})
                stylesButtton(string = "Past  Continuous", onClick1 = {movetopastContinues=true})
                stylesButtton(string = "Past Perfect ", onClick1 = {movetopastperfect=true})
                stylesButtton(string = "Past Perfect Continuous", onClick1 = {movetopastperfectcontinueus=true})
            }
        }
    }
}

@Composable
fun TypesOfFutureTenses() {
    var back by remember { mutableStateOf(false) }//This var is for back button

    var movetoSimplefuture by remember { mutableStateOf(false) }
    var movetofutureContinues by remember { mutableStateOf(false) }
    var movetofutureperfect by remember { mutableStateOf(false) }
    var movetofutureperfectcontinueus by remember { mutableStateOf(false) }

    if (back == true) {
        Tenses()
    }
    else if (movetoSimplefuture==true)
    {
        SimpleFuture()
    }
    else if (movetofutureContinues==true)
    {
        FutureContinueus()
    }
    else if (movetofutureperfect==true)
    {
        FuturePerfect()
    }
    else if (movetofutureperfectcontinueus==true)
    {
        FuturePerfectContinueus()
    }
    else {
        Column(
            verticalArrangement = Arrangement.Top,
            modifier = Modifier.background(Color.Yellow)
        )
        {

            backButton (onClick = {back=true})//form back button
            Spacer(modifier = Modifier.padding(90.dp))
            Column(modifier = Modifier.padding(start = 70.dp))
            {
                stylesButtton(string = "Simple Future", onClick1 = {movetoSimplefuture=true})
                stylesButtton(string = "Future Continuous", onClick1 = {movetofutureContinues=true})
                stylesButtton(string = "Future Perfect", onClick1 = {movetofutureperfect=true})
                stylesButtton(string = "Future Perfect Continuous", onClick1 = {movetofutureperfectcontinueus=true})
            }
        }
    }
}