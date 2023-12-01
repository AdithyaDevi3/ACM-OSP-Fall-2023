package edu.uga.acm.osp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessTimeFilled
import androidx.compose.material.icons.filled.Agriculture
import androidx.compose.material.icons.filled.Apartment
import androidx.compose.material.icons.filled.DirectionsWalk
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.Navigation
import edu.uga.acm.osp.components.BasicContainer
import edu.uga.acm.osp.components.ContextAction
import edu.uga.acm.osp.components.ContextInfo
import edu.uga.acm.osp.components.IconListItem
import edu.uga.acm.osp.components.LabelListItem
import edu.uga.acm.osp.composables.myButton
import edu.uga.acm.osp.nav.Screen
import edu.uga.acm.osp.ui.theme.BusAppTheme
import edu.uga.acm.osp.nav.Navigation
import edu.uga.acm.osp.ui.theme.mapView

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigation()
        }
    }

    // Container with list elements, purely for demonstrative purposes
   // @Preview
    @Composable
    fun testContainer() {
        BasicContainer(
            containerHeader = "Test Header",
        ) {
            testIconListItem()
            testLabelListItem()
            testIconListItem2()
        }
    }

    // Icon list element, purely for demonstrative purposes
    @Composable
    fun testIconListItem() {
        IconListItem(
            header = "Example header!!!",
            subheader = "Example subheader 123456",
            badgeIcon = Icons.Default.Apartment,
            badgeIconDesc = "Residence Hall",
            context1 = {
                ContextInfo(
                    contextText = "Random data 1",
                    contextIcon = Icons.Default.AccessTimeFilled,
                    contextDesc = "Test Description"
                )
            },
            context2 = {
                ContextInfo(
                    contextText = "Random data 2",
                    contextIcon = Icons.Default.DirectionsWalk,
                    contextDesc = "Test Description"
                )
            }
        )
    }

    // Icon list element, purely for demonstrative purposes
    @Composable
    fun testLabelListItem() {
        LabelListItem(
            header = "Maybe a route name!",
            subheader = "Some sort of subheader",
            badgeLabel = "EX",
            context1 = {
                ContextAction(
                    actionIcon = Icons.Default.MoreHoriz,
                    actionDesc = "View Quick Actions",
                    action = {})
            },
            context2 = {
                ContextInfo(
                    contextText = "Some kind of data that's too long...",
                    contextIcon = Icons.Default.Agriculture,
                    contextDesc = "Test Description"
                )
            }
        )
    }

    // Icon list element, purely for demonstrative purposes

    @Composable
    fun testIconListItem2() {
        IconListItem(
            header = "Yet another header!",
            subheader = "Random subheader goes here, yay truncation!",
            badgeIcon = Icons.Default.Restaurant,
            badgeColor = Color(0xFF0AA193),
            badgeIconDesc = "Residence Hall",
            context1 = {
                ContextAction(
                    actionIcon = Icons.Default.MoreHoriz,
                    actionDesc = "View Quick Actions",
                    action = {})
            },
            context2 = {
                ContextAction(
                    actionIcon = Icons.Default.Edit,
                    actionDesc = "View Quick Actions",
                    action = {})
            }
        )
    }


    @Preview
@Composable
fun testNewMapView(){
    val painter = painterResource(id = R.drawable.snelling_dining_commons_bus_stop)
    mapView(painter = painter, modifier = Modifier, string = "")
}
}



//
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            val painter = painterResource(id=R.drawable._60_college_station_bus_stop)
//            val description ="60 College Station Bus Station"
//            val title = "test map"
//
//            Box(modifier = Modifier.fillMaxSize()
//            ) {
//                ImageCard(
//                    painter = painter,
//                    contentDescription = description,
//                    title = title
//                )
//            }
//
//
//        }
//    }
//}
//
//
//@Composable
//fun ImageCard(
//    painter: Painter,
//    contentDescription: String,
//    title: String,
//    modifier: Modifier = Modifier
//) {
//    Card(
//        modifier = modifier.fillMaxSize(),
//        shape = RoundedCornerShape(15.dp),
//        elevation = 20000.dp
//    ) {
//        Box(modifier = Modifier.fillMaxSize()) {
//            Image(
//                painter = painter,
//                contentDescription = contentDescription,
//                contentScale = ContentScale.Crop
//            )
//            Box(modifier = Modifier
//                .fillMaxSize()
//
//                )
//
//            Box(modifier = Modifier
//                .fillMaxSize()
//                .padding(12.dp),
//                contentAlignment = Alignment.BottomStart) {
//                //.sp for fonts .dp for everything else
//                Text(title, style = TextStyle(color = Color.White, fontSize = 16.sp))
//            }
//        }
//    }
//}



