package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/3/27-9:29
 * @Email shiweibsw@gmail.com
 */
class leetcode_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null) return head;
        int len = 0;
        ListNode curr = head;
        ListNode tail = null;//记录尾指针
        while (curr != null) {
            tail = curr;
            curr = curr.next;
            len++;
        }//拿到链表长度
        int moveLen = k % len;
        if (moveLen == 0 || k == len) {//k是长度的整数倍，不需要移动
            return head;
        }
        int start = len - moveLen;
        int i = 1;
        curr = head;
        while (i < start) {
            curr = curr.next;
            i++;
        }
        ListNode newHead = curr.next;
        curr.next = null;
        tail.next = head;
        return newHead;

    }
}
