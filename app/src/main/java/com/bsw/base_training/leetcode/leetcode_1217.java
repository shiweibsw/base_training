package com.bsw.base_training.leetcode;

/**
 * 数轴上放置了一些筹码，每个筹码的位置存在数组 chips 当中。
 * <p>
 * 你可以对 任何筹码 执行下面两种操作之一（不限操作次数，0 次也可以）：
 * <p>
 * 将第 i 个筹码向左或者右移动 2 个单位，代价为 0。
 * 将第 i 个筹码向左或者右移动 1 个单位，代价为 1。
 * 最开始的时候，同一位置上也可能放着两个或者更多的筹码。
 * <p>
 * 返回将所有筹码移动到同一位置（任意位置）上所需要的最小代价。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：chips = [1,2,3]
 * 输出：1
 * 解释：第二个筹码移动到位置三的代价是 1，第一个筹码移动到位置三的代价是 0，总代价为 1。
 * 示例 2：
 * <p>
 * 输入：chips = [2,2,2,3,3]
 * 输出：2
 * 解释：第四和第五个筹码移动到位置二的代价都是 1，所以最小总代价为 2。
 * <p>
 * 思路：
 * 1.首先注意：
 * chips数组内存放的是某个筹码的位置
 * <p>
 * 2.注意题目中的这句话
 * 将第 i 个筹码向左或者右移动 2 个单位，代价为 0。
 * <p>
 * 那么：
 * （1）如果一个筹码位置为奇数（如5），我便可以通过多次无代价的移动将其变为1
 * （2）如果一个筹码位置为偶数（如4），我便可以通过多次无代价的移动将其变为0
 * <p>
 * 经过处理，最终数组可以变成只有0和1这两种值。
 * 如果0比较多，就把所有的1移动到0处；
 * 如果1比较多，就把所有的0移动到1处；
 * <p>
 * 即返回0和1中出现次数较少的那个值对应的次数即可。
 * <p>
 * 具体实现阶段：
 * 我们不需要对数组元素操作，只需要判断数组某元素的奇偶性即可
 * <p>
 * 所以，整体只需要遍历一次数组，记录奇数和偶数的个数，较小的那个值即为结果
 *
 * @Author shiwei
 * @Date 2020/11/21-10:34
 * @Email shiweibsw@gmail.com
 */
class leetcode_1217 {
    public int minCostToMoveChips(int[] position) {
        int zeroCount = 0;
        int oneCount = 0;
        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) {
                zeroCount++;
            } else {
                oneCount++;
            }
        }
        return zeroCount > oneCount ? oneCount : zeroCount;
    }
}
