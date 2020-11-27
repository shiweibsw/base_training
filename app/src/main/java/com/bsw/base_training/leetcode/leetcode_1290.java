package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2020/11/13-13:28
 * @Email shiweibsw@gmail.com
 */
class leetcode_1290 {
    public int getDecimalValue(ListNode head) {
        int result = 0;
        ListNode curr = head;
        while (curr != null) {
            result=result*2+curr.val;
            curr = curr.next;
        }
        return result;
    }
}
