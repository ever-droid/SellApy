package com.example.sellapy.ui.theme.screens.dashboard
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sellapy.R
import com.example.sellapy.navigation.ROUT_DETAILS
import com.example.sellapy.navigation.ROUT_HOME
import com.example.sellapy.navigation.ROUT_INTENT
import com.example.sellapy.ui.theme.lightorange
import com.example.sellapy.ui.theme.orange


@Composable
fun DashboardScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(orange),
        horizontalAlignment = Alignment.CenterHorizontally,


    ) {
        Spacer(modifier = Modifier.height(30.dp), )
        Image(
            painter = painterResource(id = R.drawable.product),
            contentDescription = "Product",
            modifier = Modifier.size(100.dp)
        )

        Spacer(modifier = Modifier.height(10.dp), )
        Text(
            text = "Your Best Online Shop",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center

        )

        Spacer(modifier = Modifier.height(10.dp), )

        Column {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(700.dp),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
                colors = CardDefaults.cardColors(lightorange)

            ) {
                //Row
                Row(modifier = Modifier.padding(20.dp)) {

                    Card(
                        modifier = Modifier
                            .clickable { navController.navigate(ROUT_DETAILS) }
                            .width(160.dp)
                            .height(180.dp)
                    ) {
                        Column {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            )
                            {

                                Image(
                                    painter = androidx.compose.ui.res.painterResource(id = com.example.sellapy.R.drawable.homedash),
                                    contentDescription = "",
                                    modifier = androidx.compose.ui.Modifier.size(100.dp)
                                )

                            }
                            Text(
                                text = "Home",
                                fontSize = 20.sp,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.fillMaxWidth()
                            )

                        }

                    }

                    Spacer(modifier = Modifier.width(30.dp), )


                    Card(
                        modifier = Modifier.clickable { navController.navigate(ROUT_HOME) }
                            .width(160.dp)
                            .height(180.dp)
                    ) {
                        Column {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            )
                            {

                                Image(
                                    painter = androidx.compose.ui.res.painterResource(id = com.example.sellapy.R.drawable.chat),
                                    contentDescription = "",
                                    modifier = androidx.compose.ui.Modifier.size(100.dp)
                                )

                            }
                            Text(
                                text = "messages",
                                fontSize = 20.sp,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.fillMaxWidth()
                            )

                        }

                    }

                }
                //End of Row1


                //Row
                Row(modifier = Modifier.padding(20.dp)) {

                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                    ) {
                        Column {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            )
                            {

                                Image(
                                    painter = androidx.compose.ui.res.painterResource(id = com.example.sellapy.R.drawable.clothes),
                                    contentDescription = "",
                                    modifier = androidx.compose.ui.Modifier.size(100.dp)
                                )

                            }
                            Text(
                                text = "Clothes",
                                fontSize = 20.sp,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.fillMaxWidth()
                            )

                        }

                    }
                    Spacer(modifier = Modifier.width(30.dp), )


                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                    ) {
                        Column {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            )
                            {

                                Image(
                                    painter = androidx.compose.ui.res.painterResource(id = com.example.sellapy.R.drawable.settings),
                                    contentDescription = "",
                                    modifier = androidx.compose.ui.Modifier.size(100.dp)
                                )

                            }
                            Text(
                                text = "Settings",
                                fontSize = 20.sp,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.fillMaxWidth()
                            )

                        }

                    }

                }
                //End of Row1

                //Row
                Row(modifier = Modifier.padding(20.dp)) {

                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                    ) {
                        Column {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            )
                            {

                                Image(
                                    painter = androidx.compose.ui.res.painterResource(id = com.example.sellapy.R.drawable.user),
                                    contentDescription = "",
                                    modifier = androidx.compose.ui.Modifier.size(100.dp)
                                )

                            }
                            Text(
                                text = "Profile",
                                fontSize = 20.sp,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.fillMaxWidth()
                            )

                        }

                    }
                    Spacer(modifier = Modifier.width(30.dp), )


                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                    ) {
                        Column {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            )
                            {

                                Image(
                                    painter = androidx.compose.ui.res.painterResource(id = com.example.sellapy.R.drawable.intent),
                                    contentDescription = "",
                                    modifier = androidx.compose.ui.Modifier.size(100.dp)
                                )

                            }
                            Text(
                                text = "Intent",
                                fontSize = 20.sp,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.fillMaxWidth() .clickable { navController.navigate(
                                    ROUT_INTENT) },

                            )

                        }

                    }

                }
                //End of Row1








            }


        }




    }



}
@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview() {
    DashboardScreen(rememberNavController())
}
