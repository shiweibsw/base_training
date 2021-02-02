package com.bsw.base_training.sort;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 插入排序练习
 * 插入算法的核心思想是取未排序区间中的元素，在已排序区间中找到合适的插入位置将其插入，并保证已排序区间数据一直有序。重复这个过程，直到未排序区间中元素为空，算法结束
 *
 * @Author shiwei
 * @Date 2020/11/10-13:53
 * @Email shiweibsw@gmail.com
 */
class Training_sort_insert {

    public int calculate(String s) {
        int ans = -1;
        int num = 0;
        boolean ji = false;
        Queue<Integer> queue = new LinkedBlockingQueue<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                if (Character.isDigit(c)) {
                    num = num * 10 + (c - '0');
                } else {
                    num=0;
                }
            }
        }
        return ans;
    }

    private void insertSort(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

    private void insertSort1(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

    private void insertSort2(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }


    private void insertSort3(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

    private void insertSort4(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

    private void insertSort5(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int j = i - 1;
            int value = a[i];
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

    private void insertSort6(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }


    private void insertSort7(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

    private void insertSort8(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

    private void insertSort9(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

    private void insertSort10(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

    private void insertSort11(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

    private void insertSort12(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int j = i - 1;
            int value = a[i];
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

    private void insertSort13(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

}
