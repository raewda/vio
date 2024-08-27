package `fun`

import dataclass.coin
import dataclass.ranball
import kotlin.random.Random

fun randomBall(): ranball {
    return ranball.getById(Random.nextInt(0, ranball.Count))
}

fun randomCoin(): coin {
    return coin.getById(Random.nextInt(0,coin.Count))
}

