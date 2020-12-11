package com.bsw.base_training.leetcode;


/**
 * 给你一个由大小写英文字母组成的字符串 s 。
 * <p>
 * 一个整理好的字符串中，两个相邻字符 s[i] 和 s[i+1]，其中 0<= i <= s.length-2 ，要满足如下条件:
 * <p>
 * 若 s[i] 是小写字符，则 s[i+1] 不可以是相同的大写字符。
 * 若 s[i] 是大写字符，则 s[i+1] 不可以是相同的小写字符。
 * 请你将字符串整理好，每次你都可以从字符串中选出满足上述条件的 两个相邻 字符并删除，直到字符串整理好为止。
 * <p>
 * 请返回整理好的 字符串 。题目保证在给出的约束条件下，测试样例对应的答案是唯一的。
 * <p>
 * 注意：空字符串也属于整理好的字符串，尽管其中没有任何字符。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "leEeetcode"
 * 输出："leetcode"
 * 解释：无论你第一次选的是 i = 1 还是 i = 2，都会使 "leEeetcode" 缩减为 "leetcode" 。
 * 示例 2：
 * <p>
 * 输入：s = "abBAcC"
 * 输出：""
 * 解释：存在多种不同情况，但所有的情况都会导致相同的结果。例如：
 * "abBAcC" --> "aAcC" --> "cC" --> ""
 * "abBAcC" --> "abBA" --> "aA" --> ""
 * 示例 3：
 * <p>
 * 输入：s = "s"
 * 输出："s"
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length <= 100
 * s 只包含小写和大写英文字母
 *
 * @Author shiwei
 * @Date 2020/12/11-15:18
 * @Email shiweibsw@gmail.com
 */
class leetcode_1544 {
    public String makeGood(String s) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        while (i < sb.length() - 1) {
            int c1 = sb.charAt(i);
            int c2 = sb.charAt(i + 1);
            if (Math.abs(c1 - c2) == 32) {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                if (i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}
