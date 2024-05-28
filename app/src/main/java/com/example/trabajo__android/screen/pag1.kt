package com.example.trabajo__android.screen

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
import com.example.trabajo__android.R

@Composable
fun Main(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray)){
        Content()
    }
}

@Composable
fun Content() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {

        Filas1(img = R.drawable.granja, Descript = "Este es el icono")
        Text(
            text = "Historia de la Agricultura",
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
                    text = "La agricultura se originó hace aproximadamente 10,000 años durante" +
                            " la Revolución Neolítica. Las primeras evidencias de cultivo de plantas "+
                            "y domesticación de animales se encuentran en el Creciente Fértil., una región"+
                            "que abarca partes de Oriente Medio. Cultivos como el trigo, la cebada y la avena, así"+
                            "como la domesticación de animales como ovejas, cabras y ganado, fueron algunos de los primeros desarrollos agrícolas.",
                    modifier = Modifier.padding(20.dp),
                    textAlign = TextAlign.Justify,
                    fontSize = 13.sp
                )
            }
        }
    }

}
    @Composable
    fun Filas1(
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


@Preview(showSystemUi = true, device = Devices.DEFAULT)

@Composable
fun PreviewMain(){
    Main()
}
