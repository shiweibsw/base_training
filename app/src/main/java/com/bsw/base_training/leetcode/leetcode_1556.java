package com.bsw.base_training.leetcode;

import java.util.ArrayList;

/**
 * @Author shiwei
 * @Date 2020/12/16-11:21
 * @Email shiweibsw@gmail.com
 */
class leetcode_1556 {
    public String thousandSeparator(int n) {
        int count = 0;
        StringBuffer ans = new StringBuffer();
        do {
            int cur = n % 10;
            n /= 10;
            ans.append(cur);
            ++count;
            if (count % 3 == 0 && n != 0) {
                ans.append('.');
            }
        } while (n != 0);
        ans.reverse();
        return ans.toString();
    }
}
