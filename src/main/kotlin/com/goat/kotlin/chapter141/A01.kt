package com.goat.kotlin.chapter141

import org.junit.Test


/**
 * 三目运算符
*/
class A01{

    var x = 10
    var y = 20

    // 类似java 三目运算符
    @Test
    fun test1() {
       var max = if (x>y) x else y
       var min = if (x<y) x else y
        println("max = $max, min = $min")

    }

    // 还可以加入代码块
    @Test
    fun test2() {
        var max = if (x>y){
            println("111")
            x
        }else{
            println(222)
            y
        }
        println(max)
    }
}