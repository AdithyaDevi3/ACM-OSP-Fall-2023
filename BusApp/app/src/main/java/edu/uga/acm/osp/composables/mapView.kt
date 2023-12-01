package edu.uga.acm.osp.ui.theme

import android.widget.ImageView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import androidx.compose.foundation.layout.*
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import edu.uga.acm.osp.components.BasicContainer

//
//@Composable
//fun MapView(
//    painter: Painter,
//    modifier: Modifier = Modifier
//    ) {
//    val painter = painterResource(id = R.)
//        Card(
//            modifier = modifier.fillMaxSize(),
//            shape = RoundedCornerShape(15.dp),
//            elevation = 20000.dp
//        ) {
//            Box(modifier = Modifier.fillMaxSize()) {
//                Image(
//                    painter = painter
//                )
//                Box(modifier = Modifier
//                    .fillMaxSize()
//
//                )
//
//                Box(modifier = Modifier
//                    .fillMaxSize()
//                    .padding(12.dp),
//                    contentAlignment = Alignment.BottomStart) {
//                    //.sp for fonts .dp for everything else
//                     }
//            }
//        }
//    }
//
//fun Image(painter: Painter) {
//
//}



@Composable
fun ImageCard(
    painter: Painter,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxSize()
    ) {
        Box(modifier = Modifier) {
            Image(
                painter = painter,
                contentDescription = "bus stop requested",
                modifier = Modifier.fillMaxSize()


            )
//
//                Box(
//                    modifier = Modifier
//
//                )



        }
    }

}




@Composable
fun mapView(painter: Painter, modifier: Modifier, string: String){
    if (string.equals("FULL")) {
        ImageCard(painter = painter, modifier = Modifier)
    } else {
        BasicContainer(containerHeader = "Mapview") {
            ImageCard(painter = painter, modifier = Modifier.fillMaxWidth())
        }
    }
}



//@Preview
//@Composable
//fun testMapView(){
//    val painter = painterResource(id = R.drawable.snelling_dining_commons_bus_stop)
//
//    mapView(painter = painter, modifier = Modifier)
//}