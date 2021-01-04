package com.bsw.base_training.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author shiwei
 * @Date 2021/1/4-13:16
 * @Email shiweibsw@gmail.com
 */
class leetcode_offer_54 {
    int res = 0;
    int count = 0;

    public int kthLargest(TreeNode root, int k) {
        getKth(root, k);
        return res;
    }

    private void getKth(TreeNode root, int k) {
        if (root == null) return;
        getKth(root.right, k);
        count++;
        if (count == k) {
            res = root.val;
            return;
        }
        getKth(root.left, k);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
