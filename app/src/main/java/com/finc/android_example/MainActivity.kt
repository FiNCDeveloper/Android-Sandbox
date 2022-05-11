package com.finc.android_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        setContent {
            MyApp()
        }
    }
}

@Composable
private fun MyApp() {
    Column {
        Greeting()
    }
}

@Composable
private fun Greeting(names: List<String> = listOf("World", "Compose")) {

    for (name in names) {
        Surface(
            color = MaterialTheme.colors.primary,
            modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
        ) {
            val expanded = remember { mutableStateOf(false) }
            val extraPadding = if (expanded.value) 48.dp else 0.dp
            Row(modifier = Modifier.padding(24.dp)) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(bottom = extraPadding)
                )
                {
                    Text(
                        text = "Hello,",
                    )
                    Text(
                        text = name,
                    )
                }

                OutlinedButton(
                    onClick = { expanded.value = !expanded.value }
                ) {
                    Text(if (expanded.value) "Show less" else "Show more")
                }
            }
        }
    }
}

@Composable
@Preview(name = "Text preview")
private fun Preview() {
    MyApp()
}
