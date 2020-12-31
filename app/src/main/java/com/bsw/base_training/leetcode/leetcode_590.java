package com.bsw.base_training.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个 N 叉树，返回其节点值的后序遍历。
 * <p>
 * 例如，给定一个 3叉树 :
 * <p>
 *  
 * <p>
 * <p>
 * <p>
 *  
 * <p>
 * 返回其后序遍历: [5,6,3,2,4,1].
 * <p>
 *  
 * <p>
 * 说明: 递归法很简单，你可以使用迭代法完成此题吗?
 *
 * @Author shiwei
 * @Date 2020/12/31-10:37
 * @Email shiweibsw@gmail.com
 */
class leetcode_590 {
    List<Integer> res = new ArrayList();

    public List<Integer> postorder(Node root) {
        if (root == null) return res;
        for (Node n : root.children) {
            postorder(n);
        }
        res.add(root.val);
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
