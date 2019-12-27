package com.goat.kotlin.chapter811.C.C01.item01

/**
 * Created by Administrator on 2019/12/27.
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/12/27---11:19
 */
interface CalculateStrategy {

    fun calculatePrice(km: Int): Int
    fun calculateName():String

}