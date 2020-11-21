package com.bsw.base_training.leetcode;

/**
 * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 * <p>
 *  
 * <p>
 * 进阶：
 * <p>
 * 你能否实现线性时间复杂度、仅使用额外常数空间的算法解决此问题?
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [3,0,1]
 * 输出：2
 * 解释：n = 3，因为有 3 个数字，所以所有的数字都在范围 [0,3] 内。2 是丢失的数字，因为它没有出现在 nums 中。
 * 示例 2：
 * <p>
 * 输入：nums = [0,1]
 * 输出：2
 * 解释：n = 2，因为有 2 个数字，所以所有的数字都在范围 [0,2] 内。2 是丢失的数字，因为它没有出现在 nums 中。
 * 示例 3：
 * <p>
 * 输入：nums = [9,6,4,2,3,5,7,0,1]
 * 输出：8
 * 解释：n = 9，因为有 9 个数字，所以所有的数字都在范围 [0,9] 内。8 是丢失的数字，因为它没有出现在 nums 中。
 * 示例 4：
 * <p>
 * 输入：nums = [0]
 * 输出：1
 * 解释：n = 1，因为有 1 个数字，所以所有的数字都在范围 [0,1] 内。1 是丢失的数字，因为它没有出现在 nums 中。
 *  
 * <p>
 * 提示：
 * <p>
 * n == nums.length
 * 1 <= n <= 104
 * 0 <= nums[i] <= n
 * nums 中的所有数字都 独一无二
 *
 * @Author shiwei
 * @Date 2020/11/21-16:49
 * @Email shiweibsw@gmail.com
 */
class leetcode_268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int x : nums) sum += x;
        return (n * (n + 1)) / 2 - sum;

        //哈希
        // Set<Integer> numSet = new HashSet<Integer>();
        // for (int num : nums) numSet.add(num);

        // int expectedNumCount = nums.length + 1;
        // for (int number = 0; number < expectedNumCount; number++) {
        //     if (!numSet.contains(number)) {
        //         return number;
        //     }
        // }
        // return -1;
    }
}
