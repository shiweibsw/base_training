package com.bsw.base_training.leetcode;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.HashMap;
import java.util.Map;

/**
 * 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
 * <p>
 * 返回重复了 N 次的那个元素。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[1,2,3,3]
 * 输出：3
 * 示例 2：
 * <p>
 * 输入：[2,1,2,5,3,2]
 * 输出：2
 * 示例 3：
 * <p>
 * 输入：[5,1,5,2,5,3,5,4]
 * 输出：5
 *
 * @Author shiwei
 * @Date 2020/12/25-8:53
 * @Email shiweibsw@gmail.com
 */
class leetcode_961 {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public int repeatedNTimes(int[] A) {
        Map<Integer, Integer> count = new HashMap();
        for (int x : A) {
            if (count.getOrDefault(x, 0) != 0) {
                return x;
            }
            count.put(x, count.getOrDefault(x, 0) + 1);
        }
        throw null;
    }
}
