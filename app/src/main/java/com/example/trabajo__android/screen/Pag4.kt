package com.example.trabajo__android.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.trabajo__android.R


@Composable
fun LazyContent(navigation: NavHostController){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)) {
        Column(Modifier.fillMaxSize()) {
            simpleLazyRow1()
            simpleLazyRow2()

            simpleLazyColumn()}


    }

}

@Composable
fun simpleLazyRow1() {
    val items = listOf(R.drawable.granja3, R.drawable.granja, R.drawable.granja, R.drawable.granja, R.drawable.granja)

    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.CenterStart
    ) {
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
        ) {
            items(items) { item ->
                Image(
                    painter = painterResource(id = item),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(8.dp)
                        .size(100.dp)
                )
            }
        }
    }
}


@Composable
fun simpleLazyRow2() {
    val items = listOf(R.drawable.granja3, R.drawable.granja, R.drawable.granja, R.drawable.granja, R.drawable.granja)

    Box(
        modifier = Modifier,
            
        contentAlignment = Alignment.CenterStart
    ) {
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
        ) {
            items(items) { item ->
                Image(painter = painterResource(id = item), contentDescription =null,
                    modifier =Modifier
                        .padding(8.dp)
                        .width(200.dp)
                        .height(200.dp))

            }
        }
    }
}
@Composable
fun simpleLazyColumn() {
    val items = listOf("")

    LazyColumn(
        modifier = Modifier
            .fillMaxHeight()
            .padding(0.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(items) { item ->

            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "El futuro de la agricultura está orientado hacia la innovación" +
                            "y la sostenibilidad. Se espera que tecnologías como la inteligencia" +
                            "artificial, el Internet de las cosas (IoT) y la robótica jueguen un papel" +
                            "crucial en la modernización de la agricultura. " +
                            "El futuro de la agricultura está orientado hacia la innovación" +
                            "y la sostenibilidad. Se espera que tecnologías como la inteligencia" +
                            "artificial, el Internet de las cosas (IoT) y la robótica jueguen un papel" +
                            "crucial en la modernización de la agricultura." +
                            "El futuro de la agricultura está orientado hacia la innovación" +
                            "y la sostenibilidad. Se espera que tecnologías como la inteligencia" +
                            "artificial, el Internet de las cosas (IoT) y la robótica jueguen un papel" +
                            "crucial en la modernización de la agricultura.",
                    modifier = Modifier.padding(20.dp),
                    textAlign = TextAlign.Justify,
                    fontSize = 16.sp
                )

            }
        }
    }

    @Composable
    fun FilaH(
        img: Int,
        descript: String,
        modifier: Modifier = Modifier.fillMaxWidth(),
        imgmodifier: Modifier = Modifier
    ) {
        Row(
            modifier = modifier,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = descript,
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp)
            )
        }
    }
}
    @Composable
    fun FilaV(
        img: Int,
        descript: String,
        modifier: Modifier = Modifier.fillMaxWidth(),
        imgmodifier: Modifier = Modifier
    ) {
        Row(
            modifier = modifier,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = descript,
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
            )
        }
    }




@Composable
    fun FilaH(
        img : Int,
        descript: String,
        modifier: Modifier = Modifier.fillMaxWidth(),
        imgmodifier: Modifier = Modifier
    ) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = img),
            contentDescription = descript,
            modifier = Modifier
                .width(60.dp)
                .height(60.dp)
        )
    }
}



