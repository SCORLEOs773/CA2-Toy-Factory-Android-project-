package com.example.toyshop
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var question1Answer by remember { mutableStateOf("") }
            var question2Answer by remember { mutableStateOf("") }
            var question3Answer by remember { mutableStateOf("") }

            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                if (question1Answer.isBlank()) {
                    Text(
                        text = "Question 1: What do you think about our toy quality?",
                        fontSize = 18.sp
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        onClick = {
                            question1Answer = "Excellent"
                        },
                        modifier = Modifier
                            .background(MaterialTheme.colorScheme.primary)
                            .fillMaxWidth()
                    ) {
                        Text(text = "Excellent", fontSize = 18.sp)
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        onClick = {
                            question1Answer = "Good"
                        },
                        modifier = Modifier
                            .background(MaterialTheme.colorScheme.primary)
                            .fillMaxWidth()
                    ) {
                        Text(text = "Good", fontSize = 18.sp)
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        onClick = {
                            question1Answer = "Fair"
                        },
                        modifier = Modifier
                            .background(MaterialTheme.colorScheme.primary)
                            .fillMaxWidth()
                    ) {
                        Text(text = "Fair", fontSize = 18.sp)
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        onClick = {
                            question1Answer = "Poor"
                        },
                        modifier = Modifier
                            .background(MaterialTheme.colorScheme.primary)
                            .fillMaxWidth()
                    ) {
                        Text(text = "Poor", fontSize = 18.sp)
                    }
                } else if (question2Answer.isBlank()) {
                    Text(
                        text = "Question 2: How likely are you to recommend our toys to others?",
                        fontSize = 18.sp
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        onClick = {
                            question2Answer = "Very Likely"
                        },
                        modifier = Modifier
                            .background(MaterialTheme.colorScheme.primary)
                            .fillMaxWidth()
                    ) {
                        Text(text = "Very Likely", fontSize = 18.sp)
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        onClick = {
                            question2Answer = "Likely"
                        },
                        modifier = Modifier
                            .background(MaterialTheme.colorScheme.primary)
                            .fillMaxWidth()
                    ) {
                        Text(text = "Likely", fontSize = 18.sp)
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        onClick = {
                            question2Answer = "Not Sure"
                        },
                        modifier = Modifier
                            .background(MaterialTheme.colorScheme.primary)
                            .fillMaxWidth()
                    ) {
                        Text(text = "Not Sure", fontSize = 18.sp)
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        onClick = {
                            question2Answer = "Unlikely"
                        },
                        modifier = Modifier
                            .background(MaterialTheme.colorScheme.primary)
                            .fillMaxWidth()
                    ) {
                        Text(text = "Unlikely", fontSize = 18.sp)
                    }
                } else if (question3Answer.isBlank()) {
                    Text(
                        text = "Question 3: Any additional comments or suggestions?",
                        fontSize = 18.sp
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    // Add a text input field for free-form comments here

                    Button(
                        onClick = {
                            question3Answer = "Thank you for your feedback!"
                        },
                        modifier = Modifier
                            .background(MaterialTheme.colorScheme.primary)
                            .fillMaxWidth()
                    ) {
                        Text(text = "Submit Feedback", fontSize = 18.sp)
                    }
                } else {
                    // All questions answered
                    Text(
                        text = "Thank you for your feedback!",
                        fontSize = 24.sp
                    )
                }
            }
        }
    }
}

