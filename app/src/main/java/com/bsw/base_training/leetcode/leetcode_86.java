package com.bsw.base_training.leetcode;

/**
 * 给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
 * <p>
 * 你应当保留两个分区中每个节点的初始相对位置。
 * <p>
 *  
 * <p>
 * 示例:
 * <p>
 * 输入: head = 1->4->3->2->5->2, x = 3
 * 输出: 1->2->2->4->3->5
 *
 * @Author shiwei
 * @Date 2020/12/4-11:44
 * @Email shiweibsw@gmail.com
 */
class leetcode_86 {
    public ListNode partition(ListNode head, int x) {
        ListNode p = head;
        ListNode solider = new ListNode(0, null);
        ListNode t = solider;
        ListNode solider1 = new ListNode(0, null);
        ListNode q = solider1;
        while (p != null) {
            if (p.val < x) {
                t.next = new ListNode(p.val, null);
                t = t.next;
            } else {
                q.next = new ListNode(p.val, null);
                q = q.next;
            }
            p = p.next;
        }
        t.next = solider1.next;
        return solider.next;

    }
}
