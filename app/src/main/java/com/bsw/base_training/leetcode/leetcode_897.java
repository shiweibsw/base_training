package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/2/2-17:05
 * @Email shiweibsw@gmail.com
 */
class leetcode_897 {
    private TreeNode p = new TreeNode();

    public TreeNode increasingBST(TreeNode root) {
        TreeNode ans = p;
        createTree(root);
        return ans.right;
    }

    private void createTree(TreeNode root) {
        if (root == null) return;
        createTree(root.left);
        TreeNode t = new TreeNode(root.val);
        p.right = t;
        p = t;
        createTree(root.right);
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
