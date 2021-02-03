package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/2/3-16:05
 * @Email shiweibsw@gmail.com
 * 给你两个链表 list1 和 list2 ，它们包含的元素分别为 n 个和 m 个。
 * <p>
 * 请你将 list1 中第 a 个节点到第 b 个节点删除，并将list2 接在被删除节点的位置。
 * <p>
 * 下图中蓝色边和节点展示了操作后的结果：
 * <p>
 * <p>
 * 请你返回结果链表的头指针。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * 输入：list1 = [0,1,2,3,4,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
 * 输出：[0,1,2,1000000,1000001,1000002,5]
 * 解释：我们删除 list1 中第三和第四个节点，并将 list2 接在该位置。上图中蓝色的边和节点为答案链表。
 * 示例 2：
 * <p>
 * <p>
 * 输入：list1 = [0,1,2,3,4,5,6], a = 2, b = 5, list2 = [1000000,1000001,1000002,1000003,1000004]
 * 输出：[0,1,1000000,1000001,1000002,1000003,1000004,6]
 * 解释：上图中蓝色的边和节点为答案链表。
 *  
 * <p>
 * 提示：
 * <p>
 * 3 <= list1.length <= 104
 * 1 <= a <= b < list1.length - 1
 * 1 <= list2.length <= 104
 */
class leetcode_1669 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int index = 0;
        ListNode solider = new ListNode(0, list1);
        ListNode l1 = solider.next;
        ListNode preA = null;
        ListNode l2Tail = list2;//list2 的尾部节点
        while (l2Tail.next != null) {//找到list2的尾指针
            l2Tail = l2Tail.next;
        }
        while (l1.next != null) {
            if (index < a) {
                index++;
                preA = l1;
                l1 = l1.next;
            } else {
                if (index <= b) {
                    index++;
                    l1 = l1.next;
                } else {
                    break;
                }
            }
        }
        preA.next = list2;
        l2Tail.next = l1;
        return solider.next;
    }
}
