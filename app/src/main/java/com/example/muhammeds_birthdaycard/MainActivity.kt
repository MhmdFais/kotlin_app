package com.example.muhammeds_birthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hasinis_birthdaycard.R
import com.example.muhammeds_birthdaycard.ui.theme.Muhammeds_BirthdaycardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Muhammeds_BirthdaycardTheme(){
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BackgroundImage(imageResId = R.drawable.androidparty)
                    Box(modifier = Modifier.fillMaxSize()) {
                        GreetingText(
                            message = "Happy birthday Muhammed",
                            from = "From KDU Batch 39",
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }
                }
            }
        }
    }
    @Composable
    fun BackgroundImage(modifier: Modifier = Modifier, imageResId: Int) {
        Box(modifier = modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize()
            )
        }
    }

    @Composable
    fun GreetingText(message: String, from :String, modifier: Modifier = Modifier) {
        Column( verticalArrangement = Arrangement.Center,modifier=modifier.padding(8.dp)){
            Text(
                text = message,
                fontSize = 70.sp,
                lineHeight = 116.sp,
                textAlign= TextAlign.Center,

                )
            Text(
                text = from,
                fontSize = 36.sp,
                modifier= Modifier
                    .padding(16.dp)
                    .align(alignment = Alignment.End),
            )
        }

    }
}
