package com.example.whatsaap.presentation.userregistrationscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsaap.R

@Composable
@Preview(showSystemUi = true)
fun UserRegistrationScreen() {

    var expanded by remember { mutableStateOf(false) }
    var selectedCountry by remember { mutableStateOf("South Korea") }
    var countryCode by remember { mutableStateOf("+71") }
    var phonenumber by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            "Enter you phone number",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.darkgreen),
            modifier = Modifier
                .padding(top = 60.dp)

        )

        Row(
            modifier = Modifier
                .padding(top = 16.dp)
        ) {
            Text(
                "Whatsapp will need to verify your phone number",
                fontSize = 15.sp,
                color = Color.Gray,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                "what's",
                fontSize = 15.sp,
                color = colorResource(R.color.darkgreen),
                fontWeight = FontWeight.Bold
            )
        }

        Text(
            "my number?",
            fontSize = 15.sp,
            color = colorResource(R.color.darkgreen),
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextButton(
            onClick = {expanded =  true}, modifier = Modifier.fillMaxWidth()
        )

        {
            Box(modifier = Modifier.width(230.dp)) {
                Text(
                    text = selectedCountry,
                    modifier = Modifier.align(Alignment.Center),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )

                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = null,
                    tint = colorResource(id = R.color.darkgreen),
                    modifier = Modifier.align(Alignment.CenterEnd)
                )
            }
        }

        HorizontalDivider(
            modifier = Modifier.padding(horizontal = 66.dp),
            thickness = 2.dp,
            color = colorResource(R.color.darkgreen)
        )


    }
}