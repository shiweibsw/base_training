package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/11/16-15:08
 * @Email shiweibsw@gmail.com
 */
class leetcode_1448 {
    int count = 0;

    public int goodNodes(TreeNode root) {
        int max = root.val;
        v(max, root);
        return count;
    }

    private void v(int max, TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.val >= max) {
            count++;
            max = root.val;
        }
        v(max, root.left);
        v(max, root.right);
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


