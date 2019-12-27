package com.goat.kotlin.chapter811.C.C01.item01


/**
 * Created by Administrator on 2019/12/27.
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/12/27---11:23
 */
class SubwayStrategy : CalculateStrategy {
    override fun calculateName(): String ="地铁策略"
    override fun calculatePrice(km: Int): Int =
            when (km) {
                in 1..6 -> 3
                in 6..12 -> 4
                in 12..22 -> 5
                in 22..32 -> 6
                else -> 7
            }
}