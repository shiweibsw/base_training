package com.bsw.base_training.leetcode;

/**
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * <p>
 *  
 * <p>
 * 说明：
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * 输出：[1,2,2,3,5,6]
 *
 * @Author shiwei
 * @Date 2020/11/18-16:48
 * @Email shiweibsw@gmail.com
 */
class leetcode_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        for (int i = m; i < n + m; i++) {
            int value = nums2[i - m];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (nums1[j] > value) {
                    nums1[j + 1] = nums1[j];
                } else {
                    break;
                }
            }
            nums1[j + 1] = value;
        }

    }
}
