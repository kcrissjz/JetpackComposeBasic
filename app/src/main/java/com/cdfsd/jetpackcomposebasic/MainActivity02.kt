package com.cdfsd.jetpackcomposebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity02 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            messageCard02(name = "xxx")
        }
    }
}

@Composable
fun messageCard02(name:String){
    Text(text = "Hello $name")
}

@Preview
@Composable
fun previewMessageCard02(){
    messageCard02(name = "Android")
}
