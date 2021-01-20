package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/1/20-16:39
 * @Email shiweibsw@gmail.com
 *  n 名士兵站成一排。每个士兵都有一个 独一无二 的评分 rating 。
 * <p>
 * 每 3 个士兵可以组成一个作战单位，分组规则如下：
 * <p>
 * 从队伍中选出下标分别为 i、j、k 的 3 名士兵，他们的评分分别为 rating[i]、rating[j]、rating[k]
 * 作战单位需满足： rating[i] < rating[j] < rating[k] 或者 rating[i] > rating[j] > rating[k] ，其中  0 <= i < j < k < n
 * 请你返回按上述条件可以组建的作战单位数量。每个士兵都可以是多个作战单位的一部分。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：rating = [2,5,3,4,1]
 * 输出：3
 * 解释：我们可以组建三个作战单位 (2,3,4)、(5,4,1)、(5,3,1) 。
 * 示例 2：
 * <p>
 * 输入：rating = [2,1,3]
 * 输出：0
 * 解释：根据题目条件，我们无法组建作战单位。
 * 示例 3：
 * <p>
 * 输入：rating = [1,2,3,4]
 * 输出：4
 *  
 * <p>
 * 提示：
 * <p>
 * n == rating.length
 * 3 <= n <= 1000
 * 1 <= rating[i] <= 10^5
 * rating 中的元素都是唯一的
 * 解题思路
 * 遍历中间的士兵，统计 左边/右边 比他 小/大 的士兵人数。
 * <p>
 * 每名士兵在中间的情况下可以组队的数量为：
 * 左边比他小的人数 × 右边比他大的人数 + 左边比他大的人数 × 右边比他小的人数
 * <p>
 * 公式为：\sum_{}(left[0] * right[1] + left[1] * right[0])∑
 * ​
 * (left[0]∗right[1]+left[1]∗right[0])
 * <p>
 * 时间复杂度：一个for循环为O(n)O(n)，两次count函数O(n)O(n)，故总的时间复杂度为O(n^2)O(n
 * 2
 * )。
 * 空间复杂度：O(1)O(1)。
 */
class leetcode_1395 {
    public int numTeams(int[] rating) {
        int ans = 0;
        int n = rating.length;
        for (int j = 1; j < n - 1; j++) {
            int iless = 0, imore = 0;
            int kless = 0, kmore = 0;
            for (int i = 0; i < j; i++) {
                if (rating[i] < rating[j]) {
                    iless++;
                } else {
                    imore++;
                }
            }
            for (int k = j + 1; k < n; k++) {
                if (rating[k] < rating[j]) {
                    kless++;
                } else {
                    kmore++;
                }
            }
            ans += iless * kmore + imore * kless;
        }
        return ans;
    }
}
