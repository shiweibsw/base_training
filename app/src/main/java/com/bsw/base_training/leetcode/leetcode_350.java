package com.bsw.base_training.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 示例 1：
 * <p>
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2,2]
 * 示例 2:
 * <p>
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[4,9]
 *
 * @Author shiwei
 * @Date 2020/11/12-14:33
 * @Email shiweibsw@gmail.com
 */
class leetcode_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        //解法一 缓存
//        List<Integer> tmp = new ArrayList<Integer>();
//        Map<Integer, Integer> cache = new HashMap<>();
//        for (int i = 0; i < nums2.length; i++) {
//            int j = cache.getOrDefault(nums2[i], 0) + 1;
//            cache.put(nums2[i], j);
//        }
//
//        for (int i = 0; i < nums1.length; i++) {
//            int j = cache.getOrDefault(nums1[i], 0);
//            if (j > 0) {
//                tmp.add(nums1[i]);
//                cache.put(nums1[i], j - 1);
//            }
//        }
//        int[] result = new int[tmp.size()];
//        for (int i = 0; i < tmp.toArray().length; i++) {
//            result[i] = (int) tmp.toArray()[i];
//        }
//        return result;
        //解法二 双指针
        List<Integer> tmp = new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                tmp.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else {
                i++;
            }
        }
        int[] result = new int[tmp.size()];
        for (i = 0; i < tmp.toArray().length; i++) {
            result[i] = (int) tmp.toArray()[i];
        }
        return result;

    }
}
