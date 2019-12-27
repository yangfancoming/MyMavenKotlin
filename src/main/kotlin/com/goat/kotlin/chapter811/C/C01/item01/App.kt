package com.goat.kotlin.chapter811.C.C01.item01


import org.junit.Test


class App{

    @Test
    fun test1() {
        var calculator = TranficCalculator(TaxiStrategy())
        println("${calculator.calculateName()}16公里的价格为：${calculator.calculatePrice(16)}元")
        calculator = TranficCalculator(BusStrategy())
        println("${calculator.calculateName()}16公里的价格为：${calculator.calculatePrice(16)}元")
        calculator = TranficCalculator(SubwayStrategy())
        println("${calculator.calculateName()}16公里的价格为：${calculator.calculatePrice(16)}元")
    }


}