package com.bsw.base_training.leetcode;


import java.util.Arrays;

/**
 * 给你两个数组，arr1 和 arr2，
 * <p>
 * arr2 中的元素各不相同
 * arr2 中的每个元素都出现在 arr1 中
 * 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末尾。
 * <p>
 * 示例：
 * <p>
 * 输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
 * 输出：[2,2,2,1,4,3,3,9,6,7,19]
 *
 * @Author shiwei
 * @Date 2020/11/12-11:55
 * @Email shiweibsw@gmail.com
 */
public class leetcode_1122 {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            int value = arr2[i];
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == value) {
                    if (k == j) {
                        k++;
                    } else {
                        int tmp = arr1[j];
                        arr1[j] = arr1[k];
                        arr1[k] = tmp;
                        k++;
                    }
                }
            }
        }
        Arrays.sort(arr1, k, arr1.length );
        return arr1;
    }
}
