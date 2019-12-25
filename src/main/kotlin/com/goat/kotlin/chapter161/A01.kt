package com.goat.kotlin.chapter161

import org.junit.Test


class A01{

    // 有返回自函数
    @Test
    fun test1() {
        print(sum(10, 5))
        print(sum2(10, 5))
    }

    private fun sum(a:Int, b:Int):Int{
        return a + b
    }

    /**
     *  当函数只有单个表达式时，可以省略花括号，直接写在 = 之后，如果返回值类型可由编译器推断出来，也可以省略返回值类型：
     *  省略花括号和返回值类型后的函数形式
    */
    private fun sum2(a:Int,b:Int) = a + b


    // 无返回值函数
    @Test
    fun test2() {
        myPrint(10,5)
    }

    private fun myPrint(a:Int,b:Int):Unit{
        print("$a + $b = ${a+b}")
    }

}