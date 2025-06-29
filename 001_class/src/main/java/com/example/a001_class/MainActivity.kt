package com.example.a001_class

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a001_class.ui.theme.MyJetpackLessensTheme

class MainActivity {
    fun main() {
        var smartDevice: SmartDevice = SmartTvDevice("Android TV", "Entertainment")
        smartDevice.turnOn()

        smartDevice = SmartLightDevice("Google Light", "Utility")
        smartDevice.turnOn()
    }