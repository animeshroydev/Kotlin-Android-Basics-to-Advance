package com.appmakerszone.composearticleexercise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCard()
        }
    }
}


@Composable
fun BusinessCard() {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color(0xFFD2E8D4)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ) {

        Box(
            modifier = Modifier
                .weight(4f)
                .fillMaxWidth()
        ) {
            BusinessNameInfo()
        }

        // This Box will take up the remaining space
        Box(
            modifier = Modifier
                .weight(2f)
        ) {
            BusinessContactInfo()
        }

    }
}

@Composable
fun BusinessNameInfo() {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(
                id = R.drawable.android_logo
            ),
            contentDescription = "",
            modifier = Modifier
                .height(110.dp)
                .width(110.dp)
                .background(Color(0xFF0E3042))
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Text(
            text = "Animesh Roy",
            fontSize = 40.sp,
            fontWeight = FontWeight.Light
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Text(
            text = "Passionate Android Developer",
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            color = Color(0xFF70DD86)
        )
    }

}

@Composable
fun BusinessContactInfo() {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 50.dp)
    ) {

        Column {
            Icon(imageVector = Icons.Rounded.Call, contentDescription = null, tint = Color.Green)
            Spacer(modifier = Modifier.padding(6.dp))
            Icon(imageVector = Icons.Rounded.Share, contentDescription = null, tint = Color.Green)
            Spacer(modifier = Modifier.padding(5.dp))
            Icon(imageVector = Icons.Rounded.Email, contentDescription = null, tint = Color.Green)
        }

        Column {

            Text(
                text = "+11 (123) 666 444 999",
                fontSize = 15.sp,
                modifier = Modifier.padding(start = 25.dp)
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Text(
                text = "@roy_animesh7",
                fontSize = 15.sp,
                modifier = Modifier.padding(start = 25.dp)
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Text(
                text = "animesh.android@gmail.com",
                fontSize = 15.sp,
                modifier = Modifier.padding(start = 25.dp, bottom = 4.dp)
            )

        }

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCard()
}