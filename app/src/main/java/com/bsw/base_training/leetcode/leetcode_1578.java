package com.bsw.base_training.leetcode;

/**
 * 给你一个字符串 s 和一个整数数组 cost ，其中 cost[i] 是从 s 中删除字符 i 的代价。
 *
 * 返回使字符串任意相邻两个字母不相同的最小删除成本。
 *
 * 请注意，删除一个字符后，删除其他字符的成本不会改变。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "abaac", cost = [1,2,3,4,5]
 * 输出：3
 * 解释：删除字母 "a" 的成本为 3，然后得到 "abac"（字符串中相邻两个字母不相同）。
 * 示例 2：
 *
 * 输入：s = "abc", cost = [1,2,3]
 * 输出：0
 * 解释：无需删除任何字母，因为字符串中不存在相邻两个字母相同的情况。
 * 示例 3：
 *
 * 输入：s = "aabaa", cost = [1,2,3,4,1]
 * 输出：2
 * 解释：删除第一个和最后一个字母，得到字符串 ("aba") 。
 *
 * @Author shiwei
 * @Date 2020/12/9-14:52
 * @Email shiweibsw@gmail.com
 */
class leetcode_1578 {
    public int minCost(String s, int[] cost) {
        int c = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int j = i + 1;
            if (s.charAt(i) == s.charAt(j)) {
                if (cost[i] >= cost[j]) {
                    c += cost[j];
                    j++;
                    for (; j < s.length(); j++) {
                        if (s.charAt(i) == s.charAt(j)) {
                            if (cost[i] >= cost[j]) {
                                c += cost[j];
                            } else {
                                c += cost[i];
                                i = j - 1;
                                break;
                            }
                        } else {
                            i = j - 1;
                            break;
                        }
                    }
                    if (j == s.length()) {
                        return c;
                    }
                } else {
                    c += cost[i];
                }
            }
        }
        return c;
    }
}
