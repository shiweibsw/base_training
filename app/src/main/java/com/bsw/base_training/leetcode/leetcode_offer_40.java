package com.bsw.base_training.leetcode;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.PriorityQueue;

/**
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：arr = [3,2,1], k = 2
 * 输出：[1,2] 或者 [2,1]
 * 示例 2：
 * <p>
 * 输入：arr = [0,1,2,1], k = 1
 * 输出：[0]
 *  
 * <p>
 * 限制：
 * <p>
 * 0 <= k <= arr.length <= 10000
 * 0 <= arr[i] <= 10000
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author shiwei
 * @Date 2020/12/15-14:53
 * @Email shiweibsw@gmail.com
 */
class leetcode_offer_40 {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public int[] getLeastNumbers(int[] arr, int k) {
        //直接计数排序
//        int[] count = new int[10000];
//        for (int i = 0; i < arr.length; i++) {
//            count[arr[i]]++;
//        }
//        int[] res = new int[k];
//        int idx = 0;
//        for (int i = 0; i < count.length; i++) {
//            while (count[i]-- > 0 && idx < k) {
//                res[idx++] = i;
//            }
//            if (idx == k)
//                break;
//        }
//        return res;

        //方法二 大根堆
//        if (k == 0 || arr.length == 0) {
//            return new int[0];
//        }
//        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((o1, o2) -> o2 - o1);
//        for (int num : arr) {
//            if (queue.size() < k) {
//                queue.offer(num);
//            } else if (queue.peek() > num) {
//                queue.poll();
//                queue.offer(num);
//            }
//        }
//        int[] res = new int[k];
//        int idx = 0;
//        while (!queue.isEmpty()) {
//            res[idx++] = queue.poll();
//        }
//        return res;
        //解法三 快排思想
        if (k > arr.length)
            return arr;
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int p = patition(arr, low, high);
            if (p == k - 1) {
                break;
            } else if (p < k - 1) {
                low = p + 1;
            } else {
                high = p - 1;
            }
        }
        int[] res = new int[k];
        System.arraycopy(arr, 0, res, 0, k);
        return res;

    }

    private int patition(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                if (i == j) {
                    i++;
                } else {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                    i++;
                }
            }
        }
        int t = a[i];
        a[i] = a[r];
        a[r] = t;
        return i;
    }
}
