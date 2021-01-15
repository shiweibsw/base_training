package com.bsw.base_training.leetcode;

/**
 * Hercy 想要为购买第一辆车存钱。他 每天 都往力扣银行里存钱。
 * <p>
 * 最开始，他在周一的时候存入 1 块钱。从周二到周日，他每天都比前一天多存入 1 块钱。在接下来每一个周一，他都会比 前一个周一 多存入 1 块钱。
 * <p>
 * 给你 n ，请你返回在第 n 天结束的时候他在力扣银行总共存了多少块钱。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 4
 * 输出：10
 * 解释：第 4 天后，总额为 1 + 2 + 3 + 4 = 10 。
 * 示例 2：
 * <p>
 * 输入：n = 10
 * 输出：37
 * 解释：第 10 天后，总额为 (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37 。注意到第二个星期一，Hercy 存入 2 块钱。
 * 示例 3：
 * <p>
 * 输入：n = 20
 * 输出：96
 * 解释：第 20 天后，总额为 (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96 。
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= n <= 1000
 * 通过次数2,216提交次数2,992
 *
 * @Author shiwei
 * @Date 2021/1/15-11:59
 * @Email shiweibsw@gmail.com
 */
class leetcode_1716 {
    public int totalMoney(int n) {
        int week = n / 7;
        int sum = 0;
        int t = 0;
        while (t <= week) {
            sum += 28 + t * 7;
            t++;
        }
        int last = 7 + week;
        int c = (week + 1) * 7 - n;
        int j = 0;
        while (c > 0) {
            j += last--;
            c--;
        }
        return sum - j;
    }
}
