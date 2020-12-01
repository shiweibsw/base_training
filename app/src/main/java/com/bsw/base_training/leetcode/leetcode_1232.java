package com.bsw.base_training.leetcode;

/**
 * 在一个 XY 坐标系中有一些点，我们用数组 coordinates 来分别记录它们的坐标，其中 coordinates[i] = [x, y] 表示横坐标为 x、纵坐标为 y 的点。
 * <p>
 * 请你来判断，这些点是否在该坐标系中属于同一条直线上，是则返回 true，否则请返回 false。
 * <p>
 * 输入：coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
 * 输出：true
 *
 * @Author shiwei
 * @Date 2020/12/1-15:28
 * @Email shiweibsw@gmail.com
 */
class leetcode_1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        int dx = coordinates[1][0] - coordinates[0][0];
        int dy = coordinates[1][1] - coordinates[0][1];
        for (int i = 2; i < coordinates.length; i++) {
            int dx1 = coordinates[i][0] - coordinates[0][0];
            int dy1 = coordinates[i][1] - coordinates[0][1];
            if (dx * dy1 != dx1 * dy) {//可能会有被除数为0的情况所以用乘法代替
                return false;
            }
        }
        return true;
    }
}
