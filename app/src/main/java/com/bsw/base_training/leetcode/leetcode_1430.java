package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/3/26-15:57
 * @Email shiweibsw@gmail.com
 * 给定一个二叉树，我们称从根节点到任意叶节点的任意路径中的节点值所构成的序列为该二叉树的一个 “有效序列” 。检查一个给定的序列是否是给定二叉树的一个 “有效序列” 。
 * <p>
 * 我们以整数数组 arr 的形式给出这个序列。从根节点到任意叶节点的任意路径中的节点值所构成的序列都是这个二叉树的 “有效序列” 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * 输入：root = [0,1,0,0,1,0,null,null,1,0,0], arr = [0,1,0,1]
 * 输出：true
 * 解释：
 * 路径 0 -> 1 -> 0 -> 1 是一个“有效序列”（图中的绿色节点）。
 * 其他的“有效序列”是：
 * 0 -> 1 -> 1 -> 0
 * 0 -> 0 -> 0
 * 示例 2：
 * <p>
 * <p>
 * <p>
 * 输入：root = [0,1,0,0,1,0,null,null,1,0,0], arr = [0,0,1]
 * 输出：false
 * 解释：路径 0 -> 0 -> 1 不存在，所以这不是一个“序列”。
 * 示例 3：
 * <p>
 * <p>
 * <p>
 * 输入：root = [0,1,0,0,1,0,null,null,1,0,0], arr = [0,1,1]
 * 输出：false
 * 解释：路径 0 -> 1 -> 1 是一个序列，但不是一个“有效序列”（译者注：因为序列的终点不是叶节点）。
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= arr.length <= 5000
 * 0 <= arr[i] <= 9
 * 每个节点的值的取值范围是 [0 - 9]
 */
class leetcode_1430 {
    public boolean isValidSequence(TreeNode root, int[] arr) {
        return preOrder(root, arr, 0);
    }

    private boolean preOrder(TreeNode root, int[] arr, int index) {
        if (root == null || index == arr.length) {
            return false;
        }
        if (root.val != arr[index]) {
            return false;
        }
        if (root.left == null && root.right == null && index == arr.length - 1) {
            return true;
        }
        return preOrder(root.left, arr, index + 1) || preOrder(root.right, arr, index + 1);
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
