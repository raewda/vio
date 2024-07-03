package screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.violet.R
import `fun`.randomBall
import `fun`.randomCoin

@Composable
fun RCoin()
{
    Card(
        shape = RoundedCornerShape(
            topStart = 0.dp,
            topEnd = 0.dp,
            bottomEnd = 0.dp,
            bottomStart = 0.dp,
        ),
        modifier = Modifier
            .fillMaxSize(),
        colors = CardDefaults.cardColors(containerColor = Color.Black),

        ) {
        Text(text = stringResource(id = R.string.randomCointitle),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp, start = 20.dp, end = 20.dp),
            color = Color.White,
            fontSize = 40.sp
        )
        Text(text = stringResource(id = R.string.randomCointext),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, start = 15.dp, end = 15.dp),
            color = Color.White,
            fontSize = 26.sp
        )
        Text(text = stringResource(id = randomCoin().rescoin),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 280.dp, start = 15.dp, end = 15.dp),
            color = Color.White,
            fontSize = 26.sp,
            textAlign = TextAlign.Center)
    }
}