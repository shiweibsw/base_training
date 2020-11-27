package com.bsw.base_training.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 * <p>
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 *
 * @Author shiwei
 * @Date 2020/11/13-14:15
 * @Email shiweibsw@gmail.com
 */
class leetcode_83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    /**
     * 进阶，如果是非排序的链表呢？
     * @param head
     * @return
     */
    public ListNode removeDuplicateNodes(ListNode head) {
        Map<Integer,Integer> cache=new HashMap<>();
        ListNode curr=head;
        ListNode pre=null;
        while(curr!=null){
            if(cache.get(curr.val)==null){
                cache.put(curr.val,1);
                pre=curr;
                curr=curr.next;
            }else{
                if(pre!=null){
                    curr=curr.next;
                    pre.next=curr;
                }
            }
        }
        return head;
    }
}


