package com.bsw.base_training.leetcode;

/**
 * 给你一个正方形矩阵 mat，请你返回矩阵对角线元素的和。
 * <p>
 * 请你返回在矩阵主对角线上的元素和副对角线上且不在主对角线上元素的和。
 * 输入：mat = [[1,2,3],
 *             [4,5,6],
 *             [7,8,9]]
 * 输出：25
 * 解释：对角线的和为：1 + 5 + 9 + 3 + 7 = 25
 * 请注意，元素 mat[1][1] = 5 只会被计算一次。
 *
 * @Author shiwei
 * @Date 2020/11/26-13:55
 * @Email shiweibsw@gmail.com
 */
public class leetcode_1572 {

    public int diagonalSum(int[][] mat) {
        int result = 0;
        int p = 0;
        for (int i = 0; i < mat.length; i++) {
            p = i;
            int q = mat[i].length - 1 - i;
            if (p != q) {
                result += (mat[i][p] + mat[i][q]);
            } else {
                result += mat[i][p];
            }
        }
        return result;
    }

}
