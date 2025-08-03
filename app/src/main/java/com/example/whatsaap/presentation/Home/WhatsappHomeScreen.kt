package com.example.whatsaap.presentation.Home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsaap.R
import com.example.whatsaap.presentation.bottomnavigation.bottomNavigation

@Composable
@Preview(showSystemUi = true)
fun WhatsappHomeScreen() {

    val chatData = listOf(
        ChatListModel(
            R.drawable.imagesgdhg,
            name = "Rashid Khan",
            time = "10.00 AM",
            message = "Hello Rehman"
        ),

        ChatListModel(
            R.drawable.imageben,
            name = "Ben Stokes",
            time = "9.00 AM",
            message = "Hello Joe Root"
        ),
        ChatListModel(
            R.drawable.joeroot,
            name = "Joe Root",
            time = "7:32 PM ",
            message = "Hello Ben Duckeet"
        ),

        ChatListModel(
            R.drawable.jasonholder,
            name = "Jason Holder",
            time = "8:12 PM ",
            message = "Hello Jason Gillispe"
        ),


        )

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = colorResource(id = R.color.darkgreen)
            ) {
                Icon(
                    painter = painterResource(R.drawable.chat_icon),
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(18.dp)
                )
            }
        },
        bottomBar = {
            bottomNavigation()
        }
    ) {

        Column(modifier = Modifier.padding(it)) {

            Spacer(modifier = Modifier.height(16.dp))
            Box(modifier = Modifier.fillMaxWidth()) {

                Text(
                    "Whatsapp",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.darkgreen),
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(start = 16.dp)
                )

                Row(modifier = Modifier.align(Alignment.CenterEnd)) {
                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(id = R.drawable.camera),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }

                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(id = R.drawable.search),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }

                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(id = R.drawable.more),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
            }

            HorizontalDivider()

            LazyColumn {

               items(chatData) {

                ChatDesign(chatDesignModel = it)

               }
            }
        }

    }

}
