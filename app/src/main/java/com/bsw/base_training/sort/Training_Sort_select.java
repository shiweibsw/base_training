package com.bsw.base_training.sort;

import static com.bsw.base_training.Utils.swap;

/**
 * 选择排序练习
 * 选择排序算法的实现思路有点类似插入排序，也分已排序区间和未排序区间。但是选择排序每次会从未排序区间中找到最小的元素，将其放到已排序区间的末尾。
 *
 * @Author shiwei
 * @Date 2020/11/10-14:15
 * @Email shiweibsw@gmail.com
 */
public class Training_Sort_select {

    public static void selectSort(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = tmp;
        }
    }

    public static void selectSort1(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = tmp;
        }
    }

    private void selectSort2(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = tmp;
        }
    }

    private void selectSort3(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int minInex = 0;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minInex]) {
                    minInex = j;
                }
            }
            int tmp = a[i];
            a[i] = a[minInex];
            a[minInex] = tmp;
        }
    }

    private void selectSort4(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int minIndex = 0;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = tmp;
        }
    }


    private void selectSort5(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int minIndex = 0;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = a[j];
                }
            }
            swap(a[i], a[minIndex]);
        }
    }

    private void selectSort6(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int minindex = 0;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minindex]) {
                    minindex = j;
                }
            }
            swap(a[i], a[minindex]);
        }
    }

    private void selectSort7(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int minIndex = 0;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            swap(a[i], a[minIndex]);
        }
    }
}
