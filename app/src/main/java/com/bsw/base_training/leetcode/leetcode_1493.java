package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/11/17-11:54
 * @Email shiweibsw@gmail.com
 * 给你一个二进制数组 nums ，你需要从中删掉一个元素。
 * <p>
 * 请你在删掉元素的结果数组中，返回最长的且只包含 1 的非空子数组的长度。
 * <p>
 * 如果不存在这样的子数组，请返回 0 。
 * <p>
 * 阿里笔试第一题
 */
class leetcode_1493 {
    public int longestSubarray(int[] nums) {
        //方法一 经典滑动窗口
        int len = nums.length;
        int left = 0;
        int right = 0;
        int cnt = 0;
        int max = 0;
        for (; right < len; right++) {
            if (nums[right] == 0) {
                cnt += 1;
            }
            while (cnt > 1) {
                if (nums[left++] == 0) {
                    cnt--;
                }
            }
            max = Math.max(max, right - left);
        }
        return max;


        //方法二
        // int result=getMaxLength(nums);
        // if(result==nums.length){
        //     return nums.length-1;
        // }
        // for(int i=1;i<nums.length-1;i++){
        //     if(nums[i]==0&&nums[i-1]==1&&nums[i+1]==1){
        //         nums[i]=1;
        //         int len=getMaxLength(nums)-1;
        //         result=Math.max(len,result);
        //         nums[i]=0;
        //     }
        // }
        // return result;
    }

    private int getMaxLength(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                int curr = 1;
                int j = i + 1;
                while (j < nums.length) {
                    if (nums[j] == 1) {
                        curr++;
                        j++;
                    } else {
                        i = j;
                        break;
                    }
                }
                max = Math.max(max, curr);
            }
        }
        return max;
    }

}
