package net.ezra.ui.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_POPUP
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP

import net.ezra.R
import net.ezra.navigation.ROUTE_ADD_STUDENTS

@Composable
fun HomeScreen(navController: NavHostController) {

   Box (
       modifier = Modifier
           .fillMaxSize()
           .background(Color.Cyan),
   ){

       


       LazyColumn (
           modifier = Modifier.fillMaxSize()
       ){
           item {

             Column(
                 modifier = Modifier
                     .fillMaxSize()
                     .padding(10.dp)
             ) {

                 Spacer(modifier = Modifier.height(20.dp))


                 Row {
                   Column(modifier = Modifier.absolutePadding(80.dp)) {
                       Button(onClick = { navController.navigate(ROUTE_PRODUCTS) }) {
                           Text(text = "Cleaning Schedule",color=Color.White)
                       }
                   }
               }

Spacer(modifier = Modifier.height(20.dp))

                 Row {
                     Text(text = "Selected Cleaning",color=Color.Black)
                 }

                 Spacer(modifier = Modifier.height(20.dp))

                 Row(modifier=Modifier.padding(30.dp)) {

                     Card(
                         modifier = Modifier
                             .height(95.dp)
                             .clickable { navController.navigate(ROUTE_ADD_STUDENTS){popUpTo(
                                 ROUTE_HOME){inclusive=true}} }
                             .width(120.dp),
                         colors = CardDefaults.cardColors(Color(0xffcbe9ea)),
                         elevation = CardDefaults.cardElevation(5.dp)
                     ) {
                         Row(
                             modifier = Modifier
                                 .height(100.dp)
                                 .background(Color.Transparent)
                         ) {
                             Column (modifier = Modifier.absolutePadding(0.dp)){
                                 Image(painter = painterResource(id = R.drawable.img3), contentDescription = "",modifier=Modifier.fillMaxSize())
                             }
                         }
                         
                         Row {
                             Text(text = "Initial cleaning")

                         }



                     }

Spacer(modifier = Modifier.width(30.dp))

                     Card(
                         modifier = Modifier
                             .height(95.dp)
                             .clickable { navController.navigate(ROUTE_ADD_STUDENTS){popUpTo(
                                 ROUTE_HOME){inclusive=true}} }
                             .width(120.dp),
                         colors = CardDefaults.cardColors(Color(0xffcbe9ea)),
                         elevation = CardDefaults.cardElevation(5.dp)
                     ) {
                         Row(
                             modifier = Modifier.height(100.dp)
                         ) {
                             Column (modifier = Modifier.absolutePadding(0.dp)){
                                 Image(painter = painterResource(id = R.drawable.img4), contentDescription = "",modifier=Modifier.fillMaxSize())
                             }
                         }

                         Row {
                             Text(text = "Upkeep Cleaning")
                         }

                     }

                 }



                 Spacer(modifier = Modifier.height(50.dp))

                 Row {

                     Text(text = "Selected Frequency",color= Color.Black)
                 }
                 Spacer(modifier = Modifier.height(30.dp))

                 Row(modifier = Modifier.padding(30.dp)) {
                     Card(
                         modifier = Modifier
                             .height(30.dp)
                             .width(60.dp),
                         colors = CardDefaults.cardColors(Color(0xff29ced4)),
                         border = BorderStroke(1.dp, Color.Yellow),
                                 elevation = CardDefaults.cardElevation(5.dp),
                         shape = CutCornerShape(10),

                         ) {

                         Text(text = "Daily", color = Color.White)

                     }
Spacer(modifier = Modifier.width(25.dp))

                     Card(
                         modifier = Modifier
                             .height(30.dp)
                             .width(60.dp),
                         colors = CardDefaults.cardColors(Color(0xff29ced4)),
                         elevation = CardDefaults.cardElevation(5.dp),
                         shape = CutCornerShape(10),
                         border = BorderStroke(1.dp, Color.Yellow),

                     ) {

                         Text(text = "Weekly", color = Color.White)

                     }
                     Spacer(modifier = Modifier.width(25.dp))

                     Card(
                         modifier = Modifier
                             .height(30.dp)
                             .width(60.dp),
                         colors = CardDefaults.cardColors(Color(0xff29ced4)),
                         elevation = CardDefaults.cardElevation(5.dp),
                         shape = CutCornerShape(10),
                         border = BorderStroke(1.dp, Color.Yellow)

                     ) {

                         Text(text = "Monthly", color = Color.White)

                     }

                 }

                 Spacer(modifier = Modifier.height(20.dp))

                 Row {
                     Text(text = "Selected Extras",color=Color.Black)
                 }

                 Spacer(modifier = Modifier.height(30.dp))

                 Row {

                     Card(
                         modifier = Modifier
                             .height(90.dp)
                             .clickable { navController.navigate(ROUTE_ADD_STUDENTS){popUpTo(
                                 ROUTE_HOME){inclusive=true}} }
                             .width(80.dp),
                         colors = CardDefaults.cardColors(Color(0xffcbe9ea)),
                         elevation = CardDefaults.cardElevation(5.dp)
                     ) {

                         Row(
                             modifier = Modifier
                                 .height(100.dp)
                                 .background(Color.Transparent)
                                 .clickable { navController.navigate(ROUTE_ADD_STUDENTS){popUpTo(
                                     ROUTE_HOME){inclusive=true}} }
                         ) {
                             Column (modifier = Modifier.absolutePadding(0.dp)){
                                 Image(painter = painterResource(id = R.drawable.grdn), contentDescription = "",modifier=Modifier.fillMaxSize())
                             }
                         }

                         Row {
                             Text(text = "Garden")

                         }



                     }

                     Spacer(modifier = Modifier.width(50.dp))

                     Card(
                         modifier = Modifier
                             .height(90.dp)
                             .clickable { navController.navigate(ROUTE_ADD_STUDENTS){popUpTo(
                                 ROUTE_HOME){inclusive=true}} }
                             .width(80.dp),
                         colors = CardDefaults.cardColors(Color(0xffcbe9ea)),
                         elevation = CardDefaults.cardElevation(5.dp)
                     ) {


                         Row(
                             modifier = Modifier
                                 .height(100.dp)
                                 .background(Color.Transparent)

                         ) {
                             Column (modifier = Modifier.absolutePadding(0.dp)){
                                 Image(painter = painterResource(id = R.drawable.kt), contentDescription = "",modifier=Modifier.fillMaxSize())
                             }
                         }

                         Row {
                             Text(text = "Kitchen")

                         }



                     }

                     Spacer(modifier = Modifier.width(50.dp))

                     Card(
                         modifier = Modifier
                             .height(90.dp)
                             .clickable { navController.navigate(ROUTE_ADD_STUDENTS){popUpTo(
                                 ROUTE_HOME){inclusive=true}} }
                             .width(80.dp),
                         colors = CardDefaults.cardColors(Color(0xffcbe9ea)),
                         elevation = CardDefaults.cardElevation(5.dp)
                     ) {


                         Row(
                             modifier = Modifier
                                 .height(100.dp)
                                 .background(Color.Transparent)
                         ) {
                             Column (modifier = Modifier.absolutePadding(0.dp)){
                                 Image(painter = painterResource(id = R.drawable.gr), contentDescription = "",modifier=Modifier.fillMaxSize())
                                 Text(text = "Garden")
                             }
                         }

                     }

                 }

                 Spacer(modifier = Modifier.height(40.dp))

                 Row {

                     Card(
                         modifier = Modifier
                             .height(90.dp)
                             .clickable { navController.navigate(ROUTE_ADD_STUDENTS){popUpTo(
                                 ROUTE_HOME){inclusive=true}} }
                             .width(80.dp),
                         colors = CardDefaults.cardColors(Color(0xffcbe9ea)),
                         elevation = CardDefaults.cardElevation(5.dp)
                     ) {
                         Row(
                             modifier = Modifier
                                 .height(100.dp)
                                 .background(Color.Transparent)
                         ) {
                             Column (modifier = Modifier.absolutePadding(0.dp)){
                                 Image(painter = painterResource(id = R.drawable.ln), contentDescription = "",modifier=Modifier.fillMaxSize())
                             }
                         }


                     }

                     Spacer(modifier = Modifier.width(50.dp))

                     Card(
                         modifier = Modifier
                             .height(90.dp)
                             .clickable { navController.navigate(ROUTE_ADD_STUDENTS){popUpTo(
                                 ROUTE_HOME){inclusive=true}} }
                             .width(80.dp),
                         colors = CardDefaults.cardColors(Color(0xffcbe9ea)),
                         elevation = CardDefaults.cardElevation(5.dp)
                     ) {
                         Row(
                             modifier = Modifier
                                 .height(100.dp)
                                 .background(Color.Transparent)
                         ) {
                             Column (modifier = Modifier.absolutePadding(0.dp)){
                                 Image(painter = painterResource(id = R.drawable.cp), contentDescription = "",modifier=Modifier.fillMaxSize())
                             }
                         }


                     }
                     Spacer(modifier = Modifier.width(50.dp))


                     Card(
                         modifier = Modifier
                             .height(90.dp)
                             .clickable { navController.navigate(ROUTE_ADD_STUDENTS){popUpTo(
                                 ROUTE_HOME){inclusive=true}} }
                             .width(80.dp),
                         colors = CardDefaults.cardColors(Color(0xffcbe9ea)),
                         elevation = CardDefaults.cardElevation(5.dp)
                     ) {


                         Row(
                             modifier = Modifier
                                 .height(100.dp)
                                 .background(Color.Transparent)
                         ) {
                             Column (modifier = Modifier.absolutePadding(0.dp)){
                                 Image(painter = painterResource(id = R.drawable.bt), contentDescription = "",modifier=Modifier.fillMaxSize())
                             }
                         }


                     }















                 }


             }


           }


       }

   }

}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}

