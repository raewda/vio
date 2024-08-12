package dataclass

import android.view.animation.Animation
import androidx.core.graphics.drawable.toDrawable
import com.example.violet.R

open class ranball(
    val id: Int,
    val resball : Int,
    val anim : Int
) {
    object ballda: ranball(0, R.string.da, R.raw.ranball_yes)
    object ballnet: ranball(1, R.string.net, R.raw.ranball_no)
    object ballvozmojno: ranball(2, R.string.vozmojno, R.raw.ranball_maybe)
    object ballskoreevsegonet: ranball(3, R.string.skoreevsegonet, R.raw.ranball_most_likely_no)
    object ballskoreevsegoda: ranball(4, R.string.skoreevsegoda, R.raw.ranball_most_likely_yes)

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