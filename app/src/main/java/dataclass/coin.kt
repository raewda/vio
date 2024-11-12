package dataclass

import com.example.violet.R
import kotlin.random.Random

open class racoin(
    val id: Int,
    val rescoin: Int
)
{
    object coinda : racoin(0, R.string.da)
    object coinnet : racoin(1, R.string.net)

    companion object {
        const val Count: Int = 2
        private val all = listOf(
            racoin.coinda,
            racoin.coinnet
        )
        fun getById(id: Int): racoin {
            all.forEach() { el ->
                if (el.id == id) return el
            }
            return coinda
        }
    }
}

fun randomCoin(): racoin {
    return racoin.getById(Random.nextInt(0,racoin.Count))
}
