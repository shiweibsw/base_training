package com.bsw.base_training.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author shiwei
 * @Date 2021/11/17-17:17
 * @Email shiweibsw@gmail.com
 * 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
 * <p>
 * 异位词 指由相同字母重排列形成的字符串（包括相同的字符串）。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-all-anagrams-in-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class leetcode_438 {
    //关键点在于直接比较两个int数组 Arrays.equals() ,又解锁一个新技能
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<Integer>();
        int m = s.length();
        int n = p.length();
        if (n > m) return res;
        int[] s_cnt = new int[26];
        int[] p_cnt = new int[26];
        for (int i = 0; i < n; i++) {
            s_cnt[s.charAt(i) - 'a']++;
            p_cnt[p.charAt(i) - 'a']++;
        }
        if (Arrays.equals(s_cnt, p_cnt)) {
            res.add(0);
        }
        for (int i = n; i < m; i++) {
            s_cnt[s.charAt(i) - 'a']++;
            s_cnt[s.charAt(i - n) - 'a']--;
            if (Arrays.equals(s_cnt, p_cnt)) {
                res.add(i - n + 1);
            }
        }
        return res;
    }

}
