package com.bsw.base_training.leetcode;

/**
 * 剑指 Offer 11. 旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。
 * <p>
 * 示例 1：
 * <p>
 * 输入：[3,4,5,1,2]
 * 输出：1
 * 示例 2：
 * <p>
 * 输入：[2,2,2,0,1]
 * 输出：0
 *
 * @Author shiwei
 * @Date 2020/11/14-16:07
 * @Email shiweibsw@gmail.com
 */
class leetcode_offer_11 {
    public int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (numbers[mid] < numbers[high]) {
                high = mid;
            } else if (numbers[mid] > numbers[high]) {
                low = mid + 1;
            } else {
                high -= 1;
            }
        }
        return numbers[low];
        //解法二：从后向前遍历一遍即可
//        for (int i = numbers.length-1; i >= 1; i--)
//            if(numbers[i]<numbers[i-1])
//                return numbers[i];
//        return numbers[0];
    }
}
