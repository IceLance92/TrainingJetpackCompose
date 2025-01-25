package com.example.visitka


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visitka.ui.theme.MyJetpackLessensTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyJetpackLessensTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            val image = painterResource(R.drawable.scale_1200)
            Image(painter = image, contentDescription = null)
            Text(
                text = "Android Developer",
                modifier = Modifier
                    .background(color = Color(0xD23B851D))
                    .padding(10.dp)
                    .align(alignment = Alignment.CenterHorizontally),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Партин Александр Олегович",
                modifier = Modifier
                    .background(color = Color(0xD23B851D))
                    .padding(5.dp)
                    .align(alignment = Alignment.CenterHorizontally),
                textAlign = TextAlign.Justify
            )
        }
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                val icontel = painterResource(R.drawable.baseline_call_24)
                Icon(painter = icontel, contentDescription = null)
                Text(
                    text = "+79379754174",
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(16.dp)
                )
            }
            Row {
                val iconteleg = painterResource(R.drawable.rounded_assignment_ind_24)
                Icon(painter = iconteleg, contentDescription = null)
                Text(
                    text = "@azeroth992",
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(16.dp)
                )
            }
            Row {
                val iconmail = painterResource(R.drawable.sharp_comment_24)
                Icon(painter = iconmail, contentDescription = null)
                Text(
                    text = "mograin_92@mail.ru",
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(16.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyJetpackLessensTheme {
        Greeting()
    }
}