package com.bsw.base_training.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author shiwei
 * @Date 2021/3/15-14:07
 * @Email shiweibsw@gmail.com
 */
class leetcode_3 {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int curr = 0;
        int left=0;//左指针
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) == null) {
                map.put(c, i);
                curr++;
            } else {
                left=Math.max(left,map.get(c)+1);//上一个重复字符出现的位置
                map.put(c, i);
                curr=i-left+1;
            }
            ans = Math.max(ans, curr);
        }
        return ans;
    }
}
