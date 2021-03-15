package com.bsw.base_training.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author shiwei
 * @Date 2021/3/11-15:22
 * @Email shiweibsw@gmail.com
 */
class leetcode_57_II {
    public int[][] findContinuousSequence(int target) {
        List<List<Integer>> tmp = new ArrayList<List<Integer>>();
        for (int i = 1; i < target; i++) {
            int curr = 0;
            List<Integer> l1 = new ArrayList<Integer>();
            for (int j = i; j < target; j++) {
                curr += j;
                l1.add(j);
                if (curr == target) {
                    tmp.add(l1);
                    System.out.println(l1.size());
                    System.out.println(tmp.get(0).size());
                } else if (curr > target) {
                    break;
                }
            }
        }

        int[][] ans = new int[tmp.size()][];
        for (int i = 0; i < tmp.size(); i++) {
            int[] t = new int[tmp.get(i).size()];
            for (int j = 0; j < t.length; j++) {
                t[j] = tmp.get(i).get(j);
            }
            ans[i] = t;
        }
        return ans;

    }
}
