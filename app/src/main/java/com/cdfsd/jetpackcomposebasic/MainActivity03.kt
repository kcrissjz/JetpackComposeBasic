package com.cdfsd.jetpackcomposebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cdfsd.jetpackcomposebasic.ui.theme.JetpackComposeBasicTheme

class MainActivity03 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeBasicTheme() {
                messageCard03(Msg("liujz", "Jetpack Compose"))
            }
        }
    }
}

@Composable
fun messageCard03(msg: Msg) {
    Row(modifier = Modifier.padding(all = 8.dp).background(MaterialTheme.colors.background)) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column() {
            Text(
                text = "Hello ${msg.author}",
                style = TextStyle(
                    color = Color.Blue,
                    fontSize = 17.sp,
                    fontStyle = FontStyle(3)
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = "Hello2 ${msg.body}",
                style = TextStyle(
                    color = Color.Red,
                    fontSize = 13.sp,
                    fontStyle = FontStyle(2)
                ))
        }
    }
}


data class Msg(var author: String, var body: String)
