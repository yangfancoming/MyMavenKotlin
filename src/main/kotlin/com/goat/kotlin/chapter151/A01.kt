package com.goat.kotlin.chapter151

import org.junit.Test


class A01{

    // 数组遍历
    @Test
    fun test1() {
        var arrayOf = arrayOf(1, 2, 3)
        arrayOf.forEach{x-> println(x)}
        arrayOf.forEach{ print(it) }
    }

    // 数组初始化赋值
    @Test
    fun test2() {
        val asc = Array(5) { i -> (i * i).toString() }
        asc.forEach { println(it) }
    }

    /**
     *  虽然 val 是常量不能改变它的地址  但是可以改变其地址指向的内容
    */
    @Test
    fun test3() {
        // 定义int型数组
        val intArrayOf = intArrayOf(1, 2, 3)
        //intArrayOf = intArrayOf(2,3) // 赋值报错
        // 将数组的第二个元素改成4
        intArrayOf.set(1,4)
        // 遍历数组
        intArrayOf.forEach { x-> print(x) }
    }

}