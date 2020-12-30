package com.bsw.base_training.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 * <p>
 * 例如，给定一个 3叉树 :
 * <p>
 * 返回其前序遍历: [1,3,5,6,2,4]。
 * <p>
 * 说明: 递归法很简单，你可以使用迭代法完成此题吗?
 *
 * @Author shiwei
 * @Date 2020/12/30-13:36
 * @Email shiweibsw@gmail.com
 */
class leetcode_589 {
    List<Integer> res = new ArrayList();

    public List<Integer> preorder(Node root) {
        if (root == null) return res;
        res.add(root.val);
        for (Node n : root.children) {
            preorder(n);
        }
        return res;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
