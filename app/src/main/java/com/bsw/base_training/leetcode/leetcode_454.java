package com.bsw.base_training.leetcode;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定四个包含整数的数组列表 A , B , C , D ,计算有多少个元组 (i, j, k, l) ，使得 A[i] + B[j] + C[k] + D[l] = 0。
 * <p>
 * 为了使问题简单化，所有的 A, B, C, D 具有相同的长度 N，且 0 ≤ N ≤ 500 。所有整数的范围在 -228 到 228 - 1 之间，最终结果不会超过 231 - 1 。
 * <p>
 * 例如:
 * <p>
 * 输入:
 * A = [ 1, 2]
 * B = [-2,-1]
 * C = [-1, 2]
 * D = [ 0, 2]
 * <p>
 * 输出:
 * 2
 * <p>
 * 解释:
 * 两个元组如下:
 * 1. (0, 0, 0, 1) -> A[0] + B[0] + C[0] + D[1] = 1 + (-2) + (-1) + 2 = 0
 * 2. (1, 1, 0, 0) -> A[1] + B[1] + C[0] + D[0] = 2 + (-1) + (-1) + 0 = 0
 *
 * @Author shiwei
 * @Date 2020/11/27-13:35
 * @Email shiweibsw@gmail.com
 */
class leetcode_454 {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> m = new HashMap();
        for (int i : A) {
            for (int j : B) {
                m.put(i + j, m.getOrDefault(i + j, 0) + 1);
            }
        }
        int result = 0;
        for (int i : C) {
            for (int j : D) {
                if (m.get(-i + (-j)) != null) {
                    result += m.get(-i + (-j));
                }
            }
        }
        return result;
    }
}
