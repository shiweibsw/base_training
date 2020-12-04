package com.bsw.base_training.leetcode;

/**
 * 小区便利店正在促销，用 numExchange 个空酒瓶可以兑换一瓶新酒。你购入了 numBottles 瓶酒。
 * <p>
 * 如果喝掉了酒瓶中的酒，那么酒瓶就会变成空的。
 * <p>
 * 请你计算 最多 能喝到多少瓶酒。
 *
 * @Author shiwei
 * @Date 2020/12/4-16:39
 * @Email shiweibsw@gmail.com
 */
class leetcode_1518 {
    int result = 0;

    public int numWaterBottles(int numBottles, int numExchange) {
        result += numBottles;
        numWaterBottlesLeft(numBottles, numExchange);
        return result;
    }

    public void numWaterBottlesLeft(int numBottles, int numExchange) {
        int e = numBottles / numExchange;
        if (e == 0) return;
        int f = numBottles % numExchange;
        result += e;
        numWaterBottlesLeft(e + f, numExchange);
    }
}
