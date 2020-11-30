package com.bsw.base_training.string;

/**
 * BF算法
 *
 * @Author shiwei
 * @Date 2020/11/30-14:15
 * @Email shiweibsw@gmail.com
 */
class Training_BF {

    public static int bF(String a, String b) {
        int m = a.length(), n = b.length(), k;
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        for (int i = 0; i < m - n; i++) {
            k = 0;
            for (int j = 0; j < n; j++) {
                if (a1[i + j] == b1[j]) {
                    k++;
                } else {
                    break;
                }
            }
            if (k == n) {
                return i;
            }
        }
        return -1;
    }
}
