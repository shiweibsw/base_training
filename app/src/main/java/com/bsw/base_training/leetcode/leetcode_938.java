package com.bsw.base_training.leetcode;

/**
 * 给定二叉搜索树的根结点 root，返回值位于范围 [low, high] 之间的所有结点的值的和。
 * 输入：root = [10,5,15,3,7,null,18], low = 7, high = 15
 * 输出：32
 * <p>
 * 提示：
 * <p>
 * 树中节点数目在范围 [1, 2 * 104] 内
 * 1 <= Node.val <= 105
 * 1 <= low <= high <= 105
 * 所有 Node.val 互不相同
 * <p>
 *
 * @Author shiwei
 * @Date 2020/11/24-10:15
 * @Email shiweibsw@gmail.com
 */
class leetcode_938 {
    int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        //  inOrder (root,low,high);
        dfs(root, low, high);
        return sum;
    }

    public void dfs(TreeNode root, int low, int high) {
        if (root == null) return;
        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }
        if (root.val > low) {
            dfs(root.left, low, high);
        }
        if (root.val < high) {
            dfs(root.right, low, high);
        }
    }

    private void inOrder(TreeNode root, int low, int high) {
        if (root == null) return;
        inOrder(root.left, low, high);
        if (root.val >= low && root.val <= high) {
            System.out.print(root.val);
            sum += root.val;
        }
        inOrder(root.right, low, high);
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
