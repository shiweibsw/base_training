package com.bsw.base_training.leetcode;

/**
 * 给你一个由若干 0 和 1 组成的字符串 s ，请你计算并返回将该字符串分割成两个 非空 子字符串（即 左 子字符串和 右 子字符串）所能获得的最大得分。
 * <p>
 * 「分割字符串的得分」为 左 子字符串中 0 的数量加上 右 子字符串中 1 的数量。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "011101"
 * 输出：5
 * 解释：
 * 将字符串 s 划分为两个非空子字符串的可行方案有：
 * 左子字符串 = "0" 且 右子字符串 = "11101"，得分 = 1 + 4 = 5
 * 左子字符串 = "01" 且 右子字符串 = "1101"，得分 = 1 + 3 = 4
 * 左子字符串 = "011" 且 右子字符串 = "101"，得分 = 1 + 2 = 3
 * 左子字符串 = "0111" 且 右子字符串 = "01"，得分 = 1 + 1 = 2
 * 左子字符串 = "01110" 且 右子字符串 = "1"，得分 = 2 + 1 = 3
 * 示例 2：
 * <p>
 * 输入：s = "00111"
 * 输出：5
 * 解释：当 左子字符串 = "00" 且 右子字符串 = "111" 时，我们得到最大得分 = 2 + 3 = 5
 * 示例 3：
 * <p>
 * 输入：s = "1111"
 * 输出：3
 *  
 * <p>
 * 提示：
 * <p>
 * 2 <= s.length <= 500
 * 字符串 s 仅由字符 '0' 和 '1' 组成。
 * 通过次数7,325提交次数13,690
 *
 * @Author shiwei
 * @Date 2020/12/15-10:17
 * @Email shiweibsw@gmail.com
 */
class leetcode_1422 {
    public int maxScore(String s) {
        int res = 0, cnt1 = 0, cnt0 = 0;        //cnt1统计右边1的个数，同理cnt0左边0的个数
        for (int i = 0; i < s.length(); i++) {
            cnt1 += s.charAt(i) - '0';            //先统计1的个数
        }                                       //由于左右区域的数至少为1，所以i不能等于len-1
        for (int i = 0; i < s.length() - 1; i++) {  //点i分为左右两个区域
            if (s.charAt(i) == '0') cnt0++;      //遇到01就统计，动态更新左右区域01个数
            else cnt1--;
            res = Math.max(res, cnt0 + cnt1);
        }
        return res;
    }
}
