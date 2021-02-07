package com.bsw.base_training.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author shiwei
 * @Date 2021/2/7-15:12
 * @Email shiweibsw@gmail.com
 * 给定一个二叉搜索树和一个目标结果，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
 * <p>
 * 案例 1:
 * <p>
 * 输入:
 * 5
 * / \
 * 3   6
 * / \   \
 * 2   4   7
 * <p>
 * Target = 9
 * <p>
 * 输出: True
 *  
 * <p>
 * 案例 2:
 * <p>
 * 输入:
 * 5
 * / \
 * 3   6
 * / \   \
 * 2   4   7
 * <p>
 * Target = 28
 * <p>
 * 输出: False
 */
class leetcode_653 {
    private boolean isFind = false;

    public boolean findTarget(TreeNode root, int k) {
        Map<Integer, Integer> map = new HashMap();
        inOrder(root, map, k);
        return isFind;
    }

    private void inOrder(TreeNode root, Map<Integer, Integer> map, int k) {
        if (root == null || isFind) return;
        inOrder(root.left, map, k);
        if (map.get(k - root.val) != null) {
            isFind = true;
        } else {
            map.put(root.val, 1);
        }
        inOrder(root.right, map, k);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
