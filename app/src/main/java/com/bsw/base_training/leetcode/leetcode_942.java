package com.bsw.base_training.leetcode;

/**
 * 给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。
 * <p>
 * 返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有：
 * <p>
 * 如果 S[i] == "I"，那么 A[i] < A[i+1]
 * 如果 S[i] == "D"，那么 A[i] > A[i+1]
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入："IDID"
 * 输出：[0,4,1,3,2]
 * 示例 2：
 * <p>
 * 输入："III"
 * 输出：[0,1,2,3]
 * 示例 3：
 * <p>
 * 输入："DDI"
 * 输出：[3,2,0,1]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= S.length <= 10000
 * S 只包含字符 "I" 或 "D"。
 *
 * @Author shiwei
 * @Date 2020/12/31-10:09
 * @Email shiweibsw@gmail.com
 */
class leetcode_942 {
    public int[] diStringMatch(String S) {
        int len = S.length();
        int[] res = new int[len + 1];
        int min = 0;
        int max = len;
        for (int i = 0; i < len; i++) {
            char c = S.charAt(i);
            if (c == 'I') {
                res[i] = min++;
            } else {
                res[i] = max--;
            }
        }
        res[len] = max;
        return res;
    }
}
