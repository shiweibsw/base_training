package com.bsw.base_training.linkedlist;

/**
 * 判断两个链表是否相交，如果相交，返回第一个相交节点
 * 如果两个链表没有交点，返回 null.
 * 在返回结果后，两个链表仍须保持原有的结构。
 * 可假定整个链表结构中没有循环。
 * 程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。
 *
 * @Author shiwei
 * @Date 2020/11/13-13:15
 * @Email shiweibsw@gmail.com
 */
class Training_Node_Check_Intersection {

    private Node checkIntersection(Node l1, Node l2) {
        Node node1 = l1;
        Node node2 = l2;
        while (node1 != node2) {
            node1 = node1 == null ? l2 : node1.next;
            node2 = node2 == null ? l1 : node2.next;
        }
        return node1;
    }

    private Node checkIntersection1(Node l1, Node l2) {
        Node node1 = l1;
        Node node2 = l2;
        while (node1 != node2) {
            node1 = node1.next == null ? l2 : node1.next;
            node2 = node2.next == null ? l1 : node2.next;
        }
        return node1;
    }


    private Node checkIntersection2(Node l1, Node l2) {
        Node n1 = l1;
        Node n2 = l2;
        while (n1 != n2) {
            n1 = (n1.next == null) ? l2 : n1.next;
            n2 = (n2.next == null) ? l1 : n2.next;
        }
        return n1;
    }

    private Node checkIntersection3(Node l1, Node l2) {
        Node n1 = l1;
        Node n2 = l2;
        while (n1 != n2) {
            n1 = (n1.next == null) ? l2 : n1.next;
            n2 = (n2.next == null) ? l1 : n2.next;
        }
        return n1;
    }

    private Node checkIntersection4(Node l1, Node l2) {
        Node n1 = l1;
        Node n2 = l2;
        while (n1 != n2) {
            n1 = (n1.next == null) ? l2 : n1.next;
            n2 = (n2.next == null) ? l1 : n2.next;
        }
        return n1;
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
