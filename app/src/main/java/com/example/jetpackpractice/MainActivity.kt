package com.example.jetpackpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackpractice.ui.theme.JetpackpracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackpracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    NewsUI(
                        title = stringResource(id = R.string.title_text),
                        subTitle = stringResource(id = R.string.subtitle_text),
                        mainText = stringResource(
                            id = R.string.main_text
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun NewsUI(title: String, subTitle: String, mainText: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column(
        modifier = modifier
    ) {
        Image(painter = image, contentDescription = null)
        Text(
            text = title,
            modifier = Modifier
                .padding(16.dp),
            fontSize = 24.sp,
        )
        Text(
            text = subTitle,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = mainText,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun NewsCardPreview() {
    JetpackpracticeTheme {
        NewsUI(
            title = stringResource(id = R.string.title_text),
            subTitle = stringResource(id = R.string.subtitle_text),
            mainText = stringResource(
                id = R.string.main_text
            )
        )
    }
}

