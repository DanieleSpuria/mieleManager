package com.example.mielemanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mielemanager.model.Miele
import com.example.mielemanager.ui.theme.MieleManagerTheme
import com.example.mielemanager.viewmodel.MieleViewModel

class MieleActivity : ComponentActivity() {
    private val mieleViewModel: MieleViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MieleManagerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val allMiele = mieleViewModel.allMiele.observeAsState(emptyList())
                    MieleScreen(
                        mieleList = allMiele.value,
                        onAddMiele = { mieleViewModel.insertMiele(Miele(name = "New Miele", quantity = 1)) },
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MieleScreen(mieleList: List<Miele>, onAddMiele: () -> Unit, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        Button(onClick = onAddMiele, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Add Miele")
        }
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn {
            items(mieleList) { miele ->
                Text(text = miele.toString(), modifier = Modifier.padding(8.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MieleScreenPreview() {
    MieleManagerTheme {
        MieleScreen(mieleList = emptyList(), onAddMiele = {})
    }
}