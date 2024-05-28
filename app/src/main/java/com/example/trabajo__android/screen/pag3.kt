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
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.trabajo__android.R

@Composable
fun Main2(navegation:NavHostController){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray)){
        Content2(navegation)
    }
}

@Composable
fun Content2(navegation: NavHostController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {

        Filas3(img = R.drawable.granja3, Descript = "Este es el icono")
        Text(
            text = "El Futuro de la Agricultura",
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
                    text = "El futuro de la agricultura está orientado hacia la innovación"+
                            "y la sostenibilidad. Se espera que tecnologías como la inteligencia"+
                            "artificial, el Internet de las cosas (IoT) y la robótica jueguen un papel"+
                            "crucial en la modernización de la agricultura.",
                    modifier = Modifier.padding(20.dp),
                    textAlign = TextAlign.Justify,
                    fontSize = 16.sp
                )
                Button(
                    onClick = { navegation.navigate("View_3") },
                    colors = ButtonDefaults.buttonColors(Color.Green)
                ) {
                    Text(
                        text = "Mas Info",
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        fontSize = 16.sp
                    )
                }
            }
        }
    }

}
@Composable
fun Filas3(
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


