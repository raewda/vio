package screens

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
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.violet.R
import com.example.violet.ui.theme.Uncial_Antiqua
import dataclass.randomBall
import kotlinx.coroutines.delay

@Composable
fun RBall(navController: NavHostController)
{
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
                text = stringResource(id = R.string.randomBalltitle)
                    .uppercase(),
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = colorResource(id = R.color.violet),
                fontFamily = Uncial_Antiqua,
                fontSize = 50.sp,
                lineHeight = 55.sp
            )
            Text(
                text = stringResource(id = R.string.randomBalltext)
                    .uppercase(),
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color.White,
                fontFamily = Uncial_Antiqua,
                fontSize = 30.sp,
                lineHeight = 35.sp
            )
        }

        SimpleTextField()


        var jopa by remember {
            mutableStateOf(false)
        }
        var qqwerty by remember {
            mutableStateOf(randomBall().anim)
        }

        Ball(jopa, onAnimEnd = { jopa = false }, qqwerty)

        Button(
            onClick = { jopa = true; qqwerty = randomBall().anim},
            modifier = Modifier
                .size(150.dp, 60.dp)
                .align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.violet))

        ) {
            Text(
                text = stringResource(id = R.string.show_me)
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
fun Ball(
    jopa : Boolean,
    onAnimEnd:()->Unit,
    animation : Int
) {
    LaunchedEffect(jopa) {
        if (jopa){
            delay(5000)
            onAnimEnd()
        }
    }
    val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(animation))
    LottieAnimation(
        composition = composition,
        modifier = Modifier.size(400.dp),
        isPlaying = jopa,
        restartOnPlay = true
    )
}

@Composable fun SimpleTextField() {
    var text by remember { mutableStateOf (TextFieldValue( "" )) }
    OutlinedTextField (
            value = text , onValueChange = { newText ->
        text = newText
            },
        modifier = Modifier,
        readOnly = false,
        placeholder = { Text(
            "question",
            color = colorResource(id = R.color.violet),
            fontFamily = Uncial_Antiqua,
            fontSize = 20.sp,
        ) },
        textStyle = TextStyle(
            fontFamily = Uncial_Antiqua,
            fontSize = 20.sp,
            color = Color.White
        ),
        maxLines = 1,
        shape = CircleShape
    )
}