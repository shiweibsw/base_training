package com.bsw.base_training.linkedlist;

/**
 * 单链表删除倒数第K个节点
 *
 * @Author shiwei
 * @Date 2020/11/6-16:46
 * @Email shiweibsw@gmail.com
 */
class Training_Node_Delete_Last_Kth {

    public static Node deleteLastKth(Node list, int k) {
        Node fast = list;
        int i = 1;
        while (fast != null && i < k) {//先获取正数第K个元素
            fast = fast.next;
            ++i;
        }

        if (fast == null) return list;

        Node slow = list;//从头开始遍历，此时slow和fast相差k-1为，当fast走到末尾时，slow正好在倒是第K位上
        Node prev = null;//slow指针的前一个节点，删除时使用
        while (fast.next != null) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }

        if (prev == null) {
            list = list.next;
        } else {
            prev.next = prev.next.next;
        }
        return list;
    }

    public Node deleteLastKth2(Node list, int k) {
        Node fast = list;
        int i = 1;
        while (fast != null && i < k) {
            fast = fast.next;
            ++i;
        }
        if (fast == null)
            return list;

        Node slow = list;
        Node prev = null;
        while (fast.next != null) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }
        if (prev == null) {
            list = list.next;
        } else {
            prev.next = prev.next.next;
        }
        return list;
    }


    private Node deleteLastKth3(Node header, int k) {
        Node fast = header;
        int i = 1;
        while (fast != null && i < k) {
            fast = fast.next;
            ++i;
        }
        if (fast == null) return header;

        Node slow = header;
        Node prev = null;
        while (fast.next != null) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }
        if (prev == null) {
            header = header.next;
        } else {
            prev.next = prev.next.next;
        }
        return header;
    }


    private Node deleteLastKth4(Node header, int k) {
        Node fast = header;
        int i = 1;
        while (fast != null && i < k) {
            fast = fast.next;
            ++i;
        }
        if (fast == null) return header;
        Node slow = header;
        Node pre = null;
        while (fast.next != null) {
            fast = fast.next;
            pre = slow;
            slow = slow.next;
        }
        if (pre == null) {
            header = header.next;
        } else {
            pre.next = pre.next.next;
        }
        return header;
    }


    private Node deleteLastKth5(Node head, int k) {
        Node fast = head.next;
        int i = 1;
        while (fast != null && i < k) {
            fast = fast.next;
            ++i;
        }
        if (fast == null) return head;
        Node slow = head;
        Node prev = null;
        while (fast.next != null) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }
        if (prev == null) {
            head = head.next;
        } else {
            prev.next = prev.next.next;
        }

        return head;

    }


    private Node deleteLastKth6(Node head, int k) {
        Node fast = head;
        int i = 1;
        while (fast != null && i < k) {
            fast = fast.next;
            i++;
        }
        if (fast == null) return head;
        Node slow = head;
        Node prev = null;
        while (fast.next != null) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }
        if (prev == null) {
            head = head.next;
        } else {
            prev.next = prev.next.next;
        }
        return head;
    }


    private Node deleteLastKth7(Node head, int k) {
        Node fast = head;
        int i = 1;
        while (fast != null && i < k) {
            fast = fast.next;
            i++;
        }
        if (fast == null) return head;
        Node slow = head;
        Node prev = null;
        while (fast.next != null) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }
        if (prev == null) {
            head = head.next;
        } else {
            prev.next = prev.next.next;
        }
        return head;
    }


    private Node deleteLastKth8(Node head, int k) {
        Node fast = head;
        int i = 1;
        while (fast != null && i < k) {
            fast = fast.next;
            ++i;
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
            head = head.next;
        } else {
            pre.next = pre.next.next;
        }
        return head;
    }


    private Node deleteLastKth9(Node head, int k) {
        Node fast = null;
        int i = 1;
        while (fast != null && i < k) {
            fast = fast.next;
            ++i;
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
            head = head.next;
        } else {
            pre.next = pre.next.next;
        }
        return head;
    }

    private Node deleteLastKth10(Node head, int k) {
        Node fast = head;
        int i = 1;
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
            head = head.next;
        } else {
            pre.next = pre.next.next;
        }
        return head;
    }


    private Node deleteLastKth11(Node head, int k) {
        Node fast = head;
        int i = 1;
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
            head = head.next;
        } else {
            pre.next = pre.next.next;
        }
        return head;
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
