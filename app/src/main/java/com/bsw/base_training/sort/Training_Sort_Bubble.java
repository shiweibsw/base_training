package com.bsw.base_training.sort;

import static com.bsw.base_training.Utils.swap;

/**
 * 冒泡排序练习
 *
 * @Author shiwei
 * @Date 2020/11/9-19:46
 * @Email shiweibsw@gmail.com
 */
class Training_Sort_Bubble {

    /**
     * @param a
     * @param n 数组大小
     */
    private void bubbleSort(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }


    private void bubbleSort1(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }

    private void bubbleSort2(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }

    private void bubbleSort3(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }

    private void bubbleSort4(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }


    private void bubbleSort5(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a[j], a[j + 1]);
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }

    private void bubbleSort6(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a[j], a[j + 1]);
                    flag = true;
                }
            }
            if (!flag) return;
        }
    }

    private void bubbleSort7(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a[j], a[j + 1]);
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }

    private void bubbleSort8(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a[j], a[j + 1]);
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }

    private void bubbleSort9(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }

    private void bubbleSort10(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a[j + 1], a[j]);
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }

}
