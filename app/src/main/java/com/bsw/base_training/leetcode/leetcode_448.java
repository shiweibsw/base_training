package com.bsw.base_training.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 * <p>
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 * <p>
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [4,3,2,7,8,2,3,1]
 * <p>
 * 输出:
 * [5,6]
 *
 * @Author shiwei
 * @Date 2020/12/21-13:12
 * @Email shiweibsw@gmail.com
 */
class leetcode_448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int newIndex = Math.abs(nums[i]) - 1;
            if (nums[newIndex] > 0) {
                nums[newIndex] *= -1;
            }
        }
        List<Integer> result = new LinkedList<Integer>();
        for (int i = 1; i <= nums.length; i++) {
            if (nums[i - 1] > 0) {
                result.add(i);
            }
        }
        return result;


//        List<Integer> res=new ArrayList();
//        Arrays.sort(nums);
//        for(int i=1;i<=nums.length;i++){
//            if(i!=nums[i-1]){
//                if(!res.contains(nums[i-1])){
//                    res.add(nums[i-1]);
//                }else{
//                    res.remove(Integer.valueOf(nums[i-1]));
//                }
//            }
//        }
//        return res;
    }

}
