package com.bsw.base_training.linkedlist;

/**
 * 单链表检测环
 *
 * @Author shiwei
 * @Date 2020/11/6-16:46
 * @Email shiweibsw@gmail.com
 */
class Training_Node_CheckCircle {

    public static boolean checkCircle(Node header) {
        if (header == null) return false;
        Node fast = header.next;
        Node slow = header;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }


    private boolean checkCircle2(Node header) {

        if (header == null) return false;
        Node fast = header.next;
        Node slow = header;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }


    private boolean checkCircle3(Node header) {
        if (header == null) return false;
        Node fast = header.next;
        Node slow = header;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }


    private boolean checkCircle4(Node head) {
        if (head == null) return false;
        Node fast = head.next;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
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
