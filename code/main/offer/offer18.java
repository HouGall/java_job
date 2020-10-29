package main.offer;

/*
给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。

返回删除后的链表的头节点。

注意：此题对比原题有改动
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class offer18 {
    public static ListNode deleteNode(ListNode head, int val) {
        if (head==null) return null;
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode p = temp;
        while (p.next!=null){
            if (p.next.val==val){
                ListNode step = p.next;
                p.next = step.next;
            }
            if(p.next!=null)p = p.next;
        }
        return temp.next;
    }
}
