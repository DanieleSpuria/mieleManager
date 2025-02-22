package com.example.mielemanager

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mielemanager.ui.theme.MieleManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MieleManagerTheme {
                MainScreen(onNavigateToMieleActivity = { navigateToMieleActivity() })
            }
        }
    }

    private fun navigateToMieleActivity() {
        val intent = Intent(this, MieleActivity::class.java)
        startActivity(intent)
    }
}

@Composable
fun MainScreen(onNavigateToMieleActivity: () -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = androidx.compose.ui.Alignment.Center
    ) {
        Button(onClick = onNavigateToMieleActivity) {
            Text(text = "Go to Miele Activity")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MieleManagerTheme {
        MainScreen(onNavigateToMieleActivity = {})
    }
}