package com.bsw.base_training.sort;

import static com.bsw.base_training.Utils.swap;

/**
 * 快速排序练习
 * 思想：如果要排序数组中下标从 p 到 r 之间的一组数据，我们选择 p 到 r 之间的任意一个数据作为 pivot（分区点），
 * 我们遍历 p 到 r 之间的数据，将小于 pivot 的放到左边，将大于 pivot 的放到右边，将 pivot 放到中间。
 * 经过这一步骤之后，数组 p 到 r 之间的数据就被分成了三个部分，前面 p 到 q-1 之间都是小于 pivot 的，中间是 pivot，后面的 q+1 到 r 之间是大于 pivot 的。
 * 根据分治、递归的处理思想，我们可以用递归排序下标从 p 到 q-1 之间的数据和下标从 q+1 到 r 之间的数据，直到区间缩小为 1，就说明所有的数据都有序了。
 *
 * @Author shiwei
 * @Date 2020/11/10-16:55
 * @Email shiweibsw@gmail.com
 */
public class Training_sort_quick {

    //==========start==========

    public static void quickSort(int[] a, int n) {
        quickSortInternally(a, 0, n - 1);
    }

    public static void quickSortInternally(int[] a, int p, int r) {
        if (p >= r) return;
        int q = partition(a, p, r);
        quickSortInternally(a, p, q - 1);
        quickSortInternally(a, q + 1, r);
    }

    public static int partition(int[] a, int p, int r) {
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
        int tmp = a[r];
        a[r] = a[i];
        a[i] = tmp;
        return i;
    }

    //==========end==========

    //==========start==========

    private void quickSort18(int[] a, int n) {
        quickSortInternally18(a, 0, n - 1);
    }

    private void quickSortInternally18(int[] a, int p, int r) {
        if (p >= r) return;
        int q = partition18(a, p, r);
        quickSortInternally18(a, p, q - 1);
        quickSortInternally18(a, q + 1, r);
    }

