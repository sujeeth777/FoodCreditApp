package com.example.foodvreditapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodvreditapp.ui.theme.FoodVreditAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodVreditAppTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    AccountSelectionScreen()
                }
            }
        }
    }
}

@Composable
fun AccountSelectionScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE8F9EE)) // light green background
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(50.dp))

        // Top Icon (replace with your own logo if you want)
        Image(
            painter = painterResource(R.drawable.logo), // placeholder icon

            contentDescription = "App Logo",
            //tint = Color(0xFF1EB980),
            modifier = Modifier
                .size(120.dp)
                .padding(8.dp)
                .clip(RoundedCornerShape(22.dp))
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Food Credit",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Recycle.Redeem.Relish",
            fontSize = 16.sp,
            color = Color.Gray,
            modifier = Modifier.padding(top = 4.dp)
        )

        Spacer(modifier = Modifier.height(40.dp))

        // User Account Card
        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            modifier = Modifier
                .fillMaxWidth()
                .clickable { /* TODO: Handle User Account */ }
        ) {
            Row(
                modifier = Modifier.padding(20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(android.R.drawable.ic_menu_myplaces), // placeholder
                    contentDescription = "User Icon",
                    tint = Color(0xFF1EB980),
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text("User Account", fontWeight = FontWeight.Bold)
                    Text("For customers who want to order food\nand manage their food credits", fontSize = 12.sp)
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Employee Account Card
        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            modifier = Modifier
                .fillMaxWidth()
                .clickable { /* TODO: Handle Employee Account */ }
        ) {
            Row(
                modifier = Modifier.padding(20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(android.R.drawable.ic_menu_manage), // placeholder
                    contentDescription = "Employee Icon",
                    tint = Color(0xFF1EB980),
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text("Employee Account", fontWeight = FontWeight.Bold)
                    Text("For restaurant staff and administrators\nwho manage food services", fontSize = 12.sp)
                }
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        // Continue Button
        Button(
            onClick = { /* TODO: Continue as User */ },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1EB980))
        ) {
            Text("Continue as User")
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Sign in Link
        Text(
            text = "Already have an account? Sign in here",
            fontSize = 14.sp,
            color = Color(0xFF1EB980),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { /* TODO: Handle Sign In */ }
        )
    }
}
