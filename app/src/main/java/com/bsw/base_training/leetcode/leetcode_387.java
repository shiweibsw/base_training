package com.bsw.base_training.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * s = "leetcode"
 * 返回 0
 * <p>
 * s = "loveleetcode"
 * 返回 2
 *  
 * <p>
 * 提示：你可以假定该字符串只包含小写字母。
 *
 * @Author shiwei
 * @Date 2020/11/24-17:26
 * @Email shiweibsw@gmail.com
 */
class leetcode_387 {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Integer, Integer> m = new HashMap();
        for (int i = 0; i < chars.length; i++) {
            int n = (int) (chars[i]);
            if (m.get(n) != null) {
                chars[m.get(n)] = ' ';
                chars[i] = ' ';
            } else {
                m.put(n, i);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                return i;
            }
        }
        return -1;
    }
}
