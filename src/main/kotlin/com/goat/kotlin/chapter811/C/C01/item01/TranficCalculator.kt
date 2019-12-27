package com.goat.kotlin.chapter811.C.C01.item01


/**
 * Created by Administrator on 2019/12/27.
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/12/27---11:24
 */
class TranficCalculator(private val mStrategy: CalculateStrategy){
    fun calculatePrice(km:Int):Int = mStrategy.calculatePrice(km)
    fun calculateName():String = mStrategy.calculateName()
}