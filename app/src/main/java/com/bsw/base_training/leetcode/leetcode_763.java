package com.bsw.base_training.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 字符串 S 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，同一字母最多出现在一个片段中。返回一个表示每个字符串片段的长度的列表。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：S = "ababcbacadefegdehijhklij"
 * 输出：[9,7,8]
 * 解释：
 * 划分结果为 "ababcbaca", "defegde", "hijhklij"。
 * 每个字母最多出现在一个片段中。
 * 像 "ababcbacadefegde", "hijhklij" 的划分是错误的，因为划分的片段数较少。
 *  
 * <p>
 * 提示：
 * <p>
 * S的长度在[1, 500]之间。
 * S只包含小写字母 'a' 到 'z' 。
 *
 * @Author shiwei
 * @Date 2020/12/23-14:26
 * @Email shiweibsw@gmail.com
 */
class leetcode_763 {
    public List<Integer> partitionLabels(String S) {
        int[] arr = new int[26];
        for (int i = 0; i < S.length(); i++) {//记录每个字符最后出现的位置
            arr[S.charAt(i) - 'a'] = i;
        }
        List<Integer> res = new ArrayList();
        int start = 0;
        int end = 0;
        for (int i = 0; i < S.length(); i++) {
            end = Math.max(end, arr[S.charAt(i) - 'a']);
            if (end == i) {
                res.add(end - start + 1);
                start = end + 1;
            }
        }
        return res;

    }
}
