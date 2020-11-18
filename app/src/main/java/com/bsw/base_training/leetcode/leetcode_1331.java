package com.bsw.base_training.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给你一个整数数组 arr ，请你将数组中的每个元素替换为它们排序后的序号。
 * <p>
 * 序号代表了一个元素有多大。序号编号的规则如下：
 * <p>
 * 序号从 1 开始编号。
 * 一个元素越大，那么序号越大。如果两个元素相等，那么它们的序号相同。
 * 每个数字的序号都应该尽可能地小。
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：arr = [40,10,20,30]
 * 输出：[4,1,2,3]
 * 解释：40 是最大的元素。 10 是最小的元素。 20 是第二小的数字。 30 是第三小的数字。
 * 示例 2：
 * <p>
 * 输入：arr = [100,100,100]
 * 输出：[1,1,1]
 * 解释：所有元素有相同的序号。
 * 示例 3：
 * <p>
 * 输入：arr = [37,12,28,9,100,56,80,5,12]
 * 输出：[5,3,4,2,8,6,7,1,3]
 *
 * @Author shiwei
 * @Date 2020/11/18-17:07
 * @Email shiweibsw@gmail.com
 */
class leetcode_1331 {
    public int[] arrayRankTransform(int[] arr) {
        int[] tmpArr = new int[arr.length];
        System.arraycopy(arr, 0, tmpArr, 0, arr.length);
        Arrays.sort(tmpArr);
        Map<Integer, Integer> cache = new HashMap<Integer, Integer>();
        int calibrate = 0;//因为结果要保证相同元素的下标相同，如果前边的元素出现了重复元素的话，后边的下标都需要减去出现重复元素的个数。
        for (int i = 0; i < tmpArr.length; i++) {
            if (cache.get(tmpArr[i]) == null) {
                cache.put(tmpArr[i], i - calibrate);
            } else {
                calibrate++;
            }
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = cache.get(arr[i]) + 1;
        }
        return result;
    }
}
