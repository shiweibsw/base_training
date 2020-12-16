package com.bsw.base_training.leetcode;

/**
 * 给定一个字符串来代表一个学生的出勤记录，这个记录仅包含以下三个字符：
 * <p>
 * 'A' : Absent，缺勤
 * 'L' : Late，迟到
 * 'P' : Present，到场
 * 如果一个学生的出勤记录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。
 * <p>
 * 你需要根据这个学生的出勤记录判断他是否会被奖赏。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "PPALLP"
 * 输出: True
 * 示例 2:
 * <p>
 * 输入: "PPALLL"
 * 输出: False
 *
 * @Author shiwei
 * @Date 2020/12/16-16:31
 * @Email shiweibsw@gmail.com
 */
class leetcode_551 {
    public boolean checkRecord(String s) {
        int i = s.indexOf("A");
        if (i != -1)
            i = s.indexOf("A", i + 1);
        return i == -1 && s.indexOf("LLL") == -1;
    }
}
