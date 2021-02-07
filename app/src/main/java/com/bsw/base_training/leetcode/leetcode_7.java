package com.bsw.base_training.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 *  示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 *
 * @Author shiwei
 * @Date 2020/12/3-19:08
 * @Email shiweibsw@gmail.com
 */
class leetcode_7 {

    public int[][] multiSearch(String big, String[] smalls) {
        int[][] result = new int[smalls.length][];
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (String str : smalls) {
            int id = 0;
            List<Integer> child = new ArrayList();
            while (id != -1) {
                id = big.indexOf(str, id);
                if (id != -1) {
                    child.add(id);
                }
            }
            list.add(child);
        }
        for (int i = 0; i < list.size(); i++) {
            int[] c = new int[list.get(i).size()];
            for (int j = 0; j < list.get(i).size(); j++) {
                c[j] = list.get(i).get(j);
            }
            result[i] = c;
        }
        return result;
    }


    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
