package com.bsw.base_training.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给你一个偶数长度的字符串 s 。将其拆分成长度相同的两半，前一半为 a ，后一半为 b 。
 * <p>
 * 两个字符串 相似 的前提是它们都含有相同数目的元音（'a'，'e'，'i'，'o'，'u'，'A'，'E'，'I'，'O'，'U'）。注意，s 可能同时含有大写和小写字母。
 * <p>
 * 如果 a 和 b 相似，返回 true ；否则，返回 false 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "book"
 * 输出：true
 * 解释：a = "bo" 且 b = "ok" 。a 中有 1 个元音，b 也有 1 个元音。所以，a 和 b 相似。
 * 示例 2：
 * <p>
 * 输入：s = "textbook"
 * 输出：false
 * 解释：a = "text" 且 b = "book" 。a 中有 1 个元音，b 中有 2 个元音。因此，a 和 b 不相似。
 * 注意，元音 o 在 b 中出现两次，记为 2 个。
 * 示例 3：
 * <p>
 * 输入：s = "MerryChristmas"
 * 输出：false
 * 示例 4：
 * <p>
 * 输入：s = "AbCdEfGh"
 * 输出：true
 *  
 * <p>
 * 提示：
 * <p>
 * 2 <= s.length <= 1000
 * s.length 是偶数
 * s 由 大写和小写 字母组成
 *
 * @Author shiwei
 * @Date 2020/12/31-9:49
 * @Email shiweibsw@gmail.com
 */
class leetcode_1704 {
    public boolean halvesAreAlike(String s) {
        int[] arr = new int[128];
        arr['a'] = 1;
        arr['e'] = 1;
        arr['i'] = 1;
        arr['o'] = 1;
        arr['u'] = 1;
        arr['A'] = 1;
        arr['E'] = 1;
        arr['I'] = 1;
        arr['O'] = 1;
        arr['U'] = 1;
        int i = 0;
        int j = s.length() - 1;
        int leftCount = 0;
        int rightCount = 0;
        while (i < j) {
            char cl = s.charAt(i);
            char cr = s.charAt(j);
            if (arr[cl] != 0) {
                leftCount++;
            }
            if (arr[cr] != 0) {
                rightCount++;
            }
            i++;
            j--;
        }
        return leftCount == rightCount;
    }
}
