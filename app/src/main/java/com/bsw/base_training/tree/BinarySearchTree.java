package com.bsw.base_training.tree;

/**
 * 二叉查找树
 * 特点：每个节点的值都大于左子树节点的值，小于右子树节点的值。
 * 中序遍历可以输出有序数列。
 *
 * @Author shiwei
 * @Date 2020/11/23-14:31
 * @Email shiweibsw@gmail.com
 */
class BinarySearchTree {
    private Node tree;

    /**
     * 二叉查找树的查找操作
     *
     * @param data
     * @return
     */
    public Node find(int data) {
        Node p = tree;
        while (p != null) {
            if (data < p.data) p = p.left;
            else if (data > p.data) p = p.right;
            else return p;
        }
        return null;
    }

    /**
     * 二叉查找树的插入操作
     *
     * @param data
     */
    public void insert(int data) {
        if (tree == null) {
            tree = new Node(data);
            return;
        }
        Node p = tree;
        while (p != null) {
            if (data > p.data) {
                if (p.right == null) {
                    p.right = new Node(data);
                    return;
                }
                p = p.right;
            } else {
                if (p.left == null) {
                    p.left = new Node(data);
                    return;
                }
                p = p.left;
            }
        }
    }

    /**
     * 最小节点
     *
     * @return
     */
    public Node findMin() {
        if (tree == null) return null;
        Node p = tree;
        while (p.left != null) {
            p = p.left;
        }
        return p;
    }

    /**
     * 最大节点
     *
     * @return
     */
    public Node findMax() {
        if (tree == null) return null;
        Node p = tree;
        while (p.right != null) {
            p = p.right;
        }
        return p;
    }


    public static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}
