package com.example.violet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.violet.ui.theme.Uncial_Antiqua
import screens.Home
import screens.RBall
import screens.RCoin
import screens.RWheelFortune

class MainActivity : ComponentActivity(
) {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = "knopkastart"
                ){
                composable("knopkastart"){
                    Action(navController)
                }
                composable("home"){
                    Home(navController)
                }
                composable("rball"){
                    RBall()
                }
                composable("rcoin"){
                    RCoin()
                }
                composable("rwheelfortune"){
                    RWheelFortune()
                }
            }
        }
    }
}

@Composable
fun Action(navController: NavHostController){
    Column(
        modifier = Modifier
            .background(color = Color.Black)
            .padding(10.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    )
    {
        Text(
            text = stringResource(id = R.string.me)
                .uppercase(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 80.dp),
            color = Color.White,
            textAlign = TextAlign.Start,
            fontSize = 20.sp,
            fontFamily = Uncial_Antiqua
        )
        Image(
            painter = painterResource(id = R.drawable.violeticon), contentDescription = "icon",
            modifier = Modifier
                .size(300.dp)
                .clip(CircleShape)
        )
        Text(
            text = stringResource(id = R.string.hi)
                .uppercase(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp, top = 20.dp),
            color = Color.White,
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontFamily = Uncial_Antiqua
        )
        Button(onClick = { navController.navigate("home")},
            modifier = Modifier
                .size(200.dp, 80.dp),
            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.violet))

        ) {
            Text(
                text = stringResource(id = R.string.button_ma)
                    .uppercase(),
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color.White,
                fontFamily = Uncial_Antiqua,
                fontSize = 40.sp
            )
        }
    }
}

