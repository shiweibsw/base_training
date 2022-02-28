package com.bsw.base_training.linkedlist;

/**
 * 单链表深拷贝
 *
 * @Author shiwei
 * @Date 2020/12/8-10:01
 * @Email shiweibsw@gmail.com
 */
class Training_Node_CopyList {
    private Node copyList(Node head) {
        Node curr = head;
        Node solider = new Node(0, null);
        Node p = solider;
        while (curr != null) {
            Node next = new Node(curr.data, null);
            p.next = next;
            curr = curr.next;
            p = p.next;
        }
        return solider.next;
    }

    private Node copyList1(Node head) {
        Node curr = head;
        Node solider = new Node(0, null);
        Node p = solider;
        while (curr != null) {
            Node next = new Node(curr.data, null);
            p.next = next;
            curr = curr.next;
            p = p.next;
        }
        return solider.next;
    }

    private Node copyList2(Node head) {
        Node curr = head;
        Node solider = new Node(0, null);
        Node p = solider;
        while (curr != null) {
            Node next = new Node(curr.data, null);
            p.next = next;
            curr = curr.next;
            p = p.next;
        }
        return solider.next;
    }

    private Node copyList3(Node head) {
        Node curr = head;
        Node solider = new Node(0, null);
        Node p = solider;
        while (curr != null) {
            Node next = new Node(curr.data, null);
            p.next = next;
            curr = curr.next;
            p = p.next;
        }
        return solider.next;
    }

    private Node copyList4(Node head) {
        Node solider = new Node(0, null);
        Node curr = head;
        Node p = solider;
        while (curr != null) {
            Node next = new Node(curr.data, null);
            p.next = next;
            curr = curr.next;
            p = p.next;
        }
        return solider.next;
    }

    private Node copeList5(Node head) {
        Node solider = new Node(0, null);
        Node curr = head;
        Node p = solider;
        while (curr != null) {
            Node next = new Node(curr.data, null);
            p.next = next;
            curr = curr.next;
            p = p.next;
        }
        return solider.next;
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
