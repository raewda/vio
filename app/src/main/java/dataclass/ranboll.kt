package dataclass

import com.example.violet.R

open class ranball(
    val id: Int,
    val resball : Int
) {
    object ballda: ranball(0, R.string.da)
    object ballnet: ranball(1, R.string.net)
    object ballvozmojno: ranball(2, R.string.vozmojno)
    object ballskoreevsegonet: ranball(3, R.string.skoreevsegonet)
    object ballskoreevsegoda: ranball(4, R.string.skoreevsegoda)

     companion object {
        const val Count: Int = 5
        private val all = listOf(
            ballda, ballnet, ballvozmojno, ballskoreevsegonet, ballskoreevsegoda
        )
        fun getById(id: Int): ranball {
            all.forEach() { el ->
                if (el.id == id) return el
            }
            return ballda
        }
    }
}