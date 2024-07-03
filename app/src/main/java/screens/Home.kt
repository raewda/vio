package screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.violet.R


@Composable
fun Home()
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
    )
    {
        Column(
            modifier = Modifier
                .padding(top = 150.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                SmallFloatingActionButton(onClick = {},
                    modifier = Modifier
                        .padding(top = 10.dp),
                    shape = RoundedCornerShape(
                        topStart = 10.dp,
                        topEnd = 10.dp,
                        bottomEnd = 10.dp,
                        bottomStart = 10.dp,
                    ),
                    colorResource(id = R.color.violet)
                ) {
                    Icon(Icons.Filled.KeyboardArrowLeft, "tuda")
                }
                SmallFloatingActionButton(onClick = {},
                    modifier = Modifier
                        .padding(top = 10.dp),
                    shape = RoundedCornerShape(
                        topStart = 10.dp,
                        topEnd = 10.dp,
                        bottomEnd = 10.dp,
                        bottomStart = 10.dp,
                    ),
                    colorResource(id = R.color.violet)
                ) {
                    Icon(Icons.Filled.KeyboardArrowRight, "tuda")
                }
            }
            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                SmallFloatingActionButton(onClick = {},
                    modifier = Modifier
                        .padding(top = 10.dp),
                    shape = RoundedCornerShape(
                        topStart = 10.dp,
                        topEnd = 10.dp,
                        bottomEnd = 10.dp,
                        bottomStart = 10.dp,
                    ),
                    colorResource(id = R.color.violet)
                ) {
                    Icon(Icons.Filled.ArrowBack, "tuda")
                }
                SmallFloatingActionButton(onClick = {},
                    modifier = Modifier
                        .padding(top = 10.dp),
                    shape = RoundedCornerShape(
                        topStart = 10.dp,
                        topEnd = 10.dp,
                        bottomEnd = 10.dp,
                        bottomStart = 10.dp,
                    ),
                    colorResource(id = R.color.violet)
                ) {
                    Icon(Icons.Filled.ArrowForward, "tuda")
                }
            }
        }
    }
}