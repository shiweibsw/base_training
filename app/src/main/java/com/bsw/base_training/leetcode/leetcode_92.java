package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/3/18-16:16
 * @Email shiweibsw@gmail.com
 * 给你单链表的头节点 head 和两个整数 left 和 right ，其中 left <= right 。请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。
 *  
 *
 * 示例 1：
 *
 *
 * 输入：head = [1,2,3,4,5], left = 2, right = 4
 * 输出：[1,4,3,2,5]
 * 示例 2：
 *
 * 输入：head = [5], left = 1, right = 1
 * 输出：[5]
 *  
 *
 * 提示：
 *
 * 链表中节点数目为 n
 * 1 <= n <= 500
 * -500 <= Node.val <= 500
 * 1 <= left <= right <= n
 *
 */
class leetcode_92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode solider = new ListNode(0, null);//哨兵
        ListNode p = solider;
        p.next = head;
        for (int i = 1; i < left; i++) {
            p = p.next;
        }
        ListNode curr = p.next;//第一个需要翻转的节点
        ListNode next = null;
        int size = right - left;
        while (size > 0) {
            next = curr.next;
            curr.next = next.next;
            next.next = p.next;
            p.next = next;
            size--;
        }
        return solider.next;
    }

}
