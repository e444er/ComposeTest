package com.moon.test

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun TestScreen(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

            var isVisile by remember {
                mutableStateOf(false)
            }
            Button(onClick = { isVisile = !isVisile }) {
                Text(text = if (isVisile)"Hide" else "Hello")
            }
            Spacer(modifier = Modifier.height(24.dp))

            AnimatedVisibility(visible = isVisile) {
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(painter = painterResource(id = R.drawable.a), contentDescription = "img",
                        modifier = Modifier
                            .width(50.dp)
                            .height(50.dp))

                    Image(painter = painterResource(id = R.drawable.a), contentDescription = "img",
                        modifier = Modifier
                            .width(50.dp)
                            .height(50.dp))

                    Image(painter = painterResource(id = R.drawable.a), contentDescription = "img",
                        modifier = Modifier
                            .width(50.dp)
                            .height(50.dp))
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            AnimatedVisibility(visible = isVisile) {
                Text(
                    text = "Hello",
                    color = Color.Green,
                    fontSize = MaterialTheme.typography.headlineMedium.fontSize,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}