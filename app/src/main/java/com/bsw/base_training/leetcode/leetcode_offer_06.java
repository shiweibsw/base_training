package com.bsw.base_training.leetcode;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 *
 * 示例 1：
 *
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 *
 *
 *
 * @Author shiwei
 * @Date 2020/11/13-13:06
 * @Email shiweibsw@gmail.com
 */
class leetcode_offer_06 {

    public int[] reversePrint(ListNode head) {
        //堆栈解法
        // Stack<Integer> list = new Stack<Integer>();
        // ListNode curr = head;
        // while (curr != null) {
        //     list.push(curr.val);
        //     curr = curr.next;
        // }
        // int[] r = new int[list.size()];
        // int j = 0;
        // while (!list.isEmpty()) {
        //     r[j] = list.pop();
        //     j++;
        // }
        // return r;

        int len = 0;
        ListNode curr = head;
        while (curr != null) {
            len++;
            curr = curr.next;
        }
        int[] result = new int[len];
        curr = head;
        while (curr != null) {
            result[--len] = curr.val;
            curr = curr.next;
        }
        return result;
    }
}
