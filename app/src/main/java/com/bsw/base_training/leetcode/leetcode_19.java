package com.bsw.base_training.leetcode;


/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * 示例：
 * <p>
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * <p>
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 *
 * @Author shiwei
 * @Date 2020/11/16-15:29
 * @Email shiweibsw@gmail.com
 */
public class leetcode_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        int i = 1;
        while (fast != null && i < n) {
            fast = fast.next;
            i++;
        }
        if (fast == null) return head;
        ListNode slow = head;
        ListNode pre = null;
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
}
