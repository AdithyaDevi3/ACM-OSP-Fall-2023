package edu.uga.acm.osp.nav

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import edu.uga.acm.osp.R
import edu.uga.acm.osp.composables.Header
import edu.uga.acm.osp.composables.displayNavBar
import edu.uga.acm.osp.ui.theme.mapView


@Composable
fun PlannerScreen(navController: NavController) {
    Header("Trip Planner")
    val painter = painterResource(id = R.drawable.snelling_dining_commons_bus_stop)
    mapView(painter = painter, modifier = Modifier, string = "FULL")
    displayNavBar(navController)
}