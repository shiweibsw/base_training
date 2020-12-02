package com.bsw.base_training.leetcode;

/**
 * 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 *
 * 示例 1:
 *
 * 输入: [3, 2, 1]
 *
 * 输出: 1
 *
 * 解释: 第三大的数是 1.
 * 示例 2:
 *
 * 输入: [1, 2]
 *
 * 输出: 2
 *
 * 解释: 第三大的数不存在, 所以返回最大的数 2 .
 * 示例 3:
 *
 * 输入: [2, 2, 3, 1]
 *
 * 输出: 1
 *
 * 解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
 * 存在两个值为2的数，它们都排第二。
 *
 * @Author shiwei
 * @Date 2020/12/2-15:29
 * @Email shiweibsw@gmail.com
 */
class leetcode_414 {
    public int thirdMax(int[] nums) {
        if(nums.length==1)return nums[0];
        long f=Long.MIN_VALUE;
        long s=Long.MIN_VALUE;
        long t=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>f){
                t=s;
                s=f;
                f=nums[i];
            }else if(nums[i]==f){
                continue;
            }else if(nums[i]>s){
                t=s;
                s=nums[i];
            }else if(nums[i]==s){
                continue;
            }else if(nums[i]>t){
                t=nums[i];
            }
        }
        if(t==Long.MIN_VALUE){
            return (int)f;
        }else{
            return (int)t;
        }
    }
}
