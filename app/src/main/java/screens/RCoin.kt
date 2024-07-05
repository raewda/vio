package screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.violet.R
import com.example.violet.ui.theme.Uncial_Antiqua
import `fun`.randomBall
import `fun`.randomCoin
import java.util.Collections

@Composable
fun RCoin()
{
    Column(
        modifier = Modifier
            .background(color = Color.Black)
            .padding(10.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Column {
            Text(
                text = stringResource(id = R.string.randomCointitle)
                    .uppercase(),
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = colorResource(id = R.color.violet),
                fontFamily = Uncial_Antiqua,
                fontSize = 50.sp
            )
            Text(
                text = stringResource(id = R.string.randomCointext)
                    .uppercase(),
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color.White,
                fontFamily = Uncial_Antiqua,
                fontSize = 30.sp
            )
        }


        Text(text = stringResource(id = randomCoin().rescoin)
                .uppercase(),
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = Color.White,
            fontFamily = Uncial_Antiqua,
            fontSize = 30.sp
        )
    }
}