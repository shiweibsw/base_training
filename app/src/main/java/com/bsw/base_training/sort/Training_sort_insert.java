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

    private void insertSort25(int[] a, int n) {
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

    private void insertSort24(int[] a, int n) {
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


    private void insertSort23(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                }
            }
            a[j + 1] = value;
        }
    }


    private void insertSort22(int[] a, int n) {
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

    private void insertSort14(int[] a, int n) {
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
            a[j + 1] = a[i];
        }
    }

    private void insertSort15(int[] a, int n) {
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
            a[j + 1] = a[j];
        }
    }

    private void insertSort16(int[] a, int n) {
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
            a[j + 1] = a[i];
        }
    }

    private void insertSort17(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; i--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }


    private void insertSort18(int[] a, int n) {
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

    private void insertSort19(int[] a, int n) {
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

    private void insertSort20(int[] a, int n) {
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


    private void insertSort21(int[] a, int n) {
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
