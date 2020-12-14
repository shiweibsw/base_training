package com.bsw.base_training.leetcode;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author shiwei
 * @Date 2020/12/14-15:08
 * @Email shiweibsw@gmail.com
 */
class leetcode_1189 {//balloon

    @RequiresApi(api = Build.VERSION_CODES.N)
    public int maxNumberOfBalloons(String text) {
        int res = Integer.MAX_VALUE;
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'b' || text.charAt(i) == 'a' || text.charAt(i) == 'l' || text.charAt(i) == 'o' || text.charAt(i) == 'n') {
                map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0) + 1);
            }
        }
        if(map.size()!=5)return 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int c = (entry.getKey() == 'l' || entry.getKey() == 'o') ? entry.getValue() / 2 : entry.getValue();
            res = Math.min(res, c);
        }
        return res;
    }
}
