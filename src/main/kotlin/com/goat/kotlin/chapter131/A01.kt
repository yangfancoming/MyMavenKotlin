package com.goat.kotlin.chapter131

import org.junit.Test

/**
 * Created by Administrator on 2019/12/25.
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/12/25---13:18
 *
 * var| val 变量名［：类型］ ［＝初始值］
 */
class A01{

    @Test
    fun test1() {
        // var 声明变量 可以被修改
        var name = "张三"
        println(name)
    }

    @Test
    fun test2() {
        // val 声明常量 不能被修改
        val name = "张三"
        println(name)
    }
}