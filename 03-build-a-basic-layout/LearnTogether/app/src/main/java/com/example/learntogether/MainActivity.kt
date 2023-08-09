package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
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
                    ComposableArticleApp()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LearnTogetherPreview() {
    LearnTogetherTheme {
        ComposableArticleApp()
    }
}


@Composable
fun ComposableArticleApp() {
    ArticleCard(
        title = stringResource(id = R.string.home_title),
        shortDescription = stringResource(id = R.string.home_paragraph_1),
        longDescription = stringResource(id = R.string.home_paragraph_2),
        imagePainter = painterResource(id = R.drawable.bg_compose_background)
    )
}


@Composable
fun ArticleCard(
    title: String,
    shortDescription: String,
    longDescription: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier
) {
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
            Text(
                text = title,
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp)
            )
            Text(
                text = shortDescription,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp)
            )
            Text(
                text = longDescription,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

