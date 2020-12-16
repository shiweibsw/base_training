package com.bsw.base_training.leetcode;

/**
 * 给你一个字符串 path，其中 path[i] 的值可以是 'N'、'S'、'E' 或者 'W'，分别表示向北、向南、向东、向西移动一个单位。
 *
 * 机器人从二维平面上的原点 (0, 0) 处开始出发，按 path 所指示的路径行走。
 *
 * 如果路径在任何位置上出现相交的情况，也就是走到之前已经走过的位置，请返回 True ；否则，返回 False 。
 *
 *  
 *
 * 示例 1：
 *
 *
 *
 * 输入：path = "NES"
 * 输出：false
 * 解释：该路径没有在任何位置相交。
 * 示例 2：
 *
 *
 *
 * 输入：path = "NESWW"
 * 输出：true
 * 解释：该路径经过原点两次。
 *  
 *
 * 提示：
 *
 * 1 <= path.length <= 10^4
 * path 仅由 {'N', 'S', 'E', 'W} 中的字符组成
 *
 * @Author shiwei
 * @Date 2020/12/16-16:55
 * @Email shiweibsw@gmail.com
 */
class leetcode_1496 {
    public boolean isPathCrossing(String path) {
        StringBuilder sb = new StringBuilder();
        StringBuilder tmp = null;
        int x = 0;
        int y = 0;
        sb.append("(00)");
        for (int i = 0; i < path.length(); i++) {
            switch (path.charAt(i)) {
                case 'N':
                    y += 1;
                    break;
                case 'E':
                    x += 1;
                    break;
                case 'S':
                    y -= 1;
                    break;
                case 'W':
                    x -= 1;
                    break;
            }
            tmp = new StringBuilder();
            tmp.append("(");
            tmp.append(x);
            tmp.append(y);
            tmp.append(")");
            if (sb.indexOf(tmp.toString()) != -1) {
                return true;
            } else {
                sb.append(tmp);
            }
        }
        return false;
    }
}
