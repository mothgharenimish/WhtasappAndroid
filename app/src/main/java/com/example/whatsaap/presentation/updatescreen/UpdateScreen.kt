package com.example.whatsaap.presentation.updatescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsaap.R
import com.example.whatsaap.presentation.bottomnavigation.bottomNavigation

@Composable
@Preview(showSystemUi = true)
fun UpdateScreen() {

    Scaffold(

        floatingActionButton = {
            FloatingActionButton(onClick = {},
                containerColor = colorResource(id = R.color.darkgreen)

            ) {

                Icon(
                    painter = painterResource(R.drawable.camera),
                    contentDescription = null,
                    tint = Color.Black,
                    modifier = Modifier.size(18.dp)
                )
            }
        },
        bottomBar = {
            bottomNavigation()
        },

        topBar = {
            TopBar()
        }

    ) {
        Column(modifier = Modifier.padding(it)) {  }
    }

}