package com.bsw.base_training.leetcode;

/**
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 * <p>
 * 输入为 非空 字符串且只包含数字 1 和 0。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 * <p>
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *  
 * <p>
 * 提示：
 * <p>
 * 每个字符串仅由字符 '0' 或 '1' 组成。
 * 1 <= a.length, b.length <= 10^4
 * 字符串如果不是 "0" ，就都不含前导零。
 *
 * @Author shiwei
 * @Date 2020/12/16-14:52
 * @Email shiweibsw@gmail.com
 */
class leetcode_67 {
    public String addBinary(String a, String b) {
        int idx = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || idx == 1) {
            int n1 = i >= 0 ? a.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? b.charAt(j) - '0' : 0;
            int curr = n1 + n2 + idx;
            if (curr >= 2) {
                sb.append(curr - 2);
                idx = 1;
            } else {
                sb.append(curr);
                idx = 0;
            }
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}
