package screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.violet.R
import com.example.violet.ui.theme.Uncial_Antiqua


@Composable
fun Home(navController: NavHostController) {
    Column(
        modifier = Modifier
            .background(color = Color.Black)
            .padding(10.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Text(
            text = stringResource(id = R.string.text_home)
                .uppercase(),
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = Color.White,
            fontSize = 35.sp,
            fontFamily = Uncial_Antiqua,
            lineHeight = 55.sp
        )

        Row(
            horizontalArrangement = Arrangement.Center
        ) {
            Column(
                modifier = Modifier
                    .padding(top = 30.dp)
                    .padding(horizontal = 20.dp)
            ) {
                SmallFloatingActionButton(
                    onClick = { navController.navigate("rcoin") },
                    modifier = Modifier
                        .size(120.dp),
                    shape = RoundedCornerShape(
                        topStart = 10.dp,
                        topEnd = 10.dp,
                        bottomEnd = 10.dp,
                        bottomStart = 10.dp,
                    ),
                    containerColor = Color.Transparent
                ) {
                    Image(painter = painterResource(id = R.drawable.coin_start), contentDescription = "Rcoin")
                }
                Text(
                    text = stringResource(id = R.string.coin_home)
                    .uppercase(),
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .size(120.dp),
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontFamily = Uncial_Antiqua
                )
            }

            Column(
                modifier = Modifier
                    .padding(top = 30.dp)
                    .padding(horizontal = 20.dp)
            ) {
                SmallFloatingActionButton(
                    onClick = { navController.navigate("rball") },
                    modifier = Modifier
                        .size(120.dp),
                    shape = RoundedCornerShape(
                        topStart = 10.dp,
                        topEnd = 10.dp,
                        bottomEnd = 10.dp,
                        bottomStart = 10.dp,
                    ),
                    containerColor = Color.Transparent
                ) {
                    Image(painter = painterResource(id = R.drawable.magic_ball), contentDescription = "Rball")
                }
                Text(
                    text = stringResource(id = R.string.ball_home)
                        .uppercase(),
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .size(120.dp),
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontFamily = Uncial_Antiqua
                )
            }
        }
        Row(
            horizontalArrangement = Arrangement.Center
        ) {
            Column(
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                    ) {
                SmallFloatingActionButton(
                    onClick = { navController.navigate("rdigits") },
                    modifier = Modifier
                        .size(120.dp),
                    shape = RoundedCornerShape(
                        topStart = 10.dp,
                        topEnd = 10.dp,
                        bottomEnd = 10.dp,
                        bottomStart = 10.dp,
                    ),
                    containerColor = Color.Transparent
                ) {
                    Image(painter = painterResource(id = R.drawable.digits),
                        contentDescription = "digits")
                }
                Text(
                    text = stringResource(id = R.string.rdigits_home)
                        .uppercase(),
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .size(120.dp),
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontFamily = Uncial_Antiqua,
                    softWrap = true
                )
            }

            Column(
                modifier = Modifier
                    .padding(horizontal = 20.dp)
            ) {
                SmallFloatingActionButton(
                    onClick = { navController.navigate("rwheelfortune") },
                    modifier = Modifier
                        .size(120.dp),
                    shape = RoundedCornerShape(
                        topStart = 10.dp,
                        topEnd = 10.dp,
                        bottomEnd = 10.dp,
                        bottomStart = 10.dp,
                    ),
                    containerColor = Color.Transparent
                ) {
                    Image(painter = painterResource(id = R.drawable.fortune), contentDescription = "Fortune")
                }
                Text(
                    text = stringResource(id = R.string.wheelfortune_home)
                        .uppercase(),
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .size(120.dp),
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontFamily = Uncial_Antiqua,
                    softWrap = true
                )
            }
        }
        Button(
            onClick = { navController.navigate("knopkastart") },
            modifier = Modifier
                .size(150.dp, 60.dp),
            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.violet))

        ) {
            Text(
                text = stringResource(id = R.string.button_back_ma)
                    .uppercase(),
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color.White,
                fontFamily = Uncial_Antiqua,
                fontSize = 25.sp
            )
        }
    }
}