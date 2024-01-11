package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    LazyColumn (
        modifier = modifier,
    ) {
        stickyHeader {
            Surface(Modifier.fillParentMaxWidth(), color = MaterialTheme.colorScheme.secondaryContainer) {
                Text("First", Modifier.padding(start = 16.dp))
            }
        }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        stickyHeader {
            Surface(Modifier.fillParentMaxWidth(), color = MaterialTheme.colorScheme.secondaryContainer) {
                Text("Second", Modifier.padding(start = 16.dp))
            }
        }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
        item { ListItem (headlineContent = { Text(text = "Hello $name!") } ) }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}