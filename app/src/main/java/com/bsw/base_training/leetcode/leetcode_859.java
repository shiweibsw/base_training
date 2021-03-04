package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/3/4-13:40
 * @Email shiweibsw@gmail.com
 * 给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false 。
 * <p>
 * 交换字母的定义是取两个下标 i 和 j （下标从 0 开始），只要 i!=j 就交换 A[i] 和 A[j] 处的字符。例如，在 "abcd" 中交换下标 0 和下标 2 的元素可以生成 "cbad" 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入： A = "ab", B = "ba"
 * 输出： true
 * 解释： 你可以交换 A[0] = 'a' 和 A[1] = 'b' 生成 "ba"，此时 A 和 B 相等。
 * 示例 2：
 * <p>
 * 输入： A = "ab", B = "ab"
 * 输出： false
 * 解释： 你只能交换 A[0] = 'a' 和 A[1] = 'b' 生成 "ba"，此时 A 和 B 不相等。
 * 示例 3:
 * <p>
 * 输入： A = "aa", B = "aa"
 * 输出： true
 * 解释： 你可以交换 A[0] = 'a' 和 A[1] = 'a' 生成 "aa"，此时 A 和 B 相等。
 * 示例 4：
 * <p>
 * 输入： A = "aaaaaaabc", B = "aaaaaaacb"
 * 输出： true
 * 示例 5：
 * <p>
 * 输入： A = "", B = "aa"
 * 输出： false
 *  
 * <p>
 * 提示：
 * <p>
 * 0 <= A.length <= 20000
 * 0 <= B.length <= 20000
 * A 和 B 仅由小写字母构成。
 * <p>
 */
class leetcode_859 {
    public boolean buddyStrings(String A, String B) {
        int lenA = A.length();
        int lenB = B.length();
        if (lenA != lenB) {
            return false;
        }
        if (A.equals(B)) {
            int[] count = new int[26];
            for (int i = 0; i < lenA; i++) {
                count[A.charAt(i) - 'a']++;
            }
            for (int i : count) {
                if (i > 1) return true;
            }
            return false;
        } else {
            int first = -1;
            int second = -1;
            for (int i = 0; i < lenA; i++) {
                if (A.charAt(i) != B.charAt(i)) {
                    if (first == -1) {
                        first = i;
                    } else if (second == -1) {
                        second = i;
                    } else {
                        return false;
                    }
                }
            }
            return second != -1 && A.charAt(first) == B.charAt(second) && A.charAt(second) == B.charAt(first);
        }

    }
}
