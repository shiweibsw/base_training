package com.bsw.base_training.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author shiwei
 * @Date 2021/3/22-16:24
 * @Email shiweibsw@gmail.com
 * 回旋镖定义为一组三个点，这些点各不相同且不在一条直线上。
 * <p>
 * 给出平面上三个点组成的列表，判断这些点是否可以构成回旋镖。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[[1,1],[2,3],[3,2]]
 * 输出：true
 * 示例 2：
 * <p>
 * 输入：[[1,1],[2,2],[3,3]]
 * 输出：false
 *  
 * <p>
 * 提示：
 * <p>
 * points.length == 3
 * points[i].length == 2
 * 0 <= points[i][j] <= 100
 * <p>
 * 思路
 * 判断三点是否同直线，直接思路就是判断斜率。
 * 假设三点分别为a(x1, y1), b(x2, y2), c(x3,y3),
 * a、b两点的斜率为 k1 = (y2 - y1) / (x2 - x1)
 * a、c两点的斜率为 k2 = (y3 - y1) / (x3 - x1)
 * 如果在同一直线，则k1 = k2，考虑到分母为0 的情况，可以直接交叉相乘，省去判断0的情况，直接判断
 * (y2 - y1) * (x3 - x1) 与 (y3 - y1) * (x2 - x1)
 * 不相等即为不在同一直线上
 */
class leetcode_1037 {
    public boolean isBoomerang(int[][] points) {
        return (points[1][1] - points[0][1]) * (points[2][0] - points[0][0]) != (points[2][1] - points[0][1]) * (points[1][0] - points[0][0]);

    }

}
