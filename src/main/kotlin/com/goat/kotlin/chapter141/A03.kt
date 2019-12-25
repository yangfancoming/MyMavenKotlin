package com.goat.kotlin.chapter141

import org.junit.Test


/**
 * when  相当于 java中的if else 和 switch 的升级版
*/
class A03{

    @Test
    fun test1() {
        println(test1("2"))
        println(test1("sf "))
    }

    private fun test1(str:String):String{
        return when(str){
            "1"-> "天堂"
            "2"-> "地狱"
            "3"-> "哈哈"
            else -> "gg"
        }
    }

    private fun cases(obj: Any) {
        when (obj) {
            1 -> println("One")
            2,3,4 -> println("2-4")
            in 6..10 -> println("6-10")
            "Hello" -> println("Greeting")
            is Long -> println("Long")
            !is String -> println("Not a string")
            else -> println("Unknown")
        }
    }

    @Test
    fun test2() {
        cases("Hello")
        cases(1)
        cases(4)
        cases(9)
        cases(0L)
        cases("hello")
    }
}