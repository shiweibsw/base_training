package com.bsw.base_training.leetcode;

/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * <p>
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 * <p>
 * 进阶：
 * <p>
 * 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 * 示例 2：
 * <p>
 * 输入：nums = [5,7,7,8,8,10], target = 6
 * 输出：[-1,-1]
 * 示例 3：
 * <p>
 * 输入：nums = [], target = 0
 * 输出：[-1,-1]
 *  
 * <p>
 * 提示：
 * <p>
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * nums 是一个非递减数组
 * -109 <= target <= 109
 *
 * @Author shiwei
 * @Date 2020/12/1-13:56
 * @Email shiweibsw@gmail.com
 */
class leetcode_34 {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};
        int left = -1;
        int right = -1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] == target) {
                if (mid == 0 || nums[mid - 1] < target) {
                    left = mid;
                    break;
                } else {
                    high = mid - 1;
                }
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (left != -1) {
            low = left;
            high = nums.length - 1;
            while (low <= high) {
                int mid = low + ((high - low) >> 1);
                if (nums[mid] == target) {
                    if (mid == nums.length - 1 || nums[mid + 1] > target) {
                        right = mid;
                        break;
                    } else {
                        low = mid + 1;
                    }
                } else if (nums[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return new int[]{left, right};
    }
}
