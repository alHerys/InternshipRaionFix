package com.kelompok1.internshipraion.presentation.register

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.kelompok1.internshipraion.R

@Composable
fun RegisterScreen(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize()) {
        Button(
            onClick = {}
        ) {
            Icon(
                painter = painterResource(id = R.drawable.icon_back),
                contentDescription = "Icon Back"
            )
        }
    }
}

@Preview
@Composable
fun RegisterScreenPreview(modifier: Modifier = Modifier) {
    RegisterScreen()
}