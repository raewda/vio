package screens

import android.widget.Toast
import androidx.compose.animation.core.estimateAnimationDurationMillis
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.violet.R
import com.example.violet.ui.theme.Uncial_Antiqua
import `fun`.randomBall
import `fun`.randomCoin
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import java.util.Collections

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RWheelFortune(navController: NavController) {
    Column(
        modifier = Modifier
            .background(color = Color.Black)
            .padding(10.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Button(
            onClick = { navController.navigate("home") },
            modifier = Modifier
                .size(100.dp, 40.dp)
                .align(Alignment.Start),
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
                fontSize = 15.sp
            )
        }
        Column {
            Text(
                text = stringResource(id = R.string.randomWheelFortunetitle)
                    .uppercase(),
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = colorResource(id = R.color.violet),
                fontFamily = Uncial_Antiqua,
                fontSize = 45.sp,
                lineHeight = 55.sp
            )
            Text(
                text = stringResource(id = R.string.randomWheelFortunetext)
                    .uppercase(),
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color.White,
                fontFamily = Uncial_Antiqua,
                fontSize = 30.sp,
                lineHeight = 25.sp
            )
        }
        val resfortune = remember { mutableStateListOf<TextFieldValue>() }
        val t = remember { mutableStateOf(" ") }
        val context = LocalContext.current
        var linda by remember {
            mutableStateOf(false)
        }

        Row() {
            SmallFloatingActionButton(
                onClick = {
                    resfortune.add(TextFieldValue(""))
                },
                modifier = Modifier
                    .padding(top = 10.dp),
                shape = CircleShape,
                colorResource(id = R.color.violet)
            )
            {
                Icon(Icons.Filled.Add, "plus")
            }
            LazyColumn(
                modifier = Modifier
                    .fillMaxHeight(0.4f)
            ) {
                items(resfortune.reversed()) { el ->
                    OutlinedTextField(
                        value = el,
                        onValueChange = { new ->
                            Collections.replaceAll(resfortune, el, new)
                        },
                        modifier = Modifier
                            .padding(top = 10.dp, start = 15.dp, end = 20.dp),
                        enabled = true,
                        readOnly = false,
                        placeholder = { Text("enter text",
                            color = colorResource(id = R.color.violet),
                            fontFamily = Uncial_Antiqua,
                            fontSize = 20.sp,) },
                        textStyle = TextStyle(
                            fontFamily = Uncial_Antiqua,
                            fontSize = 20.sp,
                            color = Color.White
                        ),
                        maxLines = 1,
                        shape = CircleShape

                    )
                }
            }
        }

        RWF(linda, onAnimEnd = { linda = false}, animation = R.raw.fortune)

        Text(
            text = t.value
                .uppercase(),
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = Color.White,
            fontFamily = Uncial_Antiqua,
            fontSize = 30.sp,
            lineHeight = 35.sp
        )

        Button(
            onClick = {
                if (resfortune.size != 0) {
                    linda = true
                    t.value = resfortune.random().text
                }
                else {
                    Toast.makeText(context, "no options", Toast.LENGTH_SHORT).show()
                }
            },

            modifier = Modifier
                .size(150.dp, 60.dp)
                .align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.violet)),

        ) {
            Text(
                text = stringResource(id = R.string.spin)
                    .uppercase(),
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color.White,
                fontFamily = Uncial_Antiqua,
                fontSize = 20.sp
            )
        }
    }
}


@Composable
fun RWF(
    linda : Boolean,
    onAnimEnd:()->Unit,
    animation : Int
) {

    val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(animation))
    LottieAnimation(
        composition = composition,
        modifier = Modifier
            .size(200.dp),
        isPlaying = linda,
        restartOnPlay = true
    )

    LaunchedEffect(linda) {
        if (linda){
            delay(5000)
            onAnimEnd()
        }
    }

}


