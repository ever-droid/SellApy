package com.example.sellapy.ui.theme.screens.intent

import android.annotation.SuppressLint
import android.content.Intent
import android.provider.MediaStore
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.sellapy.R
import com.example.sellapy.navigation.ROUT_DETAILS
import com.example.sellapy.ui.theme.black
import com.example.sellapy.ui.theme.orange

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun IntentScreen(navController:NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
        ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val mContext = LocalContext.current

        var selected by remember { mutableIntStateOf(0) }
        Scaffold(
            bottomBar = {
                NavigationBar (
                    containerColor = orange,
                    contentColor = Color.Black){
                    bottomNavItems.forEachIndexed { index, bottomNavItem ->
                        NavigationBarItem(
                            selected = index == selected,
                            onClick = {
                                selected = index
                                navController.navigate(bottomNavItem.route)
                            },
                            icon = {
                                BadgedBox(
                                    badge = {
                                        if (bottomNavItem.badges != 0) {
                                            Badge (containerColor = Color.White){
                                                Text(text = bottomNavItem.badges.toString())
                                            }
                                        } else if (bottomNavItem.hasNews) {
                                            Badge()
                                        }
                                    }
                                ) {
                                    Icon(imageVector =
                                    if (index == selected)
                                        bottomNavItem.selectedIcon
                                    else
                                        bottomNavItem.unselectedIcon,
                                        contentDescription = bottomNavItem.title)
                                }

                            },
                            label = {
                                Text(text = bottomNavItem.title)
                            }
                        )
                    }
                }
            },

            topBar = {

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
            },





            floatingActionButton = {
                FloatingActionButton(
                    onClick = { /*TODO*/ },
                    containerColor = orange) {
                    IconButton(onClick = {

                    }) {
                        Icon(imageVector = Icons.Default.Add,
                            contentDescription = "menu")
                    }
                }
            },
            //Content Section
            content = @Composable{
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    //Body of the screen
                    Spacer(modifier = Modifier.height(80.dp), )


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

                    Spacer(modifier = Modifier.height(10.dp), )
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

                    Spacer(modifier = Modifier.height(5.dp), )

                    //MPESA
                    Button(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                        },
                        colors = ButtonDefaults.buttonColors(orange),
                        shape = RoundedCornerShape(10.dp)

                    ) {
                        Text(text = "Mpesa")

                    }
                    Spacer(modifier = Modifier.height(5.dp), )

                    //EMAIL
                    Button(
                        onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent)
                        },
                        colors = ButtonDefaults.buttonColors(orange),
                        shape = RoundedCornerShape(10.dp)

                    ) {
                        Text(text = "Email")

                    }

                    Spacer(modifier = Modifier.height(5.dp), )

                    //CAMERA
                    Button(
                        onClick = {
                            val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                            if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                                mContext.startActivity(cameraIntent)
                            }else{
                                println("Camera app is not available")
                            }
                        },
                        colors = ButtonDefaults.buttonColors(orange),
                        shape = RoundedCornerShape(10.dp)

                    ) {
                        Text(text = "Camera")

                    }

                    Spacer(modifier = Modifier.height(5.dp), )

                    //CALLS
                    Button(
                        onClick = {val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0720245837".toUri()
                            mContext.startActivity(callIntent) },
                        colors = ButtonDefaults.buttonColors(orange),
                        shape = RoundedCornerShape(10.dp)

                    ) {
                        Text(text = "Call")

                    }

                    Spacer(modifier = Modifier.height(5.dp), )

                    //SMS
                    Button(
                        onClick = {
                            val smsIntent=Intent(Intent.ACTION_SENDTO)
                            smsIntent.data="smsto:0720245837".toUri()
                            smsIntent.putExtra("sms_body","Hello Glory,how was your day?")
                            mContext.startActivity(smsIntent)
                        },
                        colors = ButtonDefaults.buttonColors(orange),
                        shape = RoundedCornerShape(10.dp)

                    ) {
                        Text(text = "Sms")

                    }

                    Spacer(modifier = Modifier.height(5.dp), )

                    //SHARE
                    Button(
                        onClick = { val shareIntent=Intent(Intent.ACTION_SEND)
                            shareIntent.type="text/plain"
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                            mContext.startActivity(Intent.createChooser(shareIntent, "Share")) },
                        colors = ButtonDefaults.buttonColors(orange),
                        shape = RoundedCornerShape(10.dp)

                    ) {
                        Text(text = "Share")

                    }







                }

            }

        )

    }
}



val bottomNavItems = listOf(
    BottomNavItem(
        title = "Home",
        route="home",
        selectedIcon=Icons.Filled.Home,
        unselectedIcon=Icons.Outlined.Home,
        hasNews = false,
        badges=0
    ),



    BottomNavItem(
        title = "Upload",
        route="add_products",
        selectedIcon=Icons.Filled.Add,
        unselectedIcon=Icons.Outlined.Add,
        hasNews = true,
        badges=0
    ),

    BottomNavItem(
        title = "View",
        route="view_products",
        selectedIcon=Icons.Filled.Info,
        unselectedIcon=Icons.Outlined.Info,
        hasNews = true,
        badges=1
    ),


    )



data class BottomNavItem(
    val title :String,
    val route :String,
    val selectedIcon: ImageVector,
    val unselectedIcon :ImageVector,
    val hasNews :Boolean,
    val badges :Int
)



@Composable
@Preview(showBackground = true)
fun IntentScreenPreview(){

    IntentScreen(navController = rememberNavController())

}