package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2020/12/31-10:33
 * @Email shiweibsw@gmail.com
 */
class leetcode_offer_27 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = mirrorTree(root.left);
        root.left = mirrorTree(root.right);
        root.right = tmp;
        return root;
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
