package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/11/17-10:34
 * @Email shiweibsw@gmail.com
 */
class leetcode_112 {
    //思路：递归减法，每次递归减去当前节点的值，直到叶子节点时比对叶子节点的值周等于剩余值即可
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        //找到叶子节点，比对剩余值和叶子节点的值是否相等。
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
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
