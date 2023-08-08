package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomePage(
                        stringResource(R.string.home_title),
                        stringResource(R.string.home_paragraph_1),
                        stringResource(R.string.home_paragraph_2)
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LearnTogetherPreview() {
    LearnTogetherTheme {
        HomePage(
            stringResource(R.string.home_title),
            stringResource(R.string.home_paragraph_1),
            stringResource(R.string.home_paragraph_2)
        )
    }
}

@Composable
fun HomePage(title: String, paragraph1: String, paragraph2: String) {
    val headerImage = painterResource(id = R.drawable.bg_compose_background)
    Column(
        verticalArrangement = Arrangement.Top,
    ) {
        Image(
            painter = headerImage,
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        Column(
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
        ) {
            MyTitle(
                text = title,
                modifier = Modifier
            )
            MyContent(
                text = paragraph1,
                modifier = Modifier
            )
            MyContent(
                text = paragraph2,
                modifier = Modifier
                    .padding(
                        top = 16.dp,
                        bottom = 16.dp
                    )
            )
        }
    }
}


@Composable
fun MyTitle(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        fontSize = 24.sp,
        modifier = Modifier
            .padding(16.dp)
    )
}

@Composable
fun MyContent(text: String, modifier: Modifier) {
    Text(
        text = text,
        textAlign = TextAlign.Justify,
        modifier = modifier
            .padding(
                start = 16.dp,
                end = 16.dp
            )
    )
}

