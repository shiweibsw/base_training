package com.bsw.base_training.tree;

/**
 * @Author shiwei
 * @Date 2020/11/23-13:55
 * @Email shiweibsw@gmail.com
 */
public class TreeNode {
    String value;
    TreeNode left;
    TreeNode right;

    public TreeNode(String v, TreeNode l, TreeNode r) {
        value = v;
        left = l;
        right = r;
    }

    public TreeNode(String v) {
        this.value = v;
    }
}
