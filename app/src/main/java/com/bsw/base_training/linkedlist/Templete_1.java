package com.bsw.base_training.linkedlist;

/**
 * @Author shiwei
 * @Date 2022/3/16-8:39
 * @Email shiweibsw@gmail.com
 */
class Templete_1 {

    /**
     * 单链表翻转
     *
     * @param head
     * @return
     */
    private Node reverse(Node head) {
        if (head == null) return null;
        Node curr = head, pre = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    /**
     * 单链表检测环
     *
     * @param head
     * @return
     */
    private boolean checkCircle(Node head) {
        if (head == null) return false;
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    /**
     * 返回单链表的中间节点
     *
     * @param head
     * @return
     */
    private Node getCenterNode(Node head) {
        if (head == null) return null;
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    /**
     * 合并两个有序链表
     *
     * @param l1
     * @param l2
     * @return
     */
    private Node mergeTwoList(Node l1, Node l2) {
        Node solider = new Node(0, null);
        Node p = solider;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return solider.next;
    }


    /**
     * 删除链表的倒数第K个节点
     *
     * @param head
     * @param k
     * @return
     */
    private Node deleteLastKth(Node head, int k) {
        int i = 1;
        Node fast = head;
        while (fast != null && i < k) {
            fast = fast.next;
            i++;
        }
        if (fast == null) return head;
        Node slow = head;
        Node pre = null;
        while (fast.next != null) {
            fast = fast.next;
            pre = slow;
            slow = slow.next;
        }
        if (pre == null) {
            return head.next;
        } else {
            pre.next = pre.next.next;
        }
        return head;
    }


    static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
