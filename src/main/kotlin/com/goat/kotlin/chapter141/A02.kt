package com.goat.kotlin.chapter141

import org.junit.Test


class A02{

    /**
     * 将字符串转成整数  如果转换失败则返回null
     * 其中 Int 表示只返回 整型不包括null类型
     * 但是 Int? 表示返回整型并且可能为null
    */
    fun str2Int(str:String):Int?{
        try {
            return str.toInt()
        } catch (e: Exception) {
            return null
        }
    }

    @Test
    fun test1() {
        println(str2Int("23"))
    }

    @Test
    fun test2() {
        println(str2Int("ab"))
    }


}