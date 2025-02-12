package com.sperske.cicddemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.sperske.cicddemo.ui.theme.CICDDemoTheme
import com.sperske.cicddemo.ui.theme.HuskyPurple
import com.sperske.cicddemo.ui.theme.HuskyGold

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      CICDDemoTheme {
        Scaffold(
          modifier = Modifier
            .fillMaxSize()
        ) { innerPadding ->
          Greeting(
            name = "CSE 403",
            modifier = Modifier.padding(innerPadding)
          )
        }
      }
    }
  }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
  Box(
    modifier = modifier.fillMaxSize().background(HuskyPurple),
    contentAlignment = Alignment.Center
  ) {
    Text(
      text = "Hello $name!",
      fontSize = 48.sp,
      color = Color.White,
      fontWeight = FontWeight.Bold,
      style = TextStyle(
        shadow = Shadow(
          color = HuskyGold,
          blurRadius = 3f,
          offset = androidx.compose.ui.geometry.Offset(4f, 4f)
        )
      )
    )
  }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  CICDDemoTheme {
    Greeting("CSE 403")
  }
}