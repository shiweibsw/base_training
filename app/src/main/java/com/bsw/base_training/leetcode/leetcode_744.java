package com.bsw.base_training.leetcode;

/**
 * 给你一个排序后的字符列表 letters ，列表中只包含小写英文字母。另给出一个目标字母 target，请你寻找在这一有序列表里比目标字母大的最小字母。输入:
 * letters = ["c", "f", "j"]
 * target = "a"
 * 输出: "c"
 * <p>
 * 输入:
 * letters = ["c", "f", "j"]
 * target = "c"
 * 输出: "f"
 * <p>
 * 输入:
 * letters = ["c", "f", "j"]
 * target = "d"
 * 输出: "f"
 *
 * @Author shiwei
 * @Date 2020/11/16-14:37
 * @Email shiweibsw@gmail.com
 */
class leetcode_744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (letters[mid] > target) {
                if (mid == 0 || letters[mid - 1] <= target) return letters[mid];
                else high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return letters[0];
    }
}
