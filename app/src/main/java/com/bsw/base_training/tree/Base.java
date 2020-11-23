package com.bsw.base_training.tree;

import android.util.Log;

/**
 * 二叉树的三种遍历方式
 * <p>
 * 前序遍历是指，对于树中的任意节点来说，先打印这个节点，然后再打印它的左子树，最后打印它的右子树。
 * <p>
 * 中序遍历是指，对于树中的任意节点来说，先打印它的左子树，然后再打印它本身，最后打印它的右子树。
 * <p>
 * 后序遍历是指，对于树中的任意节点来说，先打印它的左子树，然后再打印它的右子树，最后打印这个节点本身。
 *
 * @Author shiwei
 * @Date 2020/11/23-13:48
 * @Email shiweibsw@gmail.com
 */
public class Base {
    private static final String TAG = "Base";

    public static TreeNode createTree() {
        // 叶子节点
        TreeNode G = new TreeNode("G");
        TreeNode D = new TreeNode("D");
        TreeNode E = new TreeNode("E", G, null);
        TreeNode B = new TreeNode("B", D, E);
        TreeNode H = new TreeNode("H");
        TreeNode I = new TreeNode("I");
        TreeNode F = new TreeNode("F", H, I);
        TreeNode C = new TreeNode("C", null, F);
        // 构造根节点
        TreeNode root = new TreeNode("A", B, C);
        return root;
    }

    public static void preOrder(TreeNode root) {
        if (root == null) return;
        Log.i(TAG, "preOrder: " + root.value);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        Log.i(TAG, "inOrder: " + root.value);
        inOrder(root.right);
    }

    public static void postOrder(TreeNode root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        Log.i(TAG, "postOrder: " + root.value);
    }

}
