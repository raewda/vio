package dataclass

import com.example.violet.R

open class coin(
    val id: Int,
    val rescoin: Int
)
{
    object coinda : coin(0, R.string.da)
    object coinnet : coin(1, R.string.net)

    companion object {
        const val Count: Int = 2
        private val all = listOf(
            coin.coinda,
            coin.coinnet
        )
        fun getById(id: Int): coin {
            all.forEach() { el ->
                if (el.id == id) return el
            }
            return coinda
        }
    }
}