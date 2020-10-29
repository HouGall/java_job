package main.offer;

/*
输入一个链表，输出该链表中倒数第k个节点。
为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
例如，一个链表有6个节点，从头节点开始，它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。

 */
public class offer22 {
    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode res = head;
        int right = 0;
        ListNode temp = head;
        while (temp!=null && right<k){
            temp = temp.next;
            right++;
        }
        if (right<k)return null;
        while (temp!=null){
            res = res.next;
            temp = temp.next;
        }
        return res;
    }
}
