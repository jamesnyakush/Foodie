package com.foodie.presentation.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.foodie.R

@Composable
fun RecipeItem() {
    val paddingModifier = Modifier.padding(16.dp)

    Card(
        modifier = paddingModifier,
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        )
    ) {

        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data("https://img.buzzfeed.com/thumbnailer-prod-us-east-1/video-api/assets/250396.jpg")
                .crossfade(true)
                .build(),
            placeholder = painterResource(R.drawable.ic_launcher_background),
            contentDescription = stringResource(R.string.app_name),
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .height(250.dp)
                .clip(
                    RoundedCornerShape(0.dp, 0.dp, 10.dp, 10.dp)
                )
        )

        Column(
            modifier = paddingModifier.fillMaxWidth(),
        ) {
            Text(
                text = "Chicken Tikka Masala",
                modifier = Modifier.padding(0.dp, 8.dp),
                color = Color.Black,
                fontSize = 18.sp,
                fontStyle = FontStyle.Normal,
                style = MaterialTheme.typography.titleLarge
            )
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Whether you’re trying to be healthy, pulling an all-nighter, or just trying to get through the day, protein-packed snacks are your best friends.",
                color = Color.Gray,
            )
        }
    }

}

@Preview
@Composable
fun RecipeItemPreview() {
   // RecipeItem()
}