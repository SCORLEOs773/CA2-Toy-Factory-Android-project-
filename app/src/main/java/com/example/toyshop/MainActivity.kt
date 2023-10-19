package com.example.toyshop

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.toyshop.ui.theme.ToyShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val selectedImage = remember { mutableStateOf<Int?>(null) }

            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Which toy would you like to purchase?",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(16.dp)
                )

                val imageList = listOf(
                    R.drawable.image5,
                    R.drawable.image2,
                    R.drawable.image3,
                    R.drawable.image4
                )

                selectImage(selectedImage, imageList)

                Button(
                    onClick = {
                        // Handle button click here
                        if (selectedImage.value != null) {
                            val navigate = Intent(this@MainActivity, MainActivity3::class.java)
                            // Pass the selected image ID to the next activity if needed
                            navigate.putExtra("selectedImage", selectedImage.value)
                            startActivity(navigate)
                        }
                    },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(text = "Buy It !!", fontSize = 18.sp)
                }
            }
        }
    }
}

@Composable
fun selectImage(selectedImage: MutableState<Int?>, imageList: List<Int>) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val colors = listOf(Color.Blue, Color.Transparent)
        imageList.forEach { imageId ->
            val selected = selectedImage.value == imageId
            Image(
                painter = painterResource(id = imageId),
                contentDescription = null,
                modifier = Modifier
                    .selectable(
                        selected = selected,
                        onClick = {
                            selectedImage.value = if (selected) null else imageId
                        }
                    )
                    .padding(8.dp)
                    .size(120.dp)
                    .background(
                        color = colors[if (selected) 0 else 1],
                        shape = RoundedCornerShape(16.dp)
                    )
            )
        }
    }
}

@Preview
@Composable
fun PreviewMainActivity() {
    ToyShopTheme {
        MainActivity()
    }
}
