package com.exhale.utp_tam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.exhale.utp_tam.ui.theme.UTP_TAMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UTP_TAMTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Column(modifier = modifier.fillMaxSize().background(Color.Black).padding(9.dp)) {

        Row( modifier = Modifier.fillMaxWidth()
            .background(Color(139,69,19)).padding(10.dp) ){

            Image(
                painter = painterResource(id=R.drawable.story1),
                contentDescription = null,
                modifier = Modifier.size(70.dp)
            )

            Spacer(modifier = Modifier.width(11.dp))
            Column{

                Text("You're My Sunshine",
                    color = Color.White,
                    fontSize = 15.sp)
                Text( "by IniZart" , color =Color.LightGray , fontSize = 12.sp )

            }

        }

        Spacer(modifier = Modifier.height(13.dp))


        Row(
            modifier = Modifier
                .fillMaxWidth().background(Color(139,69,19))
                .padding(12.dp)
        ){

            Image(painter = painterResource(id =R.drawable.story2),
                contentDescription = null,
                modifier = Modifier.size(75.dp))

            Spacer(modifier = Modifier.width(10.dp))

            Column {

                Text(text = "Searching",
                    color = Color.White , fontSize = 16.sp)
                Text(
                    text="by Lblee",
                    color = Color.LightGray,
                    fontSize = 13.sp)
            }

        }

        Spacer(modifier = Modifier.height(10.dp))
        Row( modifier = Modifier.fillMaxWidth()
            .background(Color(139,69,19))
            .padding(9.dp)){

            Image(
                painter = painterResource(id = R.drawable.story3), contentDescription = null,
                modifier = Modifier.size(68.dp)
            )

            Spacer(modifier = Modifier.width(7.dp))

            Column{

                Text("Between Faith and Feeling", color=Color.White,fontSize = 14.sp)
                Text("by CheyGojo", color=Color.LightGray , fontSize = 11.sp)
            }

        }

        Spacer(modifier = Modifier.height(12.dp))


        Row( modifier = Modifier
            .fillMaxWidth()
            .background(Color(139,69,19))
            .padding(13.dp)
        ){

            Image(
                painter = painterResource(id = R.drawable.story4), contentDescription = null,
                modifier = Modifier.size(72.dp)
            )
            Spacer(modifier = Modifier.width(9.dp))

            Column {
                Text("Lost Without You", color=Color.White , fontSize=15.sp)

                Text("by cattocedih",
                    color = Color.LightGray,
                    fontSize = 12.sp)

            }

        }

        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth().background(Color(139,69,19))
                .padding(10.dp)
        ){

            Image(
                painter = painterResource(id = R.drawable.story5),
                contentDescription = null,
                modifier = Modifier.size(69.dp)
            )

            Spacer(modifier = Modifier.width(6.dp))

            Column{

                Text("The Last Letter", color = Color.White , fontSize = 15.sp)


                Text("by rintiksedu",
                    color = Color.LightGray,
                    fontSize = 12.sp)

            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UTP_TAMTheme {
        Greeting("Android")
    }
}