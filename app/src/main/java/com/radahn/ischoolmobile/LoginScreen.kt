package com.radahn.ischoolmobile

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.login)
    var studentId by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Column (
        modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = image,
            contentDescription = "Login Screen Logo",
            modifier = Modifier
                .size(300.dp)
        )
        Text(
            text = "Welcome to iSchool Mobile!",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(
            modifier = Modifier.height(4.dp)
        )
        Text(
            text = "Login to your student account"
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        OutlinedTextField(
            value = studentId,
            onValueChange = { studentId = it },
            label = { Text(text = "Student ID")}
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Password")},
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Login")
        }
        Spacer(
            modifier = Modifier.height(32.dp)
        )
        Text(
            text = "Forgot Password?",
            modifier = Modifier
                .clickable { /*TODO*/ }
        )
    }
}