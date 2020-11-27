package com.bsw.base_training.leetcode;

/**
 * 输入两个链表，找出它们的第一个公共节点。
 *
 * @Author shiwei
 * @Date 2020/11/13-13:06
 * @Email shiweibsw@gmail.com
 */
class leetcode_offer_52 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode h1 = headA;
        ListNode h2 = headB;
        while (h1 != h2) {
            h1 = h1 == null ? h1 = headB : h1.next;
            h2 = h2 == null ? h2 = headA : h2.next;
        }
        return h1;
    }
}
