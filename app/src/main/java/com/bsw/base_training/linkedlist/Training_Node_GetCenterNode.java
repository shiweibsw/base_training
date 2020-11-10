package com.bsw.base_training.linkedlist;

/**
 * 单链表获取中间节点
 *
 * @Author shiwei
 * @Date 2020/11/6-16:46
 * @Email shiweibsw@gmail.com
 */
class Training_Node_GetCenterNode {

    public Node findMiddleNode(Node list) {
        if (list == null) return null;
        Node fast = list;
        Node slow = list;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


    private Node findMiddleNode2(Node header) {
        if (header == null) return null;
        Node fast = header;
        Node slow = header;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


    private Node findMiddleNode3(Node header) {
        if (header == null) return null;
        Node fast = header;
        Node slow = header;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }


    private Node getCenterNode(Node header) {
        if (header == null) return null;
        Node fast = header;
        Node slow = header;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


    public static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getData() {
            return data;
        }
    }
}
