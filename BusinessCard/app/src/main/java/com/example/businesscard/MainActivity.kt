package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinesscardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinesscardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorScheme.background
                ) {

                    TitleGroup(
                        image = painterResource(R.drawable.android_logo),
                        name = stringResource(R.string.name),
                        job = stringResource(R.string.job)
                    )

                    BottomGroup(
                        phone = stringResource(R.string.phone),
                        jobName = stringResource(R.string.job_name),
                        email = stringResource(R.string.email)
                    )

                }
            }
        }
    }

    @Composable
    fun TitleGroup(image: Painter, name: String, job: String, modifier: Modifier = Modifier) {

        Column(
            Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = image, contentDescription = null, modifier = Modifier
                    .width(160.dp)
                    .height(40.dp)
            )
            Text(
                text = name,
                fontSize = 24.sp,
                modifier = modifier
            )
            Text(
                text = job,
                modifier = modifier
            )
        }

    }


    @Composable
    fun BottomGroup(phone: String, jobName: String, email: String, modifier: Modifier = Modifier) {
        Column(
            Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                Icon(
                    imageVector = Icons.Default.Call, contentDescription = null, modifier = Modifier
                        .width(160.dp)
                        .height(40.dp)
                )
                Text(
                    text = phone
                )
            }
            Row {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = null,
                    modifier = Modifier
                        .width(160.dp)
                        .height(40.dp)
                )
                Text(
                    text = jobName
                )
            }
            Row {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = null,
                    modifier = Modifier
                        .width(160.dp)
                        .height(40.dp)
                )
                Text(
                    text = email
                )
            }
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun UIPreview() {
        BusinesscardTheme {
            TitleGroup(
                image = painterResource(id = R.drawable.android_logo),
                name = stringResource(id = R.string.name),
                job = stringResource(id = R.string.job)
            )
            BottomGroup(
                phone = stringResource(id = R.string.phone),
                jobName = stringResource(id = R.string.job_name),
                email = stringResource(id = R.string.email)
            )
        }
    }
}