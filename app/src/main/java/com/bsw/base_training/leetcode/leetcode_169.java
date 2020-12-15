package com.bsw.base_training.leetcode;

/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 * <p>
 *
 * @Author shiwei
 * @Date 2020/12/15-13:39
 * @Email shiweibsw@gmail.com
 */
class leetcode_169 {
    public int majorityElement(int[] nums) {
        //方法一 排序
        // Arrays.sort(nums);
        // return nums[nums.length/2];
        //方法二 分治
        return majorityElementRec(nums, 0, nums.length - 1);
    }

    private int majorityElementRec(int[] nums, int low, int high) {
        if (low == high) return nums[low];
        int mid = low + ((high - low) >> 1);
        int left = majorityElementRec(nums, low, mid);
        int right = majorityElementRec(nums, mid + 1, high);
        if (left == right) {
            return left;
        }
        int leftCount = countInRange(nums, left, low, mid);
        int rightCount = countInRange(nums, right, mid + 1, high);
        return leftCount > rightCount ? left : right;
    }

    private int countInRange(int[] nums, int num, int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

}
