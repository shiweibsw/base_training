package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2022/3/1-16:36
 * @Email shiweibsw@gmail.com
 */
class leetcode_offer2_027 {
    public boolean isPalindrome(ListNode head) {
        StringBuilder sb=new StringBuilder();
        ListNode curr=head;
        while(curr!=null){
            sb.append(curr.val);
            curr=curr.next;
        }
        curr=reverse(head);
        int i=0;
        while(curr!=null){
            int d=Integer.parseInt(String.valueOf(sb.charAt(i)));
            if(d==curr.val){
                i++;
                curr=curr.next;
            }else{
                return false;
            }
        }
        return true;

    }
    private ListNode reverse(ListNode head){
        if(head==null) return null;
        ListNode curr=head,pre=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
