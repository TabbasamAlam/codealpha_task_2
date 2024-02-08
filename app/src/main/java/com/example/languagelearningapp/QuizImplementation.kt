package com.example.languagelearningapp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel

data class Question(val text:String,val options: List<String>,val correctAnswer: String)

@Composable
fun QuizFunction(question: List<Question> ) {
   var currentquestionindex by remember { mutableStateOf(0) }
    var userAnswer by remember { mutableStateOf(mutableListOf<String>()) }
    var showresults by remember { mutableStateOf(false) }

    if ( showresults)
    {
        QuizResults(question = question, userAnswer = userAnswer)
    }
    else{
        QuizCard(question = question[currentquestionindex],
            onOptionSelect ={answer->
                userAnswer.add(answer)
            } ,
            onSubmit = {
                if (currentquestionindex<question.size-1){
                    currentquestionindex++
                }
                else
                {
                    showresults=true
                }
              }
        )
    }
}

@Composable
fun QuizResults(question: List<Question>, userAnswer: List<String>) {
    var score by remember { mutableStateOf(0) }
    var back by remember { mutableStateOf(false) }
    if (back==true)
    {
        Tenses()
        score=0
    }
    else{
        for (i in question.indices)
        {
            if (userAnswer.getOrNull(i)==question[i].correctAnswer)
            {
                score++
            }
        }
        Column (
            modifier= Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        ){
            backButton(onClick = {back=true})
            Spacer(modifier = Modifier.padding(150.dp))
            Text(text = "Your score is $score out of ${question.size}",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)
            if (score>=(question.size/2))
            {
                Text(text = "Congratulation",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    color= Color.Magenta)
               
            }
            else
            {
                Text(text = "Try again",
                    fontWeight = FontWeight.Normal,
                    fontSize = 20.sp,
                    color= Color.Red)
                
            }
            progresbar(Progress = ((score.toFloat())/question.size))
        }
    }
}

@Composable
fun QuizCard(
    question: Question,onOptionSelect:(String)->Unit,onSubmit:()->Unit
) {
    var selectedOption by remember { mutableStateOf<String?>(null) }
    Column(
        modifier= Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = question.text, fontWeight = FontWeight.Bold, fontSize = 20.sp)
        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(
            modifier= Modifier
                .fillMaxSize()
                .weight(1f)
        )
        {
            items(question.options){option->
                OptionItem(option = option, isSelected = option==selectedOption, onOptionSelect = {selectedOption=it
                onOptionSelect(it)
                  }
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            if (selectedOption !=null){
                onSubmit()
                selectedOption=null
            }
        },
            modifier= Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            Text(text = if (selectedOption != null) "next" else "Select"
            )
        }
    }
}

@Composable
fun OptionItem(option: String, isSelected:Boolean,onOptionSelect: (String) -> Unit) {
    Row (
        modifier= Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onOptionSelect(option) }

    ){
        Icon(imageVector = if (isSelected) Icons.Default.CheckCircle else Icons.Default.Check,
            contentDescription = null,
            modifier=Modifier.size(24.dp))
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = option, fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal)
    }
}
