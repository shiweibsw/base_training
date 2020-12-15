package com.bsw.base_training.leetcode;

/**
 * 重点题
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。要求不能创建任何新的节点，只能调整树中节点指针的指向。
 * 我们希望将这个二叉搜索树转化为双向循环链表。链表中的每个节点都有一个前驱和后继指针。对于双向循环链表，第一个节点的前驱是最后一个节点，最后一个节点的后继是第一个节点。
 * https://leetcode-cn.com/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/submissions/
 *
 * @Author shiwei
 * @Date 2020/12/15-16:31
 * @Email shiweibsw@gmail.com
 */
class leetcode_offer_36 {
    Node pre, head;

    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        inOrder(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    private void inOrder(Node curr) {
        if (curr == null) return;
        inOrder(curr.left);
        if (pre != null) {
            pre.right = curr;
        } else {
            head = curr;
        }
        curr.left = pre;
        pre = curr;
        inOrder(curr.right);
    }

    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

    ;

}


