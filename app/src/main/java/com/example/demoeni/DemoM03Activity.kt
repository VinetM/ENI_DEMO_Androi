package com.example.demoeni

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.rememberSwipeToDismissBoxState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.NotificationCompat.Style
import com.example.demoeni.ui.theme.DemoENITheme

class DemoM03Activity : ComponentActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge();

        setContent {
            DemoM04Page()
        }
    }
}

@Composable
fun EniBackgroundPage(){
    Image(
        painter = painterResource(id = R.drawable.background),
        contentDescription = "",
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
fun DemoM04Page(){
        DemoENITheme {
            Scaffold(modifier = Modifier.fillMaxSize()){
                innerPadding ->
                //gestionnaire de calque
                Box(modifier = Modifier.padding(innerPadding)){//calque 1
                    EniBackgroundPage()
                    //Calque 2
                    Column(modifier = Modifier
                        .padding(40.dp)
                        .fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painter = painterResource(id = R.drawable.hdmi),
                            contentDescription = "",
                            modifier = Modifier.width(164.dp)
                        )
                        Text(text = "Le saint text", style = TextStyle(color = Color.White, fontWeight = FontWeight.Bold, fontSize = 25.sp))
                        Spacer(modifier = Modifier.weight(0.5f))
                        TextField(
                            value = "",
                            onValueChange = {},
                            label = { Text(text = "La prise") }
                        )
                        ElevatedButton(modifier = Modifier.fillMaxWidth(), onClick = {}) {
                            Text("Acheter")
                        }
                        Spacer(modifier = Modifier.weight(1f))
                        Text(text = "@Copyright 2024 - Pas compris.",
                            textAlign = TextAlign.Center, style = TextStyle(color = Color.White))
                    }
                }
            }
        }
}

@Preview(showBackground = true)
@Composable
fun DemoM03ComposePreview(){
    DemoLoginPage()
}

@Composable
fun EniOutlinedImageTextField(label:String, img:String, imgfont1: FontFamily, imgfont2: FontFamily){
    OutlinedTextField(
        value = "",
        onValueChange = {},
        label = { Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(fontFamily = imgfont1, color = Color.White, fontSize = 20.sp)) {
                    append(img)
                }
                withStyle(style = SpanStyle(fontFamily = imgfont2, color = Color.White, fontSize = 20.sp)) {
                    append(label)
                }
            }
        )
        },
    )
}

@Composable
fun DemoLoginPage(){

    DemoENITheme {
        Scaffold(modifier = Modifier.fillMaxSize()){
                innerPadding ->
            //gestionnaire de calque
            Box(modifier = Modifier.padding(innerPadding)){//calque 1
                val solid = FontFamily(
                    Font(R.font.fa_solid_900)
                )
                val regular = FontFamily(
                    Font(R.font.fa_regular_400)
                )
                val normal = FontFamily(
                    Font(R.font.reddit)
                )
                Column {

                }
                Image(
                    painter = painterResource(id = R.drawable.background),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
                Column(modifier = Modifier
                    .padding(40.dp)
                    .fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Spacer(modifier = Modifier.weight(0.3f))
                    Text(text = "\uf074", style = TextStyle(color = Color.White, fontSize = 100.sp, fontFamily = solid))
                    Spacer(modifier = Modifier.weight(0.3f))
                    EniOutlinedImageTextField("  CreditCard", "\uf0e0", solid, normal)
                    EniOutlinedImageTextField("  FeetSize", "\uf696", solid, normal)
                    Spacer(modifier = Modifier.weight(0.2f))
                    ElevatedButton(modifier = Modifier.fillMaxWidth(), onClick = {}) {
                        Text(text = "Button", style = TextStyle(color = Color.Black, fontSize = 20.sp, fontFamily = normal))
                    }
                    Spacer(modifier = Modifier.weight(1f))
                }
            }
        }
    }
}

@Composable
fun DemoSubscribePage(){
    DemoENITheme {
        Scaffold(modifier = Modifier.fillMaxSize()){
                innerPadding ->
            //gestionnaire de calque
            Box(modifier = Modifier.padding(innerPadding)){//calque 1
                Image(
                    painter = painterResource(id = R.drawable.background),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
                Column(modifier = Modifier
                    .padding(40.dp)
                    .fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Spacer(modifier = Modifier.weight(0.5f))
                    Text(text = "SIGN IN", style = TextStyle(color = Color.White, fontWeight = FontWeight.Bold, fontSize = 40.sp))
                    Spacer(modifier = Modifier.weight(0.5f))
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = { Text(text = "Pseudo") },
                        singleLine = true
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = { Text(text = "Email") },
                        singleLine = true
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = { Text(text = "Password") },
                        singleLine = true
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = { Text(text = "Password Confirmation") },
                        singleLine = true
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = { Text(text = "City Code") },
                        singleLine = true
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = { Text(text = "City") },
                        singleLine = true
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = { Text(text = "Phone Number") },
                        singleLine = true
                    )
                    ElevatedButton(modifier = Modifier.fillMaxWidth(), onClick = {}) {
                        Text("SIGN IN")
                    }
                    Spacer(modifier = Modifier.weight(1f))
                }
            }
        }
    }
}

@Composable
fun DemoForgottenPwdPage(){
    DemoENITheme {
        Scaffold(modifier = Modifier.fillMaxSize()){
                innerPadding ->
            //gestionnaire de calque
            Box(modifier = Modifier.padding(innerPadding)){//calque 1
                Image(
                    painter = painterResource(id = R.drawable.background),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
                Column(modifier = Modifier
                    .padding(40.dp)
                    .fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Spacer(modifier = Modifier.weight(0.5f))
                    Text(text = "Forgotten Password", textAlign = TextAlign.Center, style = TextStyle(color = Color.White, fontWeight = FontWeight.Bold, fontSize = 40.sp))
                    Spacer(modifier = Modifier.weight(0.5f))
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = { Text(text = "Email") },
                        singleLine = true
                    )
                    ElevatedButton(modifier = Modifier.fillMaxWidth(), onClick = {}) {
                        Text("Send recovery link")
                    }
                    Spacer(modifier = Modifier.weight(1f))
                }
            }
        }
    }
}