package com.bsw.base_training.string;

/**
 * @Author shiwei
 * @Date 2020/11/30-14:30
 * @Email shiweibsw@gmail.com
 */
class Training_RK {

    public static int rK(String a, String b) {
        int m = a.length(), n = b.length(), s = 0, j;
        int[] hash = new int[m - n + 1];
        int[] table = new int[26];
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        for (j = 0; j < 26; j++) {//将26的次方存储在一个表里，取的时候直接用,虽然溢出，但没啥问题
            table[j] = s;
            s *= 26;
        }
        //计算主串中每个与模式串长度相等的串的hash值
        for (int i = 0; i < m - n; i++) {
            s = 0;
            for (j = 0; j < n; j++) {
                s += (a1[i + j] - 'a') * table[n - 1 - j];
            }
            hash[i] = s;
        }
        s = 0;
        //计算模式串的hash值
        for (j = 0; j < n; j++) {
            s += (b1[j] - 'a') * table[n - 1 - j];
        }
        //开始匹配
        for (j = 0; j < m - n + 1; j++) {
            if (hash[j] == s) {
                return j;
            }
        }
        return -1;
    }

}
