package com.ctksoftware.compose_demo.screens

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.ctksoftware.compose_demo.screens.components._buildAppBar
import java.util.TimeZone

@Composable
fun MainScreen() {
    Scaffold(
        topBar = { _buildAppBar() }
    ) {
        Column(

            modifier = Modifier.padding(it), horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(text = "Body")
        }

    }


}





