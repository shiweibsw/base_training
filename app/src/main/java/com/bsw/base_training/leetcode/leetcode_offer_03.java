package com.bsw.base_training.leetcode;

/**
 * 找出数组中重复的数字。
 * <p>
 * <p>
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * <p>
 * 示例 1：
 * <p>
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 *  
 * <p>
 * 限制：
 * <p>
 * 2 <= n <= 100000
 *
 * @Author shiwei
 * @Date 2020/11/24-15:25
 * @Email shiweibsw@gmail.com
 */
class leetcode_offer_03 {
    public int findRepeatNumber(int[] nums) {
        //如果没有重复数字，那么正常排序后，数字i应该在下标为i的位置，所以思路是重头扫描数组，遇到下标为i的数字如果不是i的话，
        // （假设为m),那么我们就拿与下标m的数字交换。在交换过程中，如果有重复的数字发生，那么终止返回ture
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                int t = nums[i];
                nums[i] = nums[t];
                nums[t] = t;
            }
        }
        return -1;


        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // return -1;

        // Map<Integer,Integer> m=new HashMap();
        // for(int i=0;i<nums.length;i++){
        //     if(m.get(nums[i])!=null){
        //         return nums[i];
        //     }else{
        //         m.put(nums[i],1);
        //     }
        // }
        // return -1;
    }
}
