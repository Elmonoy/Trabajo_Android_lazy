package com.example.trabajo__android.screen



import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import com.example.trabajo__android.R

@Composable
fun Main1(navegation: NavHostController){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray)){
        PaginacionScreen(navegation)
    }
}
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PaginacionScreen(navegation:NavHostController) {
    val pagerState = rememberPagerState(initialPage = 0) {
        3
    }
    Box(modifier = Modifier) {
        HorizontalPager(state = pagerState) { page ->
            when (page) {
                0 -> Content()
                1 -> Content1()
                2->  Content2(navegation)



            }
        }
    }
}
@Composable
fun Content1() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {

        Filas2(img = R.drawable.granja2, Descript = "Este es el icono")
        Text(
            text = "Impacto de la Agricultura en el Medio Ambiente",
            modifier = Modifier
                .fillMaxWidth()
                .padding(2.dp),
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline
        )
        Box {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "La agricultura tiene un impacto significativo en el medio ambiente."+
                            "La deforestación, la pérdida de biodiversidad, la contaminación del"+
                            "agua y del suelo, y las emisiones de gases de efecto invernadero son algunos de los problemas asociados."+
                            "Sin embargo, la adopción de prácticas agrícolas sostenibles puede mitigar estos efectos.",
                    modifier = Modifier.padding(20.dp),
                    textAlign = TextAlign.Justify,
                    fontSize = 14.sp
                )
            }
        }
    }

}
@Composable
fun Filas2(
    img: Int,
    Descript: String,
    modifier: Modifier = Modifier.fillMaxWidth(),
    imgModifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = img),
            contentDescription = Descript,
            modifier = imgModifier
                .width(300.dp)
                .height(300.dp)
        )

    }
}


