package com.bsw.base_training.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author shiwei
 * @Date 2020/12/23-11:42
 * @Email shiweibsw@gmail.com
 */
class leetcode_22 {
    public int maxArea(int[] height) {
        int weight=0;
        for(int i=0;i<height.length;i++){
            for(int j=height.length-1;j>=0;j--){
                weight=Math.max(Math.min(height[i],height[j])*(j-i),weight);
            }
        }
        return weight;
    }
}
