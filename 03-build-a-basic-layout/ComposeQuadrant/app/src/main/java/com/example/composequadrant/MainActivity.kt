package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomePage()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomePagePreview() {
    HomePage()
}


@Composable
fun HomePage(modifier: Modifier = Modifier) {
    Column(
    ) {
        Row(
            Modifier
                .weight(1f)
        ) {
            Quadrant(
                title = stringResource(id = R.string.q1_title),
                content = stringResource(id = R.string.q1_content),
                modifier = Modifier
                    .weight(1f)
                    .background(color = colorResource(id = R.color.color_1))
            )
            Quadrant(
                title = stringResource(id = R.string.q2_title),
                content = stringResource(id = R.string.q2_content),
                modifier = Modifier
                    .weight(1f)
                    .background(color = colorResource(id = R.color.color_2))
            )
        }
        Row(
            Modifier
                .weight(1f)
        ) {
            Quadrant(
                title = stringResource(id = R.string.q3_title),
                content = stringResource(id = R.string.q3_content),
                modifier = Modifier
                    .weight(1f)
                    .background(color = colorResource(id = R.color.color_3))
            )
            Quadrant(
                title = stringResource(id = R.string.q4_title),
                content = stringResource(id = R.string.q4_content),
                modifier = Modifier
                    .weight(1f)
                    .background(color = colorResource(id = R.color.color_4))
            )
        }
    }
}

@Composable
fun Quadrant(title: String, content: String, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = content,
            textAlign = TextAlign.Justify,
            modifier = Modifier
        )
    }
}
