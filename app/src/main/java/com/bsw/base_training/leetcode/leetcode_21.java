package com.bsw.base_training.leetcode;

/**
 * 合并两个有序链表
 *
 * @Author shiwei
 * @Date 2020/11/11-19:23
 * @Email shiweibsw@gmail.com
 */
class leetcode_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode s = new ListNode(0, null);
        ListNode p = s;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
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
        return s.next;
    }
}
