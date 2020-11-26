package com.bsw.base_training.sort;

/**
 * @Author shiwei
 * @Date 2020/11/23-19:33
 * @Email shiweibsw@gmail.com
 */
class Training_Sort_Heap {
    //==========start==========
    public static void sort(int[] arr) {
        if (arr.length <= 1)
            return;
        buildHeap(arr); // 1、建堆
        int k = arr.length - 1;
        while (k > 0) {
            swap(arr, 0, k);// 将堆顶元素（最大）与最后一个元素交换位置
            heapify(arr, --k, 0);// 将剩下元素重新堆化，堆顶元素变成最大元素
        }
    }

    private static void buildHeap(int[] arr) {
        // (arr.length - 1) / 2 为最后一个叶子节点的父节点,也就是最后一个非叶子节点，依次堆化直到根节点
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            heapify(arr, arr.length - 1, i);
        }
    }

    /**
     * 堆化
     *
     * @param arr 要堆化的数组
     * @param n   最后堆元素下标
     * @param i   要堆化的元素下标
     */
    private static void heapify(int[] arr, int n, int i) {
        while (true) {
            int maxPos = i;
            if (i * 2 + 1 <= n && arr[i] < arr[i * 2 + 1]) {//因为数组下标是从0开始存储数据，所以左子节点+1，右子节点+2
                maxPos = i * 2 + 1;
            }
            if (i * 2 + 2 <= n && arr[i] < arr[i * 2 + 2]) {//因为数组下标是从0开始存储数据，所以左子节点+1，右子节点+2
                maxPos = i * 2 + 2;
            }
            if (maxPos == i) // 最大值是当前位置结束循环
                break;
            swap(arr, maxPos, i);// 与子节点交换位置
            i = maxPos; // 以交换后子节点位置接着往下查找
        }
    }

    //==========end==========
    //==========start==========
    private void sort1(int[] arr) {
        if (arr.length <= 1) return;
        buildHeap1(arr);
        int k = arr.length - 1;
        while (k > 0) {
            swap(arr, 0, k);
            heapify1(arr, --k, 0);
        }
    }

    private void buildHeap1(int[] arr) {
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            heapify1(arr, arr.length - 1, i);
        }
    }

    private void heapify1(int[] arr, int n, int i) {
        while (true) {
            int maxPos = i;
            if ((i * 2 + 1) < n && arr[i] < arr[i * 2 + 1]) {
                maxPos = i * 2 + 1;
            }
            if ((i * 2 + 2) < n && arr[i] < arr[i * 2 + 2]) {
                maxPos = i * 2 + 2;
            }
            if (maxPos == i) {
                break;
            }
            swap(arr, i, maxPos);
            i = maxPos;
        }
    }

    //==========start==========
    private void sort2(int[] arr) {
        if (arr.length <= 1) return;
        buildHeap2(arr);
        int k = arr.length - 1;
        while (k > 0) {
            swap(arr, 0, k);
            heapify2(arr, --k, 0);
        }
    }

    private void buildHeap2(int[] arr) {
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            heapify2(arr, arr.length, i);
        }
    }

    private void heapify2(int[] arr, int n, int i) {
        while (true) {
            int maxPos = i;
            if ((i * 2 + 1) < n && arr[i] < arr[i * 2 + 1]) {
                maxPos = i * 2 + 1;
            }
            if ((i * 2 + 2) < n && arr[i] < arr[i * 2 + 2]) {
                maxPos = i * 2 + 2;
            }
            if (maxPos == i) {
                break;
            }
            swap(arr, i, maxPos);
            i = maxPos;
        }
    }

    //==========end==========
    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
