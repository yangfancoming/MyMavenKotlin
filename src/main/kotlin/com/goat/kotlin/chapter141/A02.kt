package com.goat.kotlin.chapter141

import org.junit.Test

/**
 * 可空运算符
*/
class A02 {

    /**
     * 将字符串转成整数  如果转换失败则返回null
     * 其中 Int 表示只返回 整型不包括null类型
     * 但是 Int? 表示返回整型并且可能为null
    */
    private fun str2Int(str:String):Int?{
        // 注意这里的 return 精简语法
        return try {
            str.toInt()
        } catch (e: Exception) {
            null
        }
    }

    // 正常转换
    @Test
    fun test1() {
        println(str2Int("23"))
    }

    // 异常转换
    @Test
    fun test2() {
        println(str2Int("ab"))
    }


}