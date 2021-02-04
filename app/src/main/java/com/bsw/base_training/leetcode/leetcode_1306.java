package com.bsw.base_training.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author shiwei
 * @Date 2021/2/4-14:16
 * @Email shiweibsw@gmail.com
 * 这里有一个非负整数数组 arr，你最开始位于该数组的起始下标 start 处。当你位于下标 i 处时，你可以跳到 i + arr[i] 或者 i - arr[i]。
 * <p>
 * 请你判断自己是否能够跳到对应元素值为 0 的 任一 下标处。
 * <p>
 * 注意，不管是什么情况下，你都无法跳到数组之外。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：arr = [4,2,3,0,3,1,2], start = 5
 * 输出：true
 * 解释：
 * 到达值为 0 的下标 3 有以下可能方案：
 * 下标 5 -> 下标 4 -> 下标 1 -> 下标 3
 * 下标 5 -> 下标 6 -> 下标 4 -> 下标 1 -> 下标 3
 * 示例 2：
 * <p>
 * 输入：arr = [4,2,3,0,3,1,2], start = 0
 * 输出：true
 * 解释：
 * 到达值为 0 的下标 3 有以下可能方案：
 * 下标 0 -> 下标 4 -> 下标 1 -> 下标 3
 * 示例 3：
 * <p>
 * 输入：arr = [3,0,2,1,2], start = 2
 * 输出：false
 * 解释：无法到达值为 0 的下标 1 处。
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= arr.length <= 5 * 10^4
 * 0 <= arr[i] < arr.length
 * 0 <= start < arr.length
 */
class leetcode_1306 {
    public boolean canReach(int[] arr, int start) {
        // 初始化一个长度为arr的boolean数组，记录已访问过的位置
        boolean[] visited = new boolean[arr.length];

        // 深度优先遍历
        return dfs(arr, start, visited);
    }

    private boolean dfs(int[] arr, int start, boolean[] visited) {
        // 如果start位置直接就是0
        if (arr[start] == 0) {
            return true;
        }

        // 记录start位置已被访问
        visited[start] = true;

        // 处理start左边的元素
        int left = start - arr[start];
        if (left >= 0 && !visited[left] && dfs(arr, left, visited)) {
            return true;
        }

        // 处理start右边的元素
        int right = start + arr[start];
        if (right < arr.length && !visited[right] && dfs(arr, right, visited)) {
            return true;
        }

        // 没有能达到0的位置
        return false;
    }

    // public boolean canReach(int[] arr, int start) {
    //     if (arr[start] == 0) return true;
    //     int n = arr.length;
    //     Queue<Integer> q = new LinkedList<>();
    //     q.offer(start);
    //     boolean[] used = new boolean[n];
    //     used[start] = true;
    //     while (!q.isEmpty()) {
    //         int i=q.poll();
    //         if (i + arr[i] < n && !used[i + arr[i]]) {
    //             if (arr[i + arr[i]] == 0) {
    //                 return true;
    //             }
    //             q.offer(i + arr[i]);
    //             used[i + arr[i]] = true;
    //         }
    //         if (i - arr[i] >=0 &&i - arr[i] < n && !used[i - arr[i]]) {
    //             if (arr[i - arr[i]] == 0) {
    //                 return true;
    //             }
    //             q.offer(i - arr[i]);
    //             used[i - arr[i]] = true;
    //         }
    //     }
    //     return false;
    // }
}
