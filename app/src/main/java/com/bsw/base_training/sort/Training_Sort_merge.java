package com.bsw.base_training.sort;

/**
 * 归并排序练习
 * 思想：如果要排序一个数组，我们先把数组从中间分成前后两部分，然后对前后两部分分别排序，再将排好序的两部分合并在一起，这样整个数组就都有序了。
 * 利用递归的方式
 *
 * @Author shiwei
 * @Date 2020/11/10-15:27
 * @Email shiweibsw@gmail.com
 */
public class Training_Sort_merge {

    //==========start==========
    public static void mergeSort(int[] a, int n) {
        mergeSortInternally(a, 0, n - 1);
    }

    public static void mergeSortInternally(int[] a, int p, int r) {
        if (p >= r) return;
        int q = (p + r) / 2;
        mergeSortInternally(a, p, q);
        mergeSortInternally(a, q + 1, r);
        merge(a, p, q, r);
    }

    public static void merge(int[] a, int p, int q, int r) {
        int i = p;
        int j = q;
        int k = 0;
        int[] tmp = new int[r - p + 1];
        while (i <= q && j <= r) {
            if (a[i] <= a[j]) {
                tmp[k++] = a[i++];
            } else {
                tmp[k++] = a[j++];
            }
        }
        // 判断哪个子数组中有剩余的数据
        int start = i;
        int end = p;
        if (j <= r) {
            start = j;
            end = r;
        }
        while (start <= end) {// 将剩余的数据拷贝到临时数组tmp
            tmp[k++] = a[start++];
        }
        for (i = 0; i <= r - p; i++) {// 将tmp中的数组拷贝回a[p...r]
            a[p + i] = tmp[i];
        }
    }
    //==========end==========

    //==========start==========
    private void mergeSort1(int[] a, int n) {
        mergeSortInternally1(a, 0, n - 1);
    }

    private void mergeSortInternally1(int[] a, int p, int r) {
        if (p >= r) return;//终止条件
        int q = (p + r) / 2;
        mergeSortInternally1(a, p, q);
        mergeSortInternally1(a, q + 1, r);
        merge1(a, p, q, r);
    }

    private void merge1(int[] a, int p, int q, int r) {
        int i = p;
        int j = q;
        int k = 0;
        int[] tmp = new int[r - p + 1];
        while (i <= q && j <= r) {
            if (a[i] <= a[j]) {
                tmp[k++] = a[i++];
            } else {
                tmp[k++] = a[j++];
            }
        }
        int start = i;
        int end = q;
        if (j <= r) {
            start = j;
            end = r;
        }
        while (start <= end) {
            tmp[k++] = a[start++];
        }
        for (i = 0; i <= r - p; i++) {
            a[p + i] = tmp[i];
        }
    }

    //==========end==========

}