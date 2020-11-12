package com.bsw.base_training.leetcode;

/**
 * 给你一个数字数组 arr 。
 * <p>
 * 如果一个数列中，任意相邻两项的差总等于同一个常数，那么这个数列就称为 等差数列 。
 * <p>
 * 如果可以重新排列数组形成等差数列，请返回 true ；否则，返回 false
 * <p>
 * 输入：arr = [3,5,1]
 * 输出：true
 * 解释：对数组重新排序得到 [1,3,5] 或者 [5,3,1] ，任意相邻两项的差分别为 2 或 -2 ，可以形成等差数列。
 *
 * @Author shiwei
 * @Date 2020/11/11-19:53
 * @Email shiweibsw@gmail.com
 */
class leetcode_1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        quickSort(arr, arr.length);
        int dc = arr[1] - arr[0];
        for (int i = 0; i <= arr.length - 2; i++) {
            if (arr[i + 1] - arr[i] != dc) {
                return false;
            }
        }
        return true;

    }

    private void quickSort(int[] a, int n) {
        quickSortInternally(a, 0, n - 1);
    }

    private void quickSortInternally(int[] a, int p, int r) {
        if (p >= r) return;
        int q = partition(a, p, r);
        quickSortInternally(a, p, q - 1);
        quickSortInternally(a, q + 1, r);
    }

    private int partition(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                if (i == j) {
                    i++;
                } else {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                    i++;
                }
            }
        }
        int tmp = a[i];
        a[i] = a[r];
        a[r] = tmp;
        return i;
    }
}
