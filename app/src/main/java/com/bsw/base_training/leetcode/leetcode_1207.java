package com.bsw.base_training.leetcode;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.HashMap;
import java.util.Map;

/**
 * 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
 * <p>
 * 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：arr = [1,2,2,1,1,3]
 * 输出：true
 * 解释：在该数组中，1 出现了 3 次，2 出现了 2 次，3 只出现了 1 次。没有两个数的出现次数相同。
 * 示例 2：
 * <p>
 * 输入：arr = [1,2]
 * 输出：false
 * 示例 3：
 * <p>
 * 输入：arr = [-3,0,1,-3,1,1,1,-3,10,0]
 * 输出：true
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= arr.length <= 1000
 * -1000 <= arr[i] <= 1000
 *
 * @Author shiwei
 * @Date 2020/12/28-9:42
 * @Email shiweibsw@gmail.com
 */
class leetcode_1207 {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Map<Integer, Integer> map1 = new HashMap();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (map1.get(entry.getValue()) != null) {
                return false;
            } else {
                map1.put(entry.getValue(), 0);
            }
        }
        return true;
    }
}
