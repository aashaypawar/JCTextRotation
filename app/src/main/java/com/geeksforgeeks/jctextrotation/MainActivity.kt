package com.geeksforgeeks.jctextrotation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            // Creating a Simple Scaffold Layout for the application
            Scaffold(

                // Creating a Top Bar
                topBar = { TopAppBar(title = { Text("GFG | Modifier Rotation", color = Color.White) }, backgroundColor = Color(0xff0f9d58)) },

                // Creating Content
                content = {

                    // Creating a Column Layout
                    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

                        Text(text = "GeeksforGeeks 45", modifier = Modifier.rotate(-45f))

                        Spacer(modifier = Modifier.height(100.dp))

                        Text(text = "GFG GFG GFG 90", modifier = Modifier.rotate(-90f))

                        Spacer(modifier = Modifier.height(100.dp))

                        Text(text = "GfgGfgGfgGfg 135", modifier = Modifier.rotate(-135f))

                    }
                }
            )
        }
    }
}

/*
Package name wrong
 */