package com.example.sellapy.ui.theme.screens.details

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sellapy.R
import com.example.sellapy.ui.theme.black
import com.example.sellapy.ui.theme.orange


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize() ) {

        // Topappbar
        TopAppBar(
            title = { Text(text = "SellApy", fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.ExtraBold, color = black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(orange),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu", tint = Color.Black)

                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "", tint = Color.Black)

                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "", tint = Color.Black )

                }

            }

        
        )
    // End of top appbar
        Spacer(modifier = Modifier.height(10.dp))

        // Search bar
        var search by remember { mutableStateOf("") }

        OutlinedTextField(
            value = search ,
            onValueChange = { search = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "Search")},
            placeholder = { Text(text = "Browse your product...")}
        )
        //End of searchbar

        Spacer(modifier = Modifier.height(20.dp), )

        Box(modifier = Modifier
            .fillMaxWidth()
            .height(250.dp), contentAlignment = Alignment.Center) {
            Image(
                painter = painterResource(id = R.drawable.top1),
                contentDescription = "",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "favorite",
                tint = Color.Black,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(20.dp)

            )

            Text(
                text = "Your best online shop",
                fontSize = 25.sp,
                color = Color.Black,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.Serif


            )

        }
        // End of image
        Spacer(modifier = Modifier.height(10.dp), )
        
        Text(
            text = "More products",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center

        )
        Spacer(modifier = Modifier.height(10.dp), )
        //Row1
        Row(
            modifier = Modifier.horizontalScroll(rememberScrollState())

        ) {
            Spacer(modifier = Modifier.width(10.dp), )
            //Card
            Card(modifier = Modifier
                .height(160.dp)
                .width(120.dp)
            ) {
                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.top3),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }

            }
            //End of Card
            Spacer(modifier = Modifier.width(10.dp), )

                //Card
            Card(modifier = Modifier
                .height(160.dp)
                .width(120.dp)
            ) {
                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.top2),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }

            }
            //End of Card
            Spacer(modifier = Modifier.width(10.dp), )

            //Card
            Card(modifier = Modifier
                .height(160.dp)
                .width(120.dp)
            ) {
                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.top4),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }

            }
            //End of Card
            Spacer(modifier = Modifier.width(10.dp), )

            //Card
            Card(modifier = Modifier
                .height(160.dp)
                .width(120.dp)
            ) {
                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.top5),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }

            }
            //End of Card
            Spacer(modifier = Modifier.width(10.dp), )
            //Card
            Card(modifier = Modifier
                .height(160.dp)
                .width(120.dp)
            ) {
                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.dress1),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }

            }
            //End of Card
            Spacer(modifier = Modifier.width(10.dp), )
            //Card
            Card(modifier = Modifier
                .height(160.dp)
                .width(120.dp)
            ) {
                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.top3),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }

            }
            //End of Card




        }
        //End of Row1
        Spacer(modifier = Modifier.height(10.dp), )

        Text(
            text = "Additional Information",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center

        )

        Row {
            //Card
            Card(modifier = Modifier
                .height(160.dp)
                .width(200.dp)
            ) {
                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.top3),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }

            }
            //End of Card
            Spacer(modifier = Modifier.width(10.dp), )

            Column {
                Text(text = "Price : ksh2,500 ", fontSize = 20.sp)
                Text(text = "Brand : Zara", fontSize = 18.sp)
                Text(text = "Location : Westlands", fontSize = 18.sp)
                val mContext = LocalContext.current

                Button(onClick = { val callIntent= Intent(Intent.ACTION_DIAL)
                    callIntent.data="tel:0746234416".toUri()
                    mContext.startActivity(callIntent) }, colors = ButtonDefaults.buttonColors(orange)) {
                    Text(text = "Buy", color = Color.Black )
                }

                
                
            }



        }
        








    }



}

@Composable
@Preview(showBackground = true)
fun DetailsScreenPreview(){
    DetailsScreen(rememberNavController())
}
