package com.example.toyshop

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.toyshop.ui.theme.ToyShopTheme

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Left side: Image
                    val imageId = R.drawable.image3 // Replace with the actual image resource
                    Image(
                        painter = painterResource(id = imageId),
                        contentDescription = null,
                        modifier = Modifier
                            .size(200.dp)
                            .background(MaterialTheme.colorScheme.background)
                    )

                    // Right side: Toy Details
                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text(
                            text = "Toy Name: Bubble Silicone Toy ",
                            fontSize = 20.sp
                        )
                        Text(
                            text = "Price: Ruee.1000", // Replace with actual price
                            fontSize = 16.sp
                        )
                        Text(
                            text = "Description: Push Pop Bubble Fidget Sensory Toy,  Great Fidget Toy for Kids and Adults",
                            fontSize = 16.sp
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = {
                        val navigate = Intent(this@MainActivity3, MainActivity::class.java)
                        startActivity(navigate)
                    },
                    modifier = Modifier.background(MaterialTheme.colorScheme.primary)
                ) {
                    Text(text = "Back to Main", fontSize = 18.sp)
                }

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = {
                        val navigate = Intent(this@MainActivity3, MainActivity2::class.java)
                        startActivity(navigate)
                    },
                    modifier = Modifier.background(MaterialTheme.colorScheme.primary)
                ) {
                    Text(text = "Feedback Form ", fontSize = 18.sp)
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewMainActivity3() {
    ToyShopTheme {
        MainActivity3()
    }
}
