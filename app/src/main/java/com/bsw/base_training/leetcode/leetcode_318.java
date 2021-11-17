package com.bsw.base_training.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author shiwei
 * @Date 2021/11/17-9:39
 * @Email shiweibsw@gmail.com
 */
class leetcode_318 {
    public int maxProduct(String[] words) {
        Map<Integer, Map<Character, Integer>> cache = new HashMap<Integer, Map<Character, Integer>>();
        for (int i = 1; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            Map<Character, Integer> m = new HashMap<Character, Integer>();
            for (char c : chars) {
                if (m.get(c) == null) {
                    m.put(c, 1);
                }
            }
            cache.put(i, m);
        }
        int result = 0;
        for (int i = 0; i < words.length; i++) {
            int l1 = words[i].length();
            for (int j = i + 1; j < words.length; j++) {
                char[] chars = words[j].toCharArray();
                boolean solider = false;
                for (char c : chars) {
                    if (cache.get(j).get(c) != null) {
                        solider = true;
                        break;
                    }
                }
                if (!solider) {
                    result = Math.max(result, l1 * words[j].length());
                }
            }
        }
        return result;
    }
}
