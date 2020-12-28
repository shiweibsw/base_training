package com.bsw.base_training.leetcode;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.HashMap;
import java.util.Map;

/**
 *  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * <p>
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 * <p>
 * 示例 1:
 * <p>
 * 输入: J = "aA", S = "aAAbbbb"
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: J = "z", S = "ZZ"
 * 输出: 0
 * 注意:
 * <p>
 * S 和 J 最多含有50个字母。
 *  J 中的字符不重复。
 *
 * @Author shiwei
 * @Date 2020/12/28-8:56
 * @Email shiweibsw@gmail.com
 */
class leetcode_771 {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public int numJewelsInStones(String jewels, String stones) {
        int res = 0;
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < jewels.length(); i++) {
            char c = jewels.charAt(i);
            if (map.get(c) != null) {
                res += map.get(c);
            }
        }
        return res;

        // int res=0;
        // for(int i=0;i<jewels.length();i++){
        //     char c=jewels.charAt(i);
        //     for(int j=0;j<stones.length();j++){
        //         char c1=stones.charAt(j);
        //         if(c==c1){
        //             res++;
        //         }
        //     }
        // }
        // return res;
    }
}
