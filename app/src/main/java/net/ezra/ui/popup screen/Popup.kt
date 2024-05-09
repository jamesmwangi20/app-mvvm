package net.ezra.ui.popup

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_POPUP
import net.ezra.R
import net.ezra.navigation.ROUTE_PRODUCTS

@Composable
fun popup(navController: NavHostController) {

 Box(

     modifier = Modifier
         .fillMaxSize()
         .background(Color.Cyan),
 ) {
     
     Image(painter = painterResource(id = R.drawable.bckgrnd), contentDescription = "",
         modifier = Modifier
             .fillMaxSize()
             .height(100.dp)
             .fillMaxHeight()
             .fillMaxWidth()


     )

     LazyColumn(
         modifier = Modifier.fillMaxSize()

     ) {
         item {
             
             Column(modifier = Modifier.fillMaxSize()) {

                 Row (modifier = Modifier.fillMaxWidth()){
                     Column {
                         Card(modifier = Modifier.clickable {
                             navController.navigate(ROUTE_HOME){popUpTo(ROUTE_POPUP){inclusive=true} }
                         }) {

                             IconButton(onClick = {  }) {
                                 Image(painter = painterResource(id = R.drawable.icon), contentDescription ="" )
                             }

                             
                         }
                     }
                 }
                 Spacer(modifier = Modifier.height(50.dp))
                 Row(modifier = Modifier
                     .fillMaxWidth()
                     .absolutePadding(25.dp),
                     Arrangement.Center

                 ) {
                    Text(text = "Clean Environment",
                        fontSize = (30.sp),
                        color = Color.White,
                        fontFamily = FontFamily.Serif,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.absolutePadding(0.dp,10.dp,50.dp)

                        )

                 }

                 Row(modifier = Modifier
                     .fillMaxWidth()
                     .absolutePadding(25.dp),
                     Arrangement.Center

                 ) {
                     Text(text = "Healthy life",
                         fontSize = (30.sp),
                         color = Color.White,
                         fontFamily = FontFamily.Serif,
                         fontStyle = FontStyle.Italic,
                         fontWeight = FontWeight.Bold,
                         modifier = Modifier.absolutePadding(0.dp,10.dp,50.dp)

                     )

                 }
                 Row(modifier = Modifier
                     .fillMaxWidth()
                     .absolutePadding(25.dp),
                     Arrangement.Center

                 ) {
                     Text(text = "Book Cleaners at the comfort of you home.",
                         fontSize = (15.sp),
                         color = Color.White,
                         fontFamily = FontFamily.Serif,
                         fontStyle = FontStyle.Italic,
                         modifier = Modifier.absolutePadding(0.dp,10.dp,50.dp)

                     )

                 }







                 Row(modifier = Modifier.absolutePadding(0.dp,150.dp)) {
                     Image(painter = painterResource(id = R.drawable.img5), contentDescription = "", modifier = Modifier
                         .fillMaxSize()
                         .height(200.dp)
                         .width(150.dp))
                 }

                 Row (modifier = Modifier
                     .fillMaxWidth()
                     .absolutePadding(2.dp, 20.dp, 2.dp)

                 ){

                     Card(
                         shape = RoundedCornerShape(30.dp),
                         border = BorderStroke(2.dp, Color.Cyan),
                         modifier = Modifier
                             .width(400.dp)
                             .height(60.dp)
                             .background(Color.Transparent)
                             .fillMaxSize()
                             .absolutePadding(20.dp, 15.dp, 40.dp)
                             .clickable {
                                 navController.navigate(ROUTE_HOME) {
                                     popUpTo(ROUTE_HOME) {
                                         inclusive = true
                                     }
                                 }
                             }
                                 ,

                         colors = CardDefaults.cardColors(
                             containerColor = Color(0xff21eef4)),
                         elevation = CardDefaults.cardElevation(15.dp),


                     ) {
                         
                        Text(text = "Get Started",
                            modifier = Modifier.absolutePadding(110.dp,10.dp,100.dp,15.dp),
                            fontFamily = FontFamily.SansSerif,
                            fontSize = (18.sp),
                            fontWeight = FontWeight.ExtraBold,








                            )


                             





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
    popup(rememberNavController())
}

