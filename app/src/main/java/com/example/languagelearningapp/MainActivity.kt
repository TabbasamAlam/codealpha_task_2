package com.example.languagelearningapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.languagelearningapp.ui.theme.LanguageLearningAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LanguageLearningAppTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()

                ) {
                    Text(
                        text = "Developed by Tabbasam Alam",
                        fontWeight = FontWeight.Light,
                        fontStyle = FontStyle.Italic,
                        color=Color.Red,
                        modifier=Modifier.padding(start = 70.dp)
                    )
                    LearningApp()
                }
            }
        }
    }
}

@Composable
fun LearningApp() {
    var off by remember { mutableStateOf(false) }
    val context = LocalContext.current
    if (off == false) {
        Box(
            modifier = Modifier.background(Color.Black)
                .padding(vertical = 20.dp)
        ) {
            Column {
                Card() {
                    Text(
                        text = "Well come to English learning totorial!",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Blue,
                        fontStyle = FontStyle.Italic,
                        lineHeight = 30.sp
                    )
                }
                Spacer(modifier = Modifier.padding(150.dp))
                Column (modifier = Modifier.padding(start = 90.dp)){
                    stylesButtton(onClick1 = { off = true }, string = "Start Learning")
                    stylesButtton(string = "Share", onClick1 = { shareTExt(context) })
                }
            }
        }
    } else if (off == true) {
        Option()
    }
}

fun shareTExt(context: Context) {
    val sendIntent: Intent = Intent().apply {
        action = Intent.ACTION_SEND
        putExtra(Intent.EXTRA_TEXT, "www//.kksjcndoferetitffsdkjfeou./,/;")
        type = "text/plain"
    }
    val shereIntent = Intent.createChooser(sendIntent, null)
    context.startActivity(shereIntent)
}
@Preview(showBackground = true)
@Composable
fun prev() {
    LearningApp()
}