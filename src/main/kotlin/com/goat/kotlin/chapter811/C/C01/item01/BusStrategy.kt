package com.goat.kotlin.chapter811.C.C01.item01


/**
 * Created by Administrator on 2019/12/27.
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/12/27---11:22
 */
class BusStrategy : CalculateStrategy {

    override fun calculateName(): String ="公交策略"

    override fun calculatePrice(km: Int): Int {
        // 超过10公里的总距离
        var extraTotal = km - 10
        // 超过的距离是5公里的倍数
        var extraFactor = extraTotal / 5
        // 超过的距离对5公里取余
        var fraction = extraTotal % 5
        // 计算价格
        var price = 1 + extraFactor * 1
        return if (fraction > 0) ++price else price
    }
}