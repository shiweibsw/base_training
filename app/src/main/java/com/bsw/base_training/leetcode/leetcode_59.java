package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/1/22-15:22
 * @Email shiweibsw@gmail.com
 * 给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 * <p>
 * 示例:
 * <p>
 * 输入: 3
 * 输出:
 * [
 * [ 1, 2, 3 ],
 * [ 8, 9, 4 ],
 * [ 7, 6, 5 ]
 * ]
 * <p>
 */
class leetcode_59 {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int curr = 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                ans[top][i] = curr++;
            }
            for (int i = top + 1; i <= bottom; i++) {
                ans[i][right] = curr++;
            }
            if (left < right && top < bottom) {
                for (int i = right - 1; i > left; i--) {
                    ans[bottom][i] = curr++;
                }
                for (int i = bottom; i > top; i--) {
                    ans[i][left] = curr++;
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return ans;
    }
}
