package screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.util.toRange
import androidx.navigation.NavController
import com.example.violet.R
import com.example.violet.ui.theme.Uncial_Antiqua
import java.util.Collections
import kotlin.math.absoluteValue
import androidx.compose.foundation.lazy.LazyColumn as LazyColumn

@Composable
fun RDigits(navController: NavController)
{
    Column(
        modifier = Modifier
            .background(color = Color.Black)
            .padding(10.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Button(
            onClick = { navController.navigate("home") },
            modifier = Modifier
                .size(100.dp, 40.dp)
                .align(Alignment.End),
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
                text = stringResource(id = R.string.randomDigitstitle)
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
                text = stringResource(id = R.string.randomDigitstext)
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

        val from = remember{mutableStateOf("0")}
        val to = remember{mutableStateOf("10")}

        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            OutlinedTextField(
                value = from.value,
                onValueChange = {newText -> from.value = newText},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier
                    .size(100.dp, 60.dp)
                    .padding(end = 20.dp),
                textStyle = TextStyle(
                    fontFamily = Uncial_Antiqua,
                    fontSize = 20.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center
                ),
            )

            OutlinedTextField(
                value = to.value,
                onValueChange = {newText -> to.value = newText},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier
                    .size(100.dp, 60.dp)
                    .padding(start = 20.dp),
                textStyle = TextStyle(
                    fontFamily = Uncial_Antiqua,
                    fontSize = 20.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center
                ),
            )
        }


        //result
        val vybor = remember { mutableStateOf(" ") }
        Text(
            text = vybor.value
                .uppercase(),
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = Color.White,
            fontFamily = Uncial_Antiqua,
            fontSize = 80.sp,
            lineHeight = 35.sp
        )

        val fromValue = from.value.toInt()
        val toValue = to.value.toInt()


        Button(
            onClick = {
                vybor.value = (fromValue..toValue).random().toString()
            },
            modifier = Modifier
                .size(150.dp, 60.dp)
                .align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.violet))
        ) {
            Text(
                text = stringResource(id = R.string.run)
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