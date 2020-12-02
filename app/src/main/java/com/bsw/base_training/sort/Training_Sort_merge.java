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

    //==========start==========

    private void mergeSort2(int[] a, int n) {
        mergeSortInternally2(a, 0, n - 1);
    }

    private void mergeSortInternally2(int[] a, int p, int r) {
        if (p >= r) return;
        int q = (p + r) / 2;
        mergeSortInternally2(a, p, q);
        mergeSortInternally2(a, q + 1, r);
        merge2(a, p, q, r);
    }

    private void merge2(int[] a, int p, int q, int r) {
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
        for (i = 0; i < r - p; i++) {
            a[i + p] = tmp[i];
        }



    }
    //==========end==========
    //==========start==========

    private void mergeSort3(int[] a, int n) {
        mergeSortInternally3(a, 0, n - 1);
    }

    private void mergeSortInternally3(int[] a, int p, int r) {
        if (p >= r) return;
        int q = (p + r) / 2;
        mergeSortInternally3(a, p, q);
        mergeSortInternally3(a, q + 1, r);
        merge3(a, p, q, r);
    }

    private void merge3(int[] a, int p, int q, int r) {
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
        for (i = p; i < r - p; i++) {
            a[p + i] = tmp[i];
        }

    }


    //==========end==========


    //==========start==========

    private void mergeSort4(int[] a, int n) {
        mergeSortInternally4(a, 0, n - 1);
    }

    private void mergeSortInternally4(int[] a, int p, int r) {
        if (p >= r) return;
        int q = (r + p) / 2;
        mergeSortInternally4(a, p, q);
        mergeSortInternally4(a, q + 1, r);
        merge4(a, p, q, r);
    }

    private void merge4(int[] a, int p, int q, int r) {
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
        for (i = p; i < r - p; i++) {
            a[i + p] = tmp[i];
        }
    }

    //==========end==========

    //==========start==========

    private void mergeSort5(int[] a, int n) {
        mergeSortInternally5(a, 0, n - 1);
    }

    private void mergeSortInternally5(int[] a, int p, int r) {
        if (p >= r) return;
        int q = (p + r) / 2;
        mergeSortInternally5(a, p, q);
        mergeSortInternally5(a, q + 1, r);
        merge5(a, p, q, r);
    }

    private void merge5(int[] a, int p, int q, int r) {
        int i = p;
        int j = q;
        int k = 0;
        int[] tmp = new int[r - p + 1];
        while (i <= q && j <= r) {
            if (a[i] < a[j]) {
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
        for (i = 0; i < r - p; i++) {
            a[p + i] = tmp[i];
        }
    }
    //==========end==========


    //==========start==========

    private void mergeSort6(int[] a, int n) {
        mergeSortInternally6(a, 0, n - 1);
    }

    private void mergeSortInternally6(int[] a, int p, int r) {
        if (p >= r) return;
        int q = (p + r) / 2;
        mergeSortInternally6(a, p, q);
        mergeSortInternally6(a, q + 1, r);
        merge6(a, p, q, r);
    }

    private void merge6(int[] a, int p, int q, int r) {
        int i = p;
        int j = q;
        int k = 0;
        int[] tmp = new int[r - p + 1];
        while (i <= q && j <= r) {
            if (a[i] < a[j]) {
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
        for (i = 0; i < r - p; i++) {
            a[i + p] = tmp[i];
        }
    }


    //==========end==========
    //==========start==========

    private void mergeSort7(int[] arr, int n) {
        mergeSortInternally7(arr, 0, n - 1);
    }

    private void mergeSortInternally7(int[] arr, int p, int r) {
        if (p >= r) return;
        int q = (p + r) / 2;
        mergeSortInternally7(arr, p, q);
        mergeSortInternally7(arr, q + 1, r);
        merge7(arr, p, q, r);
    }

    private void merge7(int[] arr, int p, int q, int r) {
        int i = p;
        int j = q;
        int k = 0;
        int[] tmp = new int[r - p + 1];
        while (i <= q && j <= r) {
            if (arr[i] < arr[j]) {
                tmp[k++] = arr[i++];
            } else {
                tmp[k++] = arr[j++];
            }
        }
        int start = i;
        int end = q;
        if (j <= r) {
            start = j;
            end = r;
        }
        while (start <= end) {
            tmp[k++] = arr[start++];
        }

        for (i = 0; i < r - p; i++) {
            arr[p + i] = tmp[i];
        }
    }

    //==========end==========

    //==========start==========

    private void mergeSort8(int[] a, int n) {
        mergeSortInternally8(a, 0, n - 1);
    }

    private void mergeSortInternally8(int[] a, int p, int r) {
        if (p >= r) return;
        int q = (p + r) / 2;
        mergeSortInternally8(a, p, q);
        mergeSortInternally8(a, q + 1, r);
        merge8(a, p, q, r);
    }

    private void merge8(int[] a, int p, int q, int r) {
        int i = p;
        int j = q;
        int k = 0;
        int[] tmp = new int[r - p + 1];
        while (i <= p && j <= r) {
            if (a[i] < a[j]) {
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
        for (i = 0; i < r - p; i++) {
            a[i + p] = tmp[i];
        }
    }


    //==========end==========
}
