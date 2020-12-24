package com.bsw.base_training.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 编写一个算法来判断一个数 n 是不是快乐数。
 * <p>
 * 「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。如果 可以变为  1，那么这个数就是快乐数。
 * <p>
 * 如果 n 是快乐数就返回 True ；不是，则返回 False 。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：19
 * 输出：true
 * 解释：
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 *
 * @Author shiwei
 * @Date 2020/12/24-16:08
 * @Email shiweibsw@gmail.com
 */
class leetcode_202 {
    public boolean isHappy(int n) {
        int tmp = 0;
        int res = n;
        Map<Integer, Integer> map = new HashMap();
        while (true) {
            tmp = res;
            res = 0;
            while (tmp != 0) {
                int x = tmp % 10;
                res += (int) Math.pow(x, 2);
                tmp /= 10;
            }
            if (res == 1) {
                return true;
            }
            if (map.get(res) == null) {
                map.put(res, 1);
            } else {
                return false;
            }

        }
    }
}
