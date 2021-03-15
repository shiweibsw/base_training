package com.bsw.base_training.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author shiwei
 * @Date 2021/3/15-14:55
 * @Email shiweibsw@gmail.com
 */
class leetcode_820 {
    public int minimumLengthEncoding(String[] words) {
        Set<String> set=new HashSet(Arrays.asList(words));
        for(String word:words){
            for(int i=1;i<word.length();i++){
                set.remove(word.substring(i));
            }
        }
        int ans=0;
        for(String word:set){
            ans+=word.length()+1;
        }
        return ans;



//        Arrays.sort(words, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });
//        int[] indices = new int[words.length];
//        StringBuilder s = new StringBuilder();
//        for (int i = 0; i < words.length; i++) {
//            if (!s.toString().contains(words[i])) {
//                s.append(words[i]);
//                s.append("#");
//                indices[i] = s.length() - words[i].length();
//            } else {
//                int index = s.toString().indexOf(words[i]);
//                while (index != -1) {
//                    index = s.toString().indexOf(words[i], index + 1);
//                }
//                if (index + words[i].length() < s.length() && s.charAt(index + words[i].length()) == '#') {
//                    indices[i] = index;
//                } else {
//                    s.append(words[i]);
//                    s.append("#");
//                    indices[i] = s.length() - words[i].length();
//                }
//            }
//        }
//        return s.length();
    }
}
