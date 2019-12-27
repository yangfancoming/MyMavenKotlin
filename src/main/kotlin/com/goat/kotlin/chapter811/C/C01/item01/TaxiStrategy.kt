package com.goat.kotlin.chapter811.C.C01.item01


/**
 * Created by Administrator on 2019/12/27.
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/12/27---11:23
 */
class TaxiStrategy : CalculateStrategy {
    override fun calculateName(): String ="出租车策略"
    override fun calculatePrice(km: Int): Int = km*2
}