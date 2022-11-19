package com.example.composebusiness

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebusiness.ui.theme.ComposeBusinessTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBusinessTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeBusinessApp()
                }
            }
        }
    }
}

@Composable
fun ComposeBusinessApp() {

    Column(
        modifier = Modifier
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center

    ) {
        ComposeBusinessCardTop(
            fullName = "Alexander Parreira",
            title = "Android Developer",
        )
        ComposeBusinessCardBotton(
            phone = "(21) 98952-9710",
            linkedin = "AlexanderParreira",
            email = "email@email.com"
        )

    }


}

@Composable
private fun ComposeBusinessCardTop(
    fullName: String,
    title: String,

    ) {
    val image = painterResource(R.drawable.android_logo)
    Column(

        modifier = Modifier
            .padding(15.dp)
            .background(Color.DarkGray)
            .fillMaxWidth(),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ) {
        Image(
            painter = image,
            contentDescription = null,
            Modifier
                .fillMaxWidth()
                .height(150.dp)
                .padding(5.dp)
        )
        Text(
            text = fullName,
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 5.dp, end = 5.dp, bottom = 2.dp)


        )
        Text(
            text = title,
            color = Color(0xFF3ddc84),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 5.dp, end = 5.dp, bottom = 2.dp)
        )


    }

}


@Composable
private fun ComposeBusinessCardBotton(
    phone: String,
    linkedin: String,
    email: String
) {
    Column(
        modifier = Modifier
            .padding(15.dp)
            .background(Color.DarkGray)
            .fillMaxWidth(),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ) {
        Row(
            modifier = Modifier
                .padding(start = 5.dp, top = 5.dp, bottom = 2.dp, end = 5.dp)
                .background(Color.Gray)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            var ic_phone = painterResource(R.drawable.ic_phone)
            Image(painter = ic_phone, contentDescription = null)
            Text(
                text = phone,
                modifier = Modifier
                    .padding(start = 80.dp)
            )
        }
        Row(
            modifier = Modifier
                .padding(start = 5.dp, top = 2.dp, bottom = 2.dp, end = 5.dp)
                .background(Color.Gray)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            var ic_share = painterResource(R.drawable.ic_share)
            Image(painter = ic_share, contentDescription = null)
            Text(
                text = linkedin,
                modifier = Modifier
                    .padding(start = 80.dp,)
            )
        }
        Row(
            modifier = Modifier
                .padding(start = 5.dp, top = 2.dp, bottom = 5.dp, end = 5.dp)
                .background(Color.Gray)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            var ic_email = painterResource(R.drawable.ic_email)
            Image(painter = ic_email, contentDescription = null)
            Text(
                text = email,
                modifier = Modifier
                    .padding(start = 80.dp)
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun ComposeBusinessAppPreview() {
    ComposeBusinessTheme {
        ComposeBusinessApp()
    }
}