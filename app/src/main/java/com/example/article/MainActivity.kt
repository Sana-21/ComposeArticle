package com.example.article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.article.ui.theme.ArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Article(title = "Jetpack Compose tutorial",
                        firstDes = "Jetpack Compose is a modern toolkit for building native Android UI. " +
                                "Compose simplifies and accelerates UI development on Android with less code," +
                                " powerful tools, and intuitive Kotlin APIs." ,
                        secondDes = "Jetpack Compose is a modern toolkit for building native Android UI. " +
                                "Compose simplifies and accelerates UI development on Android" +
                                " with less code, powerful tools, and intuitive Kotlin APIs.",
                        imagePainter = painterResource(id = R.drawable.bg_compose_background))
                }
            }
        }
    }
}

@Composable
fun Article(title:String, firstDes: String, secondDes: String, imagePainter: Painter, modifier: Modifier = Modifier){
    Column {
        Image(
            painter = imagePainter,
            contentDescription = "compose background",
            modifier = Modifier.fillMaxWidth(),
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp),
        )
        Text(
            text = firstDes,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text =secondDes,
            modifier = modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