    private int partition18(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                i++;
            } else {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
                i++;
            }
        }
        int t = a[r];
        a[r] = a[i];
        a[i] = t;
        return i;
    }


    //==========end==========


    //==========start==========
    public static void quickSort17(int[] a, int n) {
        quickSortInternally17(a, 0, n - 1);
    }

    public static void quickSortInternally17(int[] a, int p, int r) {
        if (p >= r) return;
        int q = partition17(a, p, r);
        quickSortInternally17(a, p, q - 1);
        quickSortInternally17(a, q + 1, r);
    }

    public static int partition17(int[] a, int p, int r) {
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
        int tmp = a[r];
        a[r] = a[i];
        a[i] = tmp;
        return i;
    }


    //==========end==========


    //==========start==========
    private void quickSort1(int[] a, int n) {
        quickSortInternally1(a, 0, n - 1);
    }

    private void quickSortInternally1(int[] a, int p, int r) {
        if (p >= r) return;
        int q = partition1(a, p, r);
        quickSortInternally1(a, p, q - 1);
        quickSortInternally1(a, q + 1, r);
    }

    private int partition1(int[] a, int p, int r) {
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


    //==========end==========
    //==========start==========

    private void quickSort2(int[] a, int n) {
        quickSortInternally2(a, 0, n - 1);
    }

    private void quickSortInternally2(int[] a, int p, int r) {
        if (p >= r) return;
        int q = partition2(a, p, r);
        quickSortInternally2(a, p, q - 1);
        quickSortInternally2(a, q + 1, r);
    }

    private int partition2(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                if (i == j) {
                    i++;
                } else {
                    int tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                    i++;
                }
            }
        }
        int tmp = a[r];
        a[r] = a[i];
        a[i] = tmp;
        return i;
    }


    //==========end==========


    //==========start==========

    private void quickSort3(int[] a, int n) {
        quickSortInternally3(a, 0, n - 1);
    }

    private void quickSortInternally3(int[] a, int p, int r) {
        if (p >= r) return;
        int q = partition3(a, p, r);
        quickSortInternally3(a, p, q - 1);
        quickSortInternally3(a, q + 1, r);
    }

    private int partition3(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                if (i == j) {
                    i++;
                } else {
                    swap(a[i], a[j]);
                    i++;
                }
            }
        }
        swap(a[i], a[r]);
        return i;
    }


    //==========end==========
    //==========start==========
    private void quickSort4(int[] a, int n) {
        quickSortInternally4(a, 0, n - 1);
    }

    private void quickSortInternally4(int[] a, int p, int r) {
        if (p >= r) return;
        int q = partition4(a, p, r);
        quickSortInternally4(a, p, q - 1);
        quickSortInternally4(a, q + 1, r);
    }

    private int partition4(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                if (i == j) {
                    i++;
                } else {
                    swap(a[i], a[j]);
                    i++;
                }
            }
        }
        swap(a[i], a[r]);
        return i;
    }


    //==========end==========

    //==========start==========
    private void quickSort5(int[] a, int n) {
        quickSortInternally5(a, 0, n - 1);
    }

    private void quickSortInternally5(int[] a, int p, int r) {
        if (p >= r) return;
        int q = patition5(a, p, r);
        quickSortInternally5(a, p, q - 1);
        quickSortInternally5(a, q + 1, r);
    }

    private int patition5(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                if (i == j) {
                    i++;
                } else {
                    swap(a[i], a[j]);
                    i++;
                }
            }
        }
        swap(a[i], a[r]);
        return i;
    }
    //==========end==========

    //==========start==========


    private void quickSort6(int[] arr, int n) {
        quickSortInternally6(arr, 0, n);
    }

    private void quickSortInternally6(int[] arr, int p, int r) {
        if (p >= r) return;
        int q = partition6(arr, p, r);
        quickSortInternally6(arr, p, q - 1);
        quickSortInternally6(arr, q + 1, r);
    }

    private int partition6(int[] arr, int p, int r) {
        int pivot = arr[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (arr[j] < pivot) {
                if (i == j) {
                    i++;
                } else {
                    swap(arr[i], arr[j]);
                    i++;
                }
            }
        }
        swap(arr[i], arr[r]);
        return i;
    }

    //==========end==========

    //==========start==========

    private void quickSort7(int[] a, int n) {
        quickSortInternally7(a, 0, n - 1);
    }

    private void quickSortInternally7(int[] a, int p, int r) {
        if (p >= r) return;
        int q = patition7(a, p, r);
        quickSortInternally7(a, p, q - 1);
        quickSortInternally7(a, q + 1, r);
    }

    private int patition7(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                if (i == j) {
                    i++;
                } else {
                    swap(a[j], a[i]);
                    i++;
                }
            }
        }
        swap(a[i], a[r]);
        return i;
    }


    //==========end==========
    //==========start==========
    private void quickSort8(int[] a, int n) {
        quickSortInternally8(a, 0, n - 1);
    }

    private void quickSortInternally8(int[] a, int p, int r) {
        if (p >= r) return;
        int q = patition8(a, p, r);
        quickSortInternally8(a, p, q - 1);
        quickSortInternally8(a, q + 1, r);
    }

    private int patition8(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                if (i == j) {
                    i++;
                } else {
                    swap(a[i], a[j]);
                    i++;
                }
            }
        }
        swap(a[i], a[r]);
        return i;
    }

    //==========end==========
    private void quickSort9(int[] a, int n) {
        quickSortInternally9(a, 0, n - 1);
    }

    private void quickSortInternally9(int[] a, int p, int r) {
        if (p >= r) return;
        int q = patation9(a, p, r);
        quickSortInternally9(a, p, q - 1);
        quickSortInternally9(a, q + 1, r);
    }

    private int patation9(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                if (i == j) {
                    i++;
                } else {
                    swap(a[i], a[j]);
                    i++;
                }
            }
        }
        swap(a[i], a[r]);
        return i;
    }

    //==========start==========
    private void quickSort10(int[] a, int n) {
        quickSortInternally10(a, 0, n - 1);
    }

    private void quickSortInternally10(int[] a, int p, int r) {
        if (p >= r) return;
        int q = patition10(a, p, r);
        quickSortInternally10(a, p, q - 1);
        quickSortInternally10(a, q + 1, r);

    }

    private int patition10(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                if (i == j) {
                    i++;
                } else {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        swap(a[i], a[r]);
        return i;
    }

    //==========end==========

    private void quickSort11(int[] a, int n) {
        quickSortInternally11(a, 0, n - 1);
    }

    private void quickSortInternally11(int[] a, int p, int r) {
        if (p >= r) return;
        int q = patition11(a, p, r);
        quickSortInternally11(a, p, q - 1);
        quickSortInternally11(a, q + 1, r);
    }

    private int patition11(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                if (i == j) {
                    i++;
                } else {
                    swap(a[i], a[j]);
                    i++;
                }
            }
        }
        swap(a[r], a[i]);
        return i;
    }

    //==========end==========
    private void quickSort12(int[] a, int n) {
        quickSortInternally12(a, 0, n - 1);
    }

    private void quickSortInternally12(int[] a, int p, int r) {
        if (p >= r) return;
        int q = partition12(a, p, r);
        quickSortInternally12(a, p, q - 1);
        quickSortInternally12(a, q + 1, r);
    }

    private int partition12(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                if (i == j) {
                    i++;
                } else {
                    swap(a[i], a[j]);
                    i++;
                }
            }
        }
        swap(a[r], a[i]);
        return i;
    }

    //==========end============
    //==========start==========
    private void quickSort13(int[] a, int n) {
        quickSortInternally13(a, 0, n - 1);
    }

    private void quickSortInternally13(int[] a, int p, int r) {
        if (p >= r) return;
        int q = partition13(a, p, r);
        quickSortInternally13(a, p, q - 1);
        quickSortInternally13(a, p + 1, r);
    }

    private int partition13(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                if (i == j) {
                    i++;
                } else {
                    swap(a[i], a[j]);
                    i++;
                }
            }
        }
        swap(a[r], a[i]);
        return i;
    }

    //==========end============
    //==========start============

    private void quickSort14(int[] a, int n) {
        quickSortInternally14(a, 0, n - 1);
    }

    private void quickSortInternally14(int[] a, int p, int r) {
        if (p >= r) return;
        int q = partition14(a, p, r);
        quickSortInternally14(a, p, q - 1);
        quickSortInternally14(a, q + 1, r);
    }

    private int partition14(int a[], int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                if (i == j) {
                    i++;
                } else {
                    swap(a[i], a[j]);
                    i++;
                }
            }
        }
        swap(a[r], a[i]);
        return i;
    }

    //==========end============
    //==========start==========
    private void quickSort15(int[] a, int n) {
        quickSortInternally15(a, 0, n - 1);
    }

    private void quickSortInternally15(int[] a, int p, int r) {
        if (p >= r) return;
        int q = parttition15(a, p, r);
        quickSortInternally15(a, p, q - 1);
        quickSortInternally15(a, q + 1, r);
    }

    private int parttition15(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                if (i == j) {
                    i++;
                } else {
                    swap(a[i], a[j]);
                    i++;
                }
            }
        }
        swap(a[r], a[i]);
        return i;
    }


    //==========end============

    private void quickSort16(int[] a, int n) {
        quickSortInternally16(a, 0, n - 1);
    }

    private void quickSortInternally16(int[] a, int p, int r) {
        if (p >= r) return;
        int q = parttition16(a, p, r);
        quickSortInternally16(a, p, q - 1);
        quickSortInternally16(a, q + 1, r);
    }

    private int parttition16(int[] a, int p, int r) {
        int pivot = a[r];//选取当前区间最后一个作为分区点
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                if (i == j) {
                    i++;
                } else {
                    swap(a[i], a[j]);
                    i++;
                }
            }
        }
        swap(a[r], a[i]);
        return i;
    }


    //==========start==========

}
