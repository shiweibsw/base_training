package com.bsw.base_training.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
 *
 * 你可以按任意顺序返回答案。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：["bella","label","roller"]
 * 输出：["e","l","l"]
 * 示例 2：
 *
 * 输入：["cool","lock","cook"]
 * 输出：["c","o"]
 *  
 *
 * 提示：
 *
 * 1 <= A.length <= 100
 * 1 <= A[i].length <= 100
 * A[i][j] 是小写字母
 *
 * @Author shiwei
 * @Date 2020/12/17-14:15
 * @Email shiweibsw@gmail.com
 */
class leetcode_1002 {
    public List<String> commonChars(String[] A) {

        int[] minfreq = new int[26];
        Arrays.fill(minfreq, Integer.MAX_VALUE);
        for (String word : A) {
            int[] freq = new int[26];
            int length = word.length();
            for (int i = 0; i < length; ++i) {
                char ch = word.charAt(i);
                ++freq[ch - 'a'];
            }
            for (int i = 0; i < 26; ++i) {
                minfreq[i] = Math.min(minfreq[i], freq[i]);
            }
        }

        List<String> ans = new ArrayList<String>();
        for (int i = 0; i < 26; ++i) {
            for (int j = 0; j < minfreq[i]; ++j) {
                ans.add(String.valueOf((char) (i + 'a')));
            }
        }
        return ans;


//        List<String> res = new ArrayList<String>();
//        List<String> t = new ArrayList<String>();
//        for (int i = 0; i < A[0].length(); i++) {
//            char c = A[0].charAt(i);
//            if (!t.contains(c)) {
//                t.add(c + "");
//            }
//        }
//
//        for (int i = 0; i < t.size(); i++) {
//            String c = t.get(i);
//            int count = 0;
//            int idx = 0;
//            int min = Integer.MAX_VALUE;
//            for (int j = 0; j < A.length; j++) {
//                int p = A[j].indexOf(c, idx);
//                while (p != -1) {
//                    count++;
//                    idx = p + 1;
//                    p = A[j].indexOf(c, idx);
//                }
//                min = Math.min(min, count);
//                if (count == 0) {
//                    break;
//                }
//            }
//            if (min > 0) {
//                for (int j = 0; j < min; j++) {
//                    res.add(c);
//                }
//            }
//        }
//        return res;

    }
}
