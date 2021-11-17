package com.bsw.base_training.leetcode;

import java.util.Arrays;

/**
 * @Author shiwei
 * @Date 2021/11/16-16:35
 * @Email shiweibsw@gmail.com
 */
class leetcode_826 {
    //注意：难度和收益是不成正比的

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        //解法一
        int[] diff_pro = new int[100000];
        Arrays.fill(diff_pro, 0);
        for (int i = 0; i < difficulty.length; i++) {
            if (diff_pro[difficulty[i]] < profit[i]) {
                diff_pro[difficulty[i]] = profit[i];
            }
        }
        int result = 0;
        for (int w : worker) {
            int[] tmp = new int[w];
            System.arraycopy(diff_pro, 0, tmp, 0, w);
            Arrays.sort(tmp);
            result += tmp[w - 1];
        }
        return result;

        //解法二
        // int  result=0;
        //  for(int w:worker){
        //      int v=0;
        //     for(int i=0;i<difficulty.length;i++){
        //         if(w>=difficulty[i]&&v<profit[i]){
        //             v=profit[i];
        //         }
        //     }
        //     result+=v;
        //  }
        //  return result;
    }
}
