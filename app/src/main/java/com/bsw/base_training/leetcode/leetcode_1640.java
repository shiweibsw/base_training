package com.bsw.base_training.leetcode;

/**
 * 给你一个整数数组 arr ，数组中的每个整数 互不相同 。另有一个由整数数组构成的数组 pieces，其中的整数也 互不相同 。请你以 任意顺序 连接 pieces 中的数组以形成 arr 。但是，不允许 对每个数组 pieces[i] 中的整数重新排序。
 * <p>
 * 如果可以连接 pieces 中的数组形成 arr ，返回 true ；否则，返回 false 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：arr = [85], pieces = [[85]]
 * 输出：true
 * 示例 2：
 * <p>
 * 输入：arr = [15,88], pieces = [[88],[15]]
 * 输出：true
 * 解释：依次连接 [15] 和 [88]
 *
 * @Author shiwei
 * @Date 2020/11/12-14:00
 * @Email shiweibsw@gmail.com
 */
public class leetcode_1640 {
    public static boolean canFormArray(int[] arr, int[][] pieces) {
        int i = 0;
        int k = 0;
        for (; i < arr.length; i += k) {
            boolean flag = false;
            for (int j = 0; j < pieces.length; j++) {
                if (arr[i] == pieces[j][0]) {
                    for (k = 0; k < pieces[j].length; k++) {
                        if (arr[i + k] != pieces[j][k]) {
                            return false;
                        }
                    }
                    flag = true;
                    break;
                }
            }
            if (!flag) break;
        }
        return i == arr.length;
    }
}
